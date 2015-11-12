public class RedSquare {
    public int countTheEmptyReds(int maxRank, int maxFile, int[] rank, int[] file) {
        int r = 0;
        boolean c;

        for (int i = 1; i <= maxFile; i++) {
            for (int j = 1; j <= maxRank; j++) {
                if (maxFile % 2 == 0) {
                    if ( (i+j) % 2 == 0) {
                        c = false;
                        for (int k = 0; k < file.length; k++) {
                            if (i == file[k] && j == rank[k]) {
                                c = true;
                                break;
                            }
                        }
                        if (!c) {
                            r++;
                        }
                    }
                } else {
                    if ( (i+j) % 2 == 1) {
                        c = false;
                        for (int k = 0; k < file.length; k++) {
                            if (i == file[k] && j == rank[k]) {
                                c = true;
                                break;
                            }
                        }
                        if (!c) {
                            r++;
                        }
                    }
                }
            }
        }

        return r;
    }
}