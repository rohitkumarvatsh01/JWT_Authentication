package com.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JwtResponse {
	private String usernamer;
	private String jwttoken;
	
	public String getUsernamer() {
		return usernamer;
	}
	public void setUsernamer(String usernamer) {
		this.usernamer = usernamer;
	}
	public String getJwttoken() {
		return jwttoken;
	}
	public void setJwttoken(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	
	
}
