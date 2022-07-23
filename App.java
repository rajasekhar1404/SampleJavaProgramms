public class App{
    public static void main(String[] args) {

    String qus = "MMXXII"; //2022 LDXC

     Solution s1 = new Solution();
     System.out.println(s1.romanToInt(qus)); 
    }
}

class Solution {
    public int romanToInt(String s) {
        int result = 0;

        for(int j = 0; j<s.length(); j++){
            char letter = s.charAt(j);
            char nextLetter = ' ';
            if(s.length()-1 != j){
                nextLetter = s.charAt(j+1);
            }

            if(letter == 'I') {
                if(nextLetter == 'V'){
                    result += 4;
                    j++;
                } else if(nextLetter == 'X'){
                    result += 9;
                    j++;
                } else{
                    result += 1;   
                }
            }
            else if(letter == 'V') {
                result += 5;
            }
            else if(letter == 'X') {
                if(nextLetter == 'L'){
                    result += 40;
                    j++;
                } else if(nextLetter == 'C'){
                    result += 90;
                    j++;
                } else{
                    result += 10;   
                }
            }
            else if(letter == 'L') {
                result += 50;
            }
            else if(letter == 'C') {
                if(nextLetter == 'D'){
                    result += 400;
                    j++;
                } else if(nextLetter == 'M'){
                    result += 900;
                    j++;
                } else{
                    result += 100;
                }
            }
            else if(letter == 'D') {
                result += 500;
            }
            else if(letter == 'M') {
                result += 1000;
            }
        }
        return result;
    }
}
