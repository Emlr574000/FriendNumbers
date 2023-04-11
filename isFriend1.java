public class isFriend1 {
    public int isfriend1(int x) {
        int a = x;
        int toplam = 0;
        for (int i = 1; i < x; i++) {

            if (x % i == 0) {
                toplam += i;
            }
        }
        return toplam;
    }
}
