public class permute {
    public static void permute(String str, String ans) {
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);//ch = a, ch = b,
            String rest = str.substring(0, i) + str.substring(i + 1);// rest = bc, rest = c
            permute(rest, ans + ch);//permute(bc, a), permute(c, b)
        }
    }
}
