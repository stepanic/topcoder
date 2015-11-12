public class Reppity {
    public int longestRep (String s) {
        int n = 0;
        String t;
        String[] a;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                t = s.substring(i,j);
                a = s.split(t);

                if (a.length > 2) {
                    if (n < t.length()) {
                        n = t.length();

                        System.out.print(t.length());
                        System.out.print(" ");
                        System.out.print(a.length);
                        System.out.print(" ");
                        System.out.print(t);
                        System.out.println();
                    }
                }
            }
        }

        return n;
    }
}