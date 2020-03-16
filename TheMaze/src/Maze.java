public class Maze {
    /**
     * this method checks ->if(element right=1)
     *
     * @param row
     * @param column
     * @param maze
     * @return true or false
     */
    public boolean checkRight(int row, int column, int[][] maze) {
        boolean isOne;
        if ((column + 2) != 0 && column + 2 != maze.length && maze[row][column + 1] == 1) {
            isOne = true;
        } else {
            isOne = false;
        }
        return isOne;
    }

    /**
     * this method checks ->if(element left=1)
     *
     * @param row
     * @param column
     * @param maze
     * @return true or false
     */
    public boolean checkLeft(int row, int column, int[][] maze) {
        boolean isOne;
        if ((column - 2) != 0 && column - 2 != maze.length && maze[row][column - 1] == 1) {
            isOne = true;
        } else {
            isOne = false;
        }
        return isOne;
    }

    /**
     * this method checks if the unit is up
     *
     * @param row
     * @param column
     * @param maze
     * @return true or false
     */
    public boolean checkUp(int row, int column, int[][] maze) {
        boolean isOne;
        if ((row - 2) != 0 && (row - 2) != maze.length && maze[row - 1][column] == 1) {
            isOne = true;
        } else {
            isOne = false;
        }
        return isOne;
    }

    /**
     * this method checks if the unit is down
     *
     * @param row
     * @param column
     * @param maze
     * @return true or false
     */
    public boolean checkDown(int row, int column, int[][] maze) {
        boolean isOne;
        if ((row + 2) != 0 && (row + 2) != maze.length && maze[row + 1][column] == 1) {
            isOne = true;
        } else {
            isOne = false;
        }
        return isOne;
    }

    /**
     * this method checks ->if(element right=3)
     *
     * @param row
     * @param column
     * @param maze
     * @return true or false
     */
    public boolean checkRightThree(int row, int column, int[][] maze) {
        boolean isOne;
        if (maze[row][column + 1] == 3) {
            isOne = true;
        } else {
            isOne = false;
        }
        return isOne;
    }

    /**
     * this method checks ->if(element left=1)
     *
     * @param row
     * @param column
     * @param maze
     * @return true or false
     */
    public boolean checkLeftThree(int row, int column, int[][] maze) {
        boolean isOne;
        if (maze[row][column - 1] == 3) {
            isOne = true;
        } else {
            isOne = false;
        }
        return isOne;
    }

    /**
     * Check if the value 3 is higher
     *
     * @param row
     * @param column
     * @param maze
     * @return true or false
     */
    public boolean checkUpThree(int row, int column, int[][] maze) {
        boolean isOne;
        if (maze[row - 1][column] == 3) {
            isOne = true;
        } else {
            isOne = false;
        }
        return isOne;
    }

    /**
     * Check if the value 3 is below
     *
     * @param row
     * @param column
     * @param maze
     * @return true or false
     */
    public boolean checkDownThree(int row, int column, int[][] maze) {
        boolean isOne;
        if (maze[row + 1][column] == 3) {
            isOne = true;
        } else {
            isOne = false;
        }
        return isOne;
    }

    /**
     * This method prints the row and column
     *
     * @param maze
     * @param row
     * @param column
     */
    public void print(int[][] maze, int row, int column) {
        System.out.print("(" + row + "," + column + ")");
    }


}



