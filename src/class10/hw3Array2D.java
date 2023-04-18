package class10;

public class hw3Array2D {
    public static void main(String[] args) {
        /*
         Using 2D array create a grocery list. Inside you
         should have an array of veggies, fruits, dairy and sweets.
         */
        String[][] groceryList = {
                {"Carrot", "Lettuce", "Tomatoes"},
                {"Apple", "Pear", "Mango"},
                {"Milk", "Cheese", "Yogurt"},
                {"Oreos", "M&Ms", "Kit Kat"},
        };
        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {
                System.out.println(groceryList[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
        for (String[] list:groceryList){
            for (String grocery : list) {
                System.out.println(grocery + " ");
            }
            System.out.println();
        }
    }}

