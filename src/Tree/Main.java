package Tree;

public class Main {
    public static void main(String[] args) {

        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tee");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode cola = new TreeNode("Coca Cola");
        TreeNode fanta = new TreeNode("Fanta");

        drinks.addChild(hot);
        drinks.addChild(cold);

        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(cola);
        cold.addChild(fanta);

        System.out.println(drinks.print(0));

    }
}
