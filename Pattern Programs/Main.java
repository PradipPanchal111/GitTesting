public class Main {

    static int[][] maze = {
            { 2, 0, 1, 1, 1, 0 },
            { 0, 0, 0, 1, 0, 0 },
            { 1, 1, 0, 1, 0, 0 },
            { 0, 0, 0, 1, 1, 0 },
            { 0, 1, 0, 0, 0, 3 }
    };

    static boolean[][] visited = new boolean[5][6];

    static boolean walk(int r, int c) {

        // out of bounds
        if (r < 0 || c < 0 || r >= 5 || c >= 6)
            return false;

        // wall or visited
        if (maze[r][c] == 1 || visited[r][c])
            return false;

        // reached end
        if (maze[r][c] == 3) {
            System.out.println("Reached E at (" + r + "," + c + ")");
            return true;
        }

        // mark visited
        visited[r][c] = true;
        System.out.println("At (" + r + "," + c + ")");

        // apply simple movement rules:
        if (walk(r + 1, c))
            return true; // 1. down
        if (walk(r, c + 1))
            return true; // 2. right
        if (walk(r - 1, c))
            return true; // 3. up
        if (walk(r, c - 1))
            return true; // 4. left

        return false; // stuck, go back
    }

    public static void main(String[] args) {
        walk(1, 0);
    }
}
