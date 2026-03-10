public class Containers
{
    public static void main(String[] args) {

        int amountOfBricks = 73;
        int containerCapacity = 8;

        System.out.println("Total bricks: " + amountOfBricks);
        System.out.println("Container capacity: " + containerCapacity);

        int fullContainers = amountOfBricks / containerCapacity;
        System.out.println("Number of FULL containers: " + fullContainers);

        int remainingBricks = amountOfBricks % containerCapacity;
        System.out.println("Blocks in the not full container: " + remainingBricks);

        int totalContainers;

        if (remainingBricks > 0)
        {
            totalContainers = fullContainers + 1;
        } else
        {
            totalContainers = fullContainers;
        }

        System.out.println("Total containers needed: " + totalContainers);
    }

}
