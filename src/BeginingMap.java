public class BeginingMap {

    public String[][] a = new String[4][4];
    public int Pi = 3;
    public int Pj = 0;
    public int Ki = 1;
    public int Kj = 2;
    public int Ei = 2;
    public int Ej = 3;

    public BeginingMap() {
        for (int i = 0; i <= 3; i++){
            for (int j = 0; j <= 3; j++){
                if (i == Pi && j == Pj){
                    a[i][j] = "P";
                } else if (i == Ki && j == Kj){
                    a[i][j] = "K";
                } else if (i == Ei && j == Ej){
                    a[i][j] = "E";
                } else {
                    a[i][j] = "-";
                }
            }
        }
        showMap(a);
    }

    public void showMap(String a[][]){
        for (int i = 0; i <= 3; i++){
            for (int j = 0; j <= 3; j++){
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
