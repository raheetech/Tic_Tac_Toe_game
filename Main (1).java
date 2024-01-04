/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    char[][] board = new char[3][3];
	    for(int row = 0; row<board.length;row++)
	    {
	        for(int col = 0 ; col<board[row].length;col++)
	        {
	            board[row][col]= ' ';
	        }
	    }
	    char player = 'X';
	    boolean gameover = false;
	    Scanner sc = new Scanner(System.in);
	    while(!gameover)
	    {
	        printboard(board);
	        System.out.println("Player" + " "+ player+ " " + "enter: ");
	        int row = sc.nextInt();
	        int col = sc.nextInt();
	        if(row >= 0 && row < board.length && col >= 0 && col < board[row].length && board[row][col] == ' ')
	        {
	            board[row][col] = player;
	            gameover = havewon(board,player);
	            if(gameover)
	            {
	                System.out.println("Player" + " "+ player+ " " + "has won: ");
	            }
	            else{
	                if(player == 'X')
	                {
	                    player = '0';
	                }
	                else{
	                    player = 'X';
	                }
	            }
	            
	        }
	        else{
	            System.out.println("Invalid move. Try again!");
	        }
	        
	    }
	    printboard(board);
	
	}
		public static boolean havewon(char[][] board,char player)
	{
	     for(int row = 0; row<board.length;row++)
	    {
	    if(board[row][0] == player && board[row][1] == player && board[row][2] == player )
	    {
	        return true;
	    }
	    }
	     for(int col = 0 ; col<board[0].length;col++)
	        {
	            if(board[0][col] == player && board[1][col] == player && board[0][col] == player )
	    {
	        return true;
	    }
	        }
	        
	        
	        
	        
	            if(board[0][0] == player && board[1][1] == player && board[2][2] == player )
	    {
	        return true;
	    }
	        
	            if(board[0][2] == player && board[1][1] == player && board[2][0] == player )
	    {
	        return true;
	    }
	        
	        
	    return false;
	}
	public static void printboard(char[][] board)
	{
	     for(int row = 0; row<board.length;row++)
	    {
	        for(int col = 0 ; col<board[row].length;col++)
	        {
	           System.out.print(board[row][col] + " | ");
	        }
	        System.out.println();
	    }
	}
}
