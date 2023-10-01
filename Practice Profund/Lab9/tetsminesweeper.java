import java.util.Arrays;
public class tetsminesweeper {
    public static void main(String[] args) {
        q3_markTheBomb();
    }
    static void q3_markTheBomb() {
        int[][] map = { { 0, 0, 9, 9, 9, 0, 0, 9, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            // { 0, 9, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0 },
            // { 0, 9, 0, 0, 9, 9, 0, 0, 9, 0, 9, 0, 0 },
            // { 0, 9, 0, 0, 9, 9, 0, 0, 9, 9, 9, 0, 0 }, 
            // { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0 },
            // { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
            // { 0, 0, 0, 0, 0, 0, 0, 9, 9, 0, 0, 0, 0 }
        };
        int[][] map2 = new int[map.length][map[0].length];
        int row = 0;
        int col = 0;
        initialMap2(map, map2);
        markTheBomb(map2);
        for (row = 0; row < map2.length; row++) {
            System.out.println(Arrays.toString(map[row]) + "\t" + Arrays.toString(map2[row]));
        }
    }

    static void initialMap2(int[][] map, int[][] map2) {
        int row = 0;
        int col = 0;
        for (row = 0; row < map.length; row++) {
            for (col = 0; col < map[0].length; col++) {
                map2[row][col] = map[row][col];
            }
        }
    }

    static void markTheBomb(int[][] map2) {
        /* your code */
        int bomb = 0;
        for (int row = 0; row < map2.length; row++){
            for (int col = 0; col < map2[0].length - 1; col++){
                if (col > 0 && map2[row][col] == 9 && map2[row][col - 1] == 9 && map2[row][col + 1] == 9){
                    map2[row + 1][col] += 1;
                    map2[row + 1][col + 1] += 1;
                    map2[row + 1][col - 1] += 1;
                }
                if (col > 0 && map2[row][col] == 9 &&){
                    map2[row][col - 1] += 1;
                    map2[row][col + 1] += 1;
                }
            }
        }
    }
}
