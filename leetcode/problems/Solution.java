package leetcode.problems;

import java.util.*;

/*
this class will hold the methods for solving leet-code problems
 one method for one leet-code solutions
 these methods will be called from Dispatcher class.
*/
public class Solution {
    ListNode h, t;

    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> n = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            n.put(heights[i], names[i]);
        }
        return names;
    }

    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        String s1 = word.substring(0, idx + 1);
        StringBuilder s2 = new StringBuilder(s1);
        String s3 = s2.reverse().toString();
        String s4 = s3 + word.substring(idx + 1, word.length());
        return s4;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return h;
        } else {
            reverseList(head.next);
            if (t == null) {
                t = h = new ListNode(head.val);
            } else {
                t.next = new ListNode(head.val);
                t = t.next;
            }
        }
        return h;
        //Runtime
        //0
        //ms
        //Beats
        //100.00% of users with Java
        //Memory
        //41.29
        //MB
        //Beats
        //55.25%
        //of users with Java
    }

    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pat : patterns) {
            if (word.contains(pat)) {
                count++;
            }
        }
        return count;
        //submitted at Dec 05, 2023 20:18
        //Solution
        //Runtime
        //0
        //ms
        //Beats
        //100.00%
        //of users with Java
        //Memory
        //41.14
        //MB
        //Beats
        //31.21%
        //of users with Java

    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] mc = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        List<String> uniqueElements = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                stringBuilder.append(mc[(words[i].charAt(j) - 'a')]);
            }
            if (!uniqueElements.contains(stringBuilder.toString())) {
                count++;
                uniqueElements.add(stringBuilder.toString());
            }
            stringBuilder.setLength(0);
        }
        return uniqueElements.size();
        //https://leetcode.com/problems/unique-morse-code-words/description/
        //Runtime
        //Details
        //2ms
        //Beats 90.14%of users with Java
        //Memory
        //Details
        //40.32MB
        //Beats 64.86%of users with Java
        //submitted at Oct 26, 2023 11:06
    }

    public List<String> cellsInRange(String s) {
        String firstHalf = s.substring(0, s.indexOf(":"));
        String secondHalf = s.substring(s.indexOf(":") + 1);
        List<String> cells = new ArrayList<>();
        char c1 = s.charAt(0), c2 = s.charAt(3);
        int n1 = s.charAt(1) - '0', n2 = s.charAt(4) - '0';
        for (char ch = c1; ch <= c2; ch++) {
            for (int i = n1; i <= n2; i++) {
                cells.add(ch + "" + i);
            }
        }
        return cells;
        //https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/description/
        //Runtime
        //Details
        //5ms
        //Beats 71.81%of users with Java
        //Memory
        //Details
        //43.78MB
        //Beats 68.07%of users with Java
        //kajanauday
        //submitted at Oct 25, 2023 17:27
    }

    public String toLowerCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') ? (char) (s.charAt(i) + 32) : s.charAt(i));
        }
        return stringBuilder.toString();
        //without toLowerCase() method.
        //Runtime
        //Details
        //1ms
        //Beats 19.20%of users with Java
        //Memory
        //Details
        //40.72MB
        //Beats 25.93%of users with Java
        //https://leetcode.com/problems/to-lower-case/description/
    }

    public boolean isAcronym(List<String> words, String s) {
        if (s.length() == words.size()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != words.get(i).charAt(0))
                    return false;
            }
            return true;
        }
        return false;
        //Runtime
        //Details
        //1ms
        //Beats 100.00%of users with Java
        //Memory
        //Details
        //43.72MB
        //Beats 32.46%of users with Java
        //https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/
    }

    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == '\n') {
                for (int j = i; j >= index; j--) {
                    stringBuilder.append(s.charAt(j));
                }
                index = i;
            }
        }
        for (int j = s.length() - 1; j >= index; j--) {
            System.out.println(s.charAt(j));
        }
        return stringBuilder.toString();
        //Runtime
        //Details
        //7ms
        //Beats 56.14%of users with Java
        //Memory
        //Details
        //44.19MB
        //Beats 56.17%of users with Java
        //https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
    }

    public boolean checkIfPangram(String sentence) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (!sentence.contains(i + "")) {
                return false;
            }
        }
        return true;
        //Runtime
        //Details
        //1ms
        //Beats 85.29%of users with Java
        //Memory
        //Details
        //40.15MB
        //Beats 94.11%of users with Java
        //https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
    }

    public String sortSentence(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        TreeMap<String, String> sortedMap = new TreeMap<>();
        int j = 0, last = 0;
        String key = "", value = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                j = i;
                while (i < s.length() - 1 && s.charAt(i) != ' ' && s.charAt(i) != '\n') {
                    i++;
                }
                sortedMap.put(s.substring(j, i + 1), s.substring(last, j));
                last = i + 1;
            }
        }
        String[] keys = sortedMap.keySet().toArray(new String[0]);
        for (int i = 0; i < keys.length; i++) {
            stringBuilder.append(sortedMap.get(keys[i])).append((i == keys.length - 1) ? "" : " ");
        }
        return stringBuilder.toString();
        //Runtime
        //Details
        //1ms
        //Beats 59.46%of users with Java
        //Memory
        //Details
        //39.76MB
        //Beats 99.43%of users with Java
        //https://leetcode.com/problems/sorting-the-sentence/description/
    }

    public int balancedStringSplit(String s) {
        int R = 0, L = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L')
                L++;
            else
                R++;
        }
        int charCount = (L + R) / 2;

        return 0;
    }

    public String decodeMessage(String key, String message) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder keys = new StringBuilder();
        StringBuilder values = new StringBuilder();
        Map<Character, Character> intCharMap = new HashMap<>();
        intCharMap.put(' ', ' ');
        char ascci_num = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (!intCharMap.containsKey(key.charAt(i))) {
                if (key.charAt(i) >= 'a' && key.charAt(i) <= 'z')
                    intCharMap.put(key.charAt(i), ascci_num++);
            }
        }
        for (int i = 0; i < message.length(); i++)
            stringBuilder.append(intCharMap.get(message.charAt(i)));
        return stringBuilder.toString();
        //Runtime
        //Details
        //7ms
        //Beats 70.79%of users with Java
        //Memory
        //Details
        //42.41MB
        //Beats 83.08%of users with Java
        //https://leetcode.com/problems/decode-the-message/description/
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for (String s : word1) {
            sb.append(s);
        }
        StringBuilder SB = new StringBuilder();
        for (String s : word2) {
            SB.append(s);
        }
        return sb.toString().contentEquals(SB);
    }

    public String truncateSentence(String s, int k) {
        int count = 0, i = 0;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    break;
                }
            }
        }
        //Runtime
        //Details
        //0ms
        //Beats 100.00%of users with Java
        //Memory
        //Details
        //40.76MB
        //Beats 62.56%of users with Java
        //https://leetcode.com/problems/truncate-sentence/
        return s.substring(0, i);
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, index = -1;
        if (ruleKey.equals("type"))
            index = 0;
        else if (ruleKey.equals("color"))
            index = 1;
        else
            index = 2;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        //(CMT) 99.45% , 87.55% , 3ms , https://leetcode.com/problems/count-items-matching-a-rule/
        return count;
    }

    public int mostWordsFound(String[] sentences)   {
        int index = -1;
        int count = 0;
        int maxCount = -1;
        for (int i = 0; i < sentences.length; i++) {
            do {
                index = sentences[i].substring(index + 1).indexOf(" ");
                if (index > -1)
                    count++;
            } while (index > -1);
            if (maxCount <= count)
                maxCount = count;
            count = 0;
        }
        return maxCount;
    }

    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G' || command.charAt(i) == 'a' || command.charAt(i) == 'l') {
                sb.append(command.charAt(i));
            } else if (command.charAt(i) == '(' && i != command.length() - 1 && command.charAt(i + 1) == ')') {
                sb.append('o');

            }
        }
