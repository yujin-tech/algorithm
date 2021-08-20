package step11;

import java.io.*;
import java.util.Scanner;

public class Boj_1018 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = sc.nextInt();  //행
        int m = sc.nextInt();  //열

        char[][] board = new char[n][m];
        int pt = 0;
        String str;

        for(int i=0; i<n; i++) {
            str = br.readLine();
            for(int j=0; j<m; j++)
                board[i][j] = str.charAt(j);
        }

        char pre1 = board[0][0];
        char pre2 = board[0][7];

        int i=0, j=1;
        int ptX = 0, ptY = 0;
        int moveX = 0, moveY = 0;
        int cnt1=0, cnt2=0;
        int min;

    /*    while(pt != d){

            if(moveX == 8) {
                ptY = i;
                i++;
                moveY++; //행 증가
                if(moveY == 8) {
                    if(cnt1 < cnt2)
                        min = cnt1;
                    else
                        min = cnt2;
                    break;
                }
                moveX = 0;
              //  j = ;  //열 초기화

              //  if(board[i][] == board[i-1][j])
                    pre1 = board[i][0];
            }
            else {
                moveX++;
                if (board[i][j] == pre1) {
                    cnt1++;
                    if(pre1 == 'W')
                        pre1 = 'B';
                    else
                        pre1 = 'W';
                }
                if (board[i][6-j] == pre2) {
                    cnt2++;
                    if(pre2 == 'W')
                        pre2 = 'B';
                    else
                        pre2 = 'W';
                }
                j++;
                ptX = j;
            }
        }

        int[][] change1 = new int[n][m];
        int[][] change2 = new int[n][m];
        int cnt = 0;*/

      /*  for(y)

        int cnt1 = 0, cnt2 = 0;
        int min = 0;

        for(int i=0; i+8<=n; i++) {
            for(int j=0; j+8<=m; j++) {
                cnt1 = block(i, j, board1);
                cnt2 = block(i, j, board2);

                if(cnt1 < cnt2)
                    min = cnt1;
                else
                    min = cnt2;
            }
        }

        System.out.println(min);*/
    }

    static int block(int y, int x, char[][] board) {
        int cnt = 0;
        char preX = board[y][x];
        char preY = board[y][x];

        for(int i=y; i<y+8; y++){
            if(i != y && preY == board[i][x])
                preY = board[i][x];

            for(int j=x+1; j<x+8; j++){
                if (board[i][j] == board[i][j-1]) {
                    cnt++;
                    if (board[i][j] == preX){
                        if(preX == 'B')
                            preX = 'W';
                        else
                            preX = 'B';
                    }
                }
            }
        }

        return cnt;
    }
}
