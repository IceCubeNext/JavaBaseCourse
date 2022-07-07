public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
}

public static void moveRobot(Robot robot, int toX, int toY) {
        Direction direction_x = robot.getX() < toX ? Direction.RIGHT: Direction.LEFT;
        Direction direction_y = robot.getY() < toY ? Direction.UP: Direction.DOWN;
        while (robot.getDirection() != direction_x) {
            robot.turnRight();
        }
        while (robot.getX() != toX) {
            robot.stepForward();
        }
        while (robot.getDirection() != direction_y) {
            robot.turnLeft();
        }
        while (robot.getY() != toY) {
            robot.stepForward();
        }
}
