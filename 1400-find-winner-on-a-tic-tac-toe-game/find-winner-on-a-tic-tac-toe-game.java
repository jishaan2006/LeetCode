class Solution {
    public String tictactoe(int[][] moves) {
         char[][] board = new char[3][3];
        int k = 0;
        for (int i = 0; i < moves.length; i++) {
            if (k++ % 2 == 0) {
                board[moves[i][0]][moves[i][1]] = 'X';
            } else {
                board[moves[i][0]][moves[i][1]] = 'O';
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        char win='\0';
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                win = board[i][0];
            } else if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                win = board[0][i];
            } else if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
                win = board[1][1];
            } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
                win = board[1][1];
            }
        }
        if (win == 'X') {
            return "A";
        } else if (win == 'O') {
            return "B";
        }else{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(board[i][j]=='\0'){
                        return "Pending";
                    }
                }
            }
            return "Draw";
        }

    }
}