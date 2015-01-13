import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i = 0; i < lines.length; i++)
  {
    if (isPalindrome(lines[i]) == true)
    {
      println(lines[i] + " IS a palindrome.");
    } else
    {
      println(lines[i] + " is NOT a palindrome.");
    }
  }
}

public boolean isPalindrome(String word)
{
  String justLetters = "";
  word = word.toLowerCase();
  for (int i=0; i<word.length (); i++)
  {
    if (word.charAt(i) >= 97 && word.charAt(i) <= 122)
    {
      justLetters += word.charAt(i);
    }
  }
  for (int i=0; i<=word.length()/2; i++)
  {
    if(justLetters.charAt(i) != justLetters.charAt(justLetters.length()-1-i))
    {
      return false;
    }
  }
  return true;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
