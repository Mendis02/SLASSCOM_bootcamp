public class Challenge2_0 {
    public boolean isValid(String s){
        int length= s.length();
        boolean bracketIsClosed = false;
        while (length>0){
            if (s.contains("()") || s.contains("{}") || s.contains("[]")) {
                s = s.replace("{}", "");
                s = s.replace("[]", "");
                s = s.replace("()", "");
            }else{
                break;
            }
            length = s.length();
        }

        if (length == 0){
            bracketIsClosed = true;
            return bracketIsClosed ;
        }else{
            return bracketIsClosed;
        }
    }

    public static void main(String[] args) {
        Challenge2_0 obj = new Challenge2_0();
        boolean tm = obj.isValid("");
        System.out.println(tm);
    }
}
