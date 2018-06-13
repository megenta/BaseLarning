public class ThreeDData {

       private String [][][] cube;
       private String [] flat;
       private int x, y, z;
       
       public ThreeDData(int x, int y, int z) {
              cube = new String[x][y][z];
              flat = new String[x*y*z];
              this.x = x;
              this.y = y;
              this.z = z;
       }
       
       private void init() {
              System.out.println("X Size" + cube.length);   
              System.out.println("Y Size" + cube[0].length);
              System.out.println("Z Size" + cube[0][0].length);

              int f = 0;
              for(int x = 0; x <= 1 ; x++) {
                     for(int y = 0; y <= 2 ; y++) {
                           for(int z = 0; z <= 3 ; z++) {
                                  String address = x+"|"+y+"|"+z;                             
                                  flat[f] = address;
                                  System.out.println(address+" = "+f++);
                           }
                     }
              }
       }
       
       private void test() {
              for(int x = 0; x <= 1 ; x++) {
                     for(int y = 0; y <= 2 ; y++) {
                           for(int z = 0; z <= 3 ; z++) {
                                  String address = x+"|"+y+"|"+z;                             
                                  System.out.println(address+" = "+fetch(x,y,z));
                           }
                     }
              }
       }
       
       private String fetch(int x1, int y1, int z1) {
              int position = x1*y*z +y1*z+ z1;
              return flat[position] +" | "+ position;
       }
       
       public static void main(String[] args) {
              
       int x = 2;
       int y = 3;
       int z = 4;
       
       ThreeDData cube = new ThreeDData(x,y,z);
       cube.init();
       System.out.println("-----------------------");
       cube.test();
       }
}
