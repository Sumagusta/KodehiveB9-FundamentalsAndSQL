package com.project.day9.consoledb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ConnectionDB conn = new ConnectionDB();
		
		Class.forName(conn.jdbc);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kode Mahasiswa : ");
		String kd_mhs = sc.nextLine();
		
		System.out.println("Nama Mahasiswa : ");
		String nm_mhs = sc.nextLine();
		
		System.out.println("Usia : ");
		String usia = sc.nextLine();
		
		System.out.println("SPP : ");
		String spp = sc.nextLine();
		
		Connection con = DriverManager.getConnection(conn.url, conn.user, conn.password);
		
		String sql = "insert into mahasiswa (kd_mhs, nm_mhs, usia, spp) values (?,?,?,?)";
		
		PreparedStatement state = con.prepareStatement(sql); // DDL
		
		// DML = Statement
		
		// sett values
		state.setString(1, kd_mhs);
		state.setString(2, nm_mhs);
		state.setInt(3, Integer.valueOf(usia));
		state.setInt(4, Integer.valueOf(spp));
		
		state.executeUpdate();
		
		System.out.println("Insert Complete");
	}

}
