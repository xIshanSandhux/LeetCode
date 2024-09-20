import java.util.Stack;
public class test {

    public static String simplifyPath(String path) {
        String r = "/";
        Stack<Character> stack = new Stack<>();
        

        for(int i=1;i<path.length()-1;i++){
            if(r.charAt(r.length()-1)!='/' && path.charAt(i)=='/'){
                r = r+path.charAt(i);
            }else if(path.charAt(i)!='/'){
                r = r+path.charAt(i);
            }
            

        }

        

        return r;
    }

    public static String decodeString(String s) {
        
        return "";
    }

    public static void main(String[] args){
        System.out.println(simplifyPath("/home//foo/"));
    }
}
