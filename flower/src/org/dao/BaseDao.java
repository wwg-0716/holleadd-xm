package org.dao;

import java.sql.*;

public class BaseDao {
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/flowerDB";
	private String user="root";
	private String pass="123456";
	Connection conn=null;
	
	//������ݿ�����?
	public Connection getConnection(){
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//�ر���ݿ�?
	public void CloseAll(Connection conn,PreparedStatement pstmt,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt!=null){
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/**
	 * ����ɾ����  ͨ��
	 * @param preparedSql
	 * @param param
	 * @return
	 */
	public int exceuteUpdate(String preparedSql,Object...param){
		PreparedStatement pstmt=null;
		int num=0;
		conn=getConnection();
		try {
			pstmt=conn.prepareStatement(preparedSql);
			if(param!=null){
				for(int i=0;i<param.length;i++){
					//ΪԤ����sql���ò���
					pstmt.setObject(i+1, param[i]);
				}
			}
			num=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			CloseAll(conn,pstmt,null);
		}
		return num;
	}
	
	/**
	 * ��ѯͨ��
	 * @param preparedSql
	 * @param param
	 * @return
	 */
	public ResultSet exceuteQuery(String preparedSql,Object...param){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		conn=getConnection();
		try {
			pstmt=conn.prepareStatement(preparedSql);
			if(param!=null){
				for(int i=0;i<param.length;i++){
					//ΪԤ����sql���ò���
					pstmt.setObject(i+1, param[i]);
				}
			}
			rs=pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
