void setup()
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