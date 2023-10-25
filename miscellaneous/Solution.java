package miscellaneous;

public class Solution {
    public String getStringFromArray(String[] a){
        int row = 0, col = 0;
    StringBuilder stringBuilder = new StringBuilder();
    while(true){
        if(col <= a[row].length()){
            stringBuilder.append(a[row].charAt(col));
            col++;
            if(col == a[row].length()){
                row++;
                col = 0;
                if(row == a.length){
                    break;
                }
            }
        }
    }
    return stringBuilder.toString();
    }
}
