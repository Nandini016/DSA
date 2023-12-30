public class NqueensTotalways {
    public static boolean isSafe(char chessboard[][],int row,int col){
        //vertical up
        for(int i = row-1;i>=0;i--){
            if(chessboard[i][col]=='Q'){
                return false;
            }
        }


        //diagonal left up
        for(int i= row-1,j=col-1;i>=0 && j>=0;i--,j--){
           if(chessboard[i][j] =='Q'){
            return false;
           }

        }


        //diagonal right up
        for(int i =row-1,j=col+1 ; i>=0 &&j<chessboard.length;i--,j++){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char chessboard[][],int row){
        if(row==chessboard.length){
           // printBoard(chessboard);
           count++;
            return;
        }
        for(int j =0;j<chessboard.length;j++){
            if(isSafe(chessboard,row,j)){
            chessboard[row][j] ='Q';
            nQueens(chessboard, row+1);//recursion
            chessboard[row][j] ='x';//backtrcking
            }
        }
    } 
    public static void printBoard(char chessboard[][])
    {
        System.out.println("----------ChessBoard-----------");
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard.length;j++){
                System.out.print(chessboard[i][j]);
            }
            System.out.println();
        }
    }
     static int count =0;
    public static void main(String args[]){
        int n=5;
        char chessboard[][] = new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
            chessboard[i][j] ='x';
           }
        }
        nQueens(chessboard,0);
        System.out.println("total ways to solve n Quuens problem are "+ count);


    }
    
}
