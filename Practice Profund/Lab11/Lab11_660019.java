import java.util.Arrays;

public class Lab11_660019 {
    public static void main(String[] args) {
        q1();
        q2();
        q3();
    }
    static void q1(){
        int [][] map = { {0, 1, 9, 1, 0, 0, 2, 9, 4, 2, 1, 0, 0}, 
                        { 1, 3, 3, 3, 1, 1, 2, 9, 9, 9, 1, 0, 0}, 
                        { 2, 9, 9, 3, 9, 3, 2, 3, 4, 4, 2, 1, 0}, 
                        { 3, 9, 4, 4, 9, 9, 2, 2, 9, 5, 9, 2, 0}, 
                        { 2, 9, 2, 2, 9, 9, 2, 2, 9, 9, 9, 3, 0}, 
                        { 1, 1, 1, 1, 2, 2, 2, 3, 5, 6, 9, 2, 0}, 
                        { 0, 0, 0, 0, 0, 0, 2, 9, 9, 9, 2, 1, 0}, 
                        { 0, 0, 0, 0, 0, 0, 2, 9, 9, 3, 1, 0, 0} 
                    };
        int ans = let_s_count(map);
        System.out.println(ans);
        
    }
    static int let_s_count(int [][] map){
        int cnt = 0;
        for (int row = 0; row < map.length; row++){
            for (int col = 0; col < map[0].length; col++){
                if (map[row][col] == 9){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    static void q2(){
        int [][] a = {{1,2,3}, {4,5,6}};
        int [][] t = transpose(a);
        for (int [] row : t){
            System.out.println(Arrays.toString(row));
        }
    }
    static int [][] transpose(int [][] data){
        int [][] ans = new int [data[0].length][data.length];
        for (int row = 0; row < data.length; row++){
            for (int col = 0; col < data[0].length; col++){
                ans[col][row] = data[row][col];
            }
        }
        return ans;
    }
    static void q3(){
        int [] team_id = {22,11,33,44,32};
        int [] points = {88,99,77,66,70};
        by_points(team_id , points);
    }
    static void by_points(int [] teams , int [] points){
        
        for (int i = 0; i < points.length - 1 ; i++){
            if (points[i + 1] > points[i]){
                int tmp = points[i];
                int memteam = teams[i];
                points[i] = points[i + 1];
                points[i + 1] = tmp;
                teams[i] = teams[i + 1];
                teams[i + 1] = memteam;
            }
        }
        for (int i = 0; i < teams.length; i++){
            System.out.print(teams[i] + "," + points[i]);
            System.out.println();
        }
        // for (int row = 0; row < (ans.length - 1) / 2; row++){
        //     for (int col = 0; col < ans[0].length - 1; col++){
        //         if (ans[row + 1][col + 1] > ans[row][col + 1]){
        //             int [] tmp = ans[row];
        //             ans[row] = ans[row + 1];
        //             ans[row + 1] = tmp;
        //         }
        //     }
        // }
    }
}
