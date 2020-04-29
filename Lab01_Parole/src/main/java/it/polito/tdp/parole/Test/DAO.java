package it.polito.tdp.parole.Test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	public List<String> getWords(){

		String sql = "SELECT nome FROM parola WHERE nome LIKE 'C%'";
		
		ArrayList<String> wordList = new ArrayList<>();
		
		try {
			
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			
			ResultSet res = st.executeQuery() ;
			
			while(res.next()) {
				wordList.add(res.getString("nome"));
			}
			
			return wordList;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}