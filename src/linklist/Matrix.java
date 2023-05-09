public class Matrix{
    public static void main(String[] args){
        System.out.println("Matrix");
    }
}


/*
class Matrix {
    // Define properties here
    int row;
    int column;
    int[][] matrix;

    // Define constructor here
    Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
    }

    void input(Scanner sc) {
        // Use the Scanner object passed as argument for taking input and not a new Scanner object
        // Complete the function
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    Matrix add(Matrix x) {
        // Complete the function
        Matrix res = new Matrix(row, column);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                res.matrix[i][j] = matrix[i][j] + x.matrix[i][j];
            }
        }
        return res;
    }

    Matrix subtract(Matrix x) {
        // Complete the function
        Matrix res = new Matrix(row, column);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                res.matrix[i][j] = matrix[i][j] - x.matrix[i][j];
            }
        }
        return res;
    }

    Matrix transpose() {
        // Complete the function
        Matrix res = new Matrix(column, row);
        for(int i = 0; i < column; i++) {
            for(int j = 0; j < row; j++) {
                res.matrix[i][j] = matrix[j][i];
            }
        }
        return res;
    }

    void print() {
        // Complete the function
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/
/*
    Matrix a = new Matrix(10, 5)  // 10 rows, 5 columns
    a.input() 
    Matrix b = new Matrix(10, 5)  // 10 rows, 5 columns
    b.input()
    Matrix c1 = a.add(b)
    Matrix c2 = a.subtract(b)
    Matrix c3 = a.transpose()
    a.print()
*/