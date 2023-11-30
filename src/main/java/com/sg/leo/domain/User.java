package com.sg.leo.domain;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="USERSTEST")
public class User{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column( length=50, unique=true)
	private String username;
	
	@Column(length=100)
	private String password;
	
	@Column(length=120)
	private String email;
	
	@Enumerated(EnumType.STRING)
	private RoleType role;
	
	@CreationTimestamp
	private Timestamp createDate;
}




// 옛날 User file, DAO를 위하여 수정함
// 2023.11.6
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//
//public class User {
//	private int id;
//	private String username;
//	private String pasword;
//	private String email;
//}
