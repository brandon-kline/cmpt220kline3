/**
  * file: Location.java
  * author: Brandon Kline
  * course: CMPT 220
  * assignment: Final Project
  * due date: May 9, 2017
  * version: 1.0
  * 
  */
  
/**
  * Location
  * 
  * This class stores all of the locations and puzzle
  *  variables for the game.
  */

public class Location {
  public int locnum;
  int beach;
  int jun_o;
  int jun_i;
  int mtn_b;
  int mtn_h;
  int mtn_c1;
  int mtn_c2;
  int mtn_c3;
  int mtn_s;
  int shore;
  boolean puz1;
  boolean puz2;
  boolean puz3;
  boolean puz4;
  boolean puz5;	
  public void beach() {
    int locnum = 1;
	boolean havePuz = false;
	}
  public void jun_o() {
	int locnum = 2;
	boolean havePuz = true;
	}
  public void jun_i() {
	int locnum = 3;
	boolean havePuz = true;
	}
  public void mtn_b() {
	int locnum = 4;
	boolean havePuz = true;
	}
  public void mtn_h() {
    int locnum = 5;
	boolean havePuz = false;
	}
  public void mtn_c1() {
    int locnum = 6;
	boolean havePuz = true;
	}
  public void mtn_c2() {
    int locnum = 7;
	boolean havePuz = false;
	}
  public void mtn_c3() {
	int locnum = 8;
	boolean havePuz = false;
	}
  public void mtn_s() {
    int locnum = 9;
	boolean havePuz = false;
	}
  public void shore() {
	int locnum = 10;
	boolean havePuz = true;
	}
  public void puz1() {
	boolean puzSolved = false;
	}
  public void puz2() {
	boolean puzSolved = false;
	}
  public void puz3() {
	boolean puzSolved = false;
	}
  public void puz4() {
	boolean puzSolved = false;
	}
  public void puz5() {
	boolean puzSolved = false;
	}
  }