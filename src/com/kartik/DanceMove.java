package com.kartik;

public class DanceMove {
	
	private String idealMove;
	private String userMove;
	
	public DanceMove (String idealMove, String userMove)
	{
		this.idealMove = idealMove;
		this.userMove = userMove;
	}
	
	public String getIdealMove()
	{
		return idealMove;
	}
	
	public String getUserMove()
	{
		return userMove;
	}
	
	public boolean correctMove()
	{
		if(this.idealMove.equalsIgnoreCase(this.userMove))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