//        Runtime    1ms Beats 66.00%of users with Java
//        Memory 40.11MB Beats 93.14%of users with Java
//        https://leetcode.com/problems/goal-parser-interpretation
        return String.valueOf(sb);
    }

    public void rotateArray(int[][] a, int k) {
        k = k % 4;
        int[][] b = new int[a[0].length][a.length];
        System.out.println("leetcode.problems.Solution.rotateArray");
        System.out.println(a.length + " " + a[0].length);
        System.out.println(k);
        while (k-- > 0) {
            for (int i = 0; i < a[0].length; i++) {
                for (int j = a.length - 1; j >= 0; j--) {
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
            }
        }//https://leetcode.com/problems/rotate-array/description/
    }

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '-')
                x--;
            else
                x++;
        }
        return x; //https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
    }

    public String defangIPaddr(String address) {
        int last = 0;
        StringBuilder finalString = new StringBuilder();
        StringBuilder add = new StringBuilder(address);
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                finalString.append(add.substring(last, i)).append("[.]");
                last = i + 1;
            }
        }
        finalString.append(add.substring(last));
        return String.valueOf(finalString); //https://leetcode.com/problems/defanging-an-ip-address/
    }

    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : jewels.toCharArray())
            map.put(i, 0);
        for (char i : stones.toCharArray())
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
        int sum = 0;
        for (int i : map.values())
            sum = sum + i;
        return sum;//https://leetcode.com/problems/jewels-and-stones/
    }

}