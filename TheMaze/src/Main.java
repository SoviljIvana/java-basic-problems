public class Main {
    public static void main(String[] args) {


        int[][] maze = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
                {2, 1, 1, 0, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 1, 0, 0, 1, 0, 0},
                {0, 1, 1, 1, 1, 0, 1, 1, 1, 0},
                {0, 1, 0, 0, 1, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 3},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        Maze object = new Maze();
        int startRow = 0;
        int startColumn = 0;

        for (int row = 0; row < maze.length; row++)
            for (int column = 0; column < maze.length; column++) {
                if (maze[row][column] == 2) {
                    startRow = row;
                    startColumn = column;
                }
            }

        int row = startRow;
        int column = startColumn;
        System.out.print("(" + row + "," + column + ")");

        for (; ; ) {
            if (object.checkDown(row, column, maze)) {
                row++;
                object.print(maze, row, column);
            } else {
                while (object.checkUp(row, column, maze)) {
                    row--;
                    object.print(maze, row, column);
                }
            }

            if (object.checkRight(row, column, maze)) {
                column++;
                object.print(maze, row, column);
            } else {
                while (object.checkLeft(row, column, maze)) {
                    column--;
                    object.print(maze, row, column);
                }
            }
            if (object.checkRightThree(row, column, maze)) {
                column++;
                object.print(maze, row, column);
                break;
            }
            if (object.checkLeftThree(row, column, maze)) {
                column--;
                object.print(maze, row, column);
                break;
            }
            if (object.checkUpThree(row, column, maze)) {
                row--;
                object.print(maze, row, column);
                break;
            }
            if (object.checkDownThree(row, column, maze)) {
                row++;
                object.print(maze, row, column);
                break;
            }
        }
    }
}

