package leetcode.problems;

import java.util.Scanner;

//this class will call the method which solves a leet-code problem
public class Dispatcher {
    public static void main(String[] args){
        Scanner scanner;
        Solution solution   = new Solution();
        Toolkit toolkit = new Toolkit();
        System.out.println(solution.reversePrefix("abcdefgh",'g'));
        //System.out.println(solution.numOfStrings(new String[]{},""));
        //System.out.println(solution.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
        //solution.cellsInRange("A1:F1");
        //System.out.println(solution.toLowerCase("Hi ALL HOw ArE You"));
        //System.out.println(solution.isAcronym());
        //System.out.println(solution.reverseWords("Let's take LeetCode contest"));
        //System.out.println(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        //System.out.println(solution.sortSentence("Myself2 Me1 I4 and3"));
        //System.out.println(solution.arrayStringsAreEqual(new String[]{"ab", "cd"},new String[]{"ab", "cd"}));
        //System.out.println(solution.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
        //System.out.println(solution.interpret("(al)G(al)()()G"));
        //System.out.println(solution.defangIPaddr("1.1.1.1"));
        //solution.rotateArray(toolkit.sequentialIntegerArray(16,5),2); //this method will rotate array in clock wise direction by n times//
    }
}

