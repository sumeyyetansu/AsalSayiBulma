public class Main {
    public static void main(String[] args) {

        boolean asalSayi=true;
        System.out.println("1-100 kadar olan asal sayılar");

        for(int i=2; i <= 100; i++){
            asalSayi=true;
            for (int j=2; j < i; j++){
                if(i % j == 0){
                    asalSayi=false;
                    break;
                }
            }
            if(asalSayi){
                System.out.println(i);
            }
        }
    }
}