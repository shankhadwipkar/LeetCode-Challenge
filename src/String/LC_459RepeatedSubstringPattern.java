package String;

public class LC_459RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s="MADAM";
        System.out.println(repeatedSubstringPattern(s));
    }
    static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = n / 2; i >= 1; i--) {
            if(n%i==0){
                String substrs=s.substring(0,i);
                StringBuilder newstr=new StringBuilder();
                for(int j=1;j<=n/i;j++){
                    newstr.append(substrs);
                    if(newstr.toString().equals(s))
                        return true;
                }
            }
        }
        return false;
    }
}
