package Zadania_podstawy;

    import java.util.*;

    public class LIS2 {

        static int lower_bound(int[] a, int len, int key) {  //znajduje najmniejszy element ktory jest wiekszy od a[i]
            int lo = -1;
            int hi = len;
            while (hi - lo > 1) {
                int mid = (lo + hi) / 2;
                int midVal = a[mid];

                if (midVal < key) {
                    lo = mid;
                } else {
                    hi = mid;
                }
            }
            return hi;
        }

        public static int[] lis(int[] a) {
            int n = a.length;
            int[] b = new int[n];
            int[] len = new int[n];

            int cnt = 0;
            for (int i = 0; i < n; i++) {

                int j = lower_bound(b, cnt, a[i]);


                if (j == cnt) ++cnt;  // jezeli numer indeksu jest taki jak osatniego


                b[j] = a[i]; //najmniejszy element zamieniam na a[i]

                len[i] = j + 1;




            }

            // reconstruct some LIS
            int[] res = new int[cnt]; //tablica wielkosci dlugosci najdluzszego podciagu
            for (int i = n - 1; i >= 0; i--){
                System.out.println(len[i]);
                System.out.println(cnt);
                System.out.println(a[i]);

                if (len[i] == cnt && (cnt == res.length || a[i] < res[cnt]))
                    res[--cnt] = a[i];
            }
            return res;
        }

        // random test
        public static void main(String[] args) {
            int[] a = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11,
                    7, 15 };
            int[] lis = lis(a);
            System.out.println(Arrays.toString(lis));

        }

    }
