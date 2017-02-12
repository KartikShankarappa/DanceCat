package com.kartik;

import java.util.Random;

public class DanceCat {
	
    private static final String[] POTENTIAL_NAMES = new String[] {
        "Kartik", "Ria", "Nicola", "Brad", "John", "Katrina"
    };
    
    private static final Random RANDOM = new Random();
    
	/**
	 * This method returns the computer level
	 * @return the computer level between 0 and 100
	 */
	public static int getComputerLevel()
	{
		int value = RANDOM.nextInt(100);
		return value;
	}
	
	/**
	 * This method will return a random name from the POTENTIAL_NAMES variable
	 * @return a random name
	 */
	public static String getRandomName()
	{
        String name;
        int index = RANDOM.nextInt(POTENTIAL_NAMES.length);
        name = POTENTIAL_NAMES[index];
		return name;
	}
	
	/**
	 * This method parses the given string to form a String array
	 * @param unparsedMoves the unparsed moves
	 * @return the string array containing the parsed moves
	 */
	private static String[] parseString(String unparsedMoves)
	{
		String[] moves = new String[18];
		int i;
		for (i = 0; i < unparsedMoves.length(); i++)
		{
			moves[i] = Character.toString(unparsedMoves.charAt(i));
		}
		
		for (int j = i; j < 18; j++)
		{
			moves[j] = "";
		}
		return moves;
	}
	
	/**
	 * This method creates DanceMove objects
	 * @param moves
	 * @param idealMoves
	 * @return returns the DanceMove objects 
	 */
	private static DanceMove[] createObjects(String[] moves, String[] idealMoves)
	{
		DanceMove[] danceMove = new DanceMove[moves.length];
		
		for(int i = 0; i < danceMove.length; i++)
		{
			danceMove[i] = new DanceMove(moves[i], idealMoves[i]);
		}
		
		return danceMove;
	}
	
	private String name;
	private DanceMove[] danceMoves;
	
	
	public DanceCat (String unparsedMoves, String[] idealMoves)
	{
		this(DanceCat.parseString(unparsedMoves), idealMoves);
	}
	
	public DanceCat (String[] moves, String[] idealMoves)
	{
		this(createObjects(moves, idealMoves));
	}
	
	public DanceCat (DanceMove[] danceMoves)
	{
		this(getRandomName(), danceMoves);
	}
	
	public DanceCat (String name, DanceMove[] danceMoves)
	{
		this.name = name;
		this.danceMoves = danceMoves;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public DanceMove[] getDanceMoves()
	{
		return this.danceMoves;
	}
	
	public int getNumberOfCorrectMoves()
	{
		int count = 0;
		
		for(int i = 0; i < danceMoves.length; i++)
		{
			if (danceMoves[i].correctMove() == true)
			{
				count++;
			}
		}
		
		return count;
	}

}
