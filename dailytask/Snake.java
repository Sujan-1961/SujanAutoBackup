package dailytask;

	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Random;
	import java.util.Scanner;

	public class Snake {

	    private static final int WIDTH = 20;
	    private static final int HEIGHT = 10;
	    private static final char EMPTY_CELL = '.';
	    private static final char SNAKE_BODY = 'o';
	    private static final char SNAKE_HEAD = 'O';
	    private static final char FOOD = '*';

	    private static final int INIT_LENGTH = 3;

	    private int[][] grid;
	    private Queue<Point> snake;
	    private Point food;
	    private int directionX;
	    private int directionY;

	    private static class Point {
	        int x;
	        int y;

	        Point(int x, int y) {
	            this.x = x;
	            this.y = y;
	        }
	    }

	    public Snake() {
	        grid = new int[WIDTH][HEIGHT];
	        snake = new LinkedList<Point>();
	        directionX = 1;
	        directionY = 0;
	    }

	    public void initializeGame() {
	        for (int i = 0; i < INIT_LENGTH; i++) {
	            snake.offer(new Point(i, 0));
	        }
	        placeFood();
	    }

	    private void placeFood() {
	        Random random = new Random();
	        int x, y;
	        do {
	            x = random.nextInt(WIDTH);
	            y = random.nextInt(HEIGHT);
	        } while (grid[x][y] != 0);

	        food = new Point(x, y);
	    }

	    public void update() {
	        Point head = snake.peek();
	        int newHeadX = (head.x + directionX + WIDTH) % WIDTH;
	        int newHeadY = (head.y + directionY + HEIGHT) % HEIGHT;

	        if (grid[newHeadX][newHeadY] == -1) {
	            snake.offer(new Point(newHeadX, newHeadY));
	            grid[newHeadX][newHeadY] = snake.size();
	            placeFood();
	        } else {
	            Point tail = snake.poll();
	            grid[tail.x][tail.y] = 0;

	            if (!snake.contains(new Point(newHeadX, newHeadY))) {
	                snake.offer(new Point(newHeadX, newHeadY));
	                grid[newHeadX][newHeadY] = snake.size();
	            } else {
	                System.out.println("Game Over! Your score: " + (snake.size() - INIT_LENGTH));
	                System.exit(0);
	            }
	        }
	    }

	    public void draw() {
	        for (int y = 0; y < HEIGHT; y++) {
	            for (int x = 0; x < WIDTH; x++) {
	                if (grid[x][y] == 0) {
	                    System.out.print(EMPTY_CELL);
	                } else if (grid[x][y] == 1) {
	                    System.out.print(SNAKE_HEAD);
	                } else {
	                    System.out.print(SNAKE_BODY);
	                }
	            }
	            System.out.println();
	        }
	    }

	    public void play() {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nUse 'W' to move up, 'S' to move down, 'A' to move left, 'D' to move right, 'Q' to quit.");
	            draw();

	            char input = scanner.next().charAt(0);

	            if (input == 'W' || input == 'w') {
	                directionX = 0;
	                directionY = -1;
	            } else if (input == 'S' || input == 's') {
	                directionX = 0;
	                directionY = 1;
	            } else if (input == 'A' || input == 'a') {
	                directionX = -1;
	                directionY = 0;
	            } else if (input == 'D' || input == 'd') {
	                directionX = 1;
	                directionY = 0;
	            } else if (input == 'Q' || input == 'q') {
	                System.out.println("Quitting the game. Goodbye!");
	                System.exit(0);
	            }

	            update();
	        }
	    }

	    public static void main(String[] args) {
	        Snake snakeGame = new Snake();
	        snakeGame.initializeGame();
	        snakeGame.play();
	    }
	}



