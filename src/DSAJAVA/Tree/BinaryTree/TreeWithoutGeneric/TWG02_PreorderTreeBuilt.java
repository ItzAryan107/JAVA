package DSAJAVA.Tree.BinaryTree.TreeWithoutGeneric;

import java.util.Scanner;

public class TWG02_PreorderTreeBuilt {
    Scanner sc = new Scanner(System.in);

    public TWG01_Node pushRecursively(){

        int data = sc.nextInt();
        TWG01_Node root = new TWG01_Node(data);
        if (data == -1)
            return null;

        root.left = pushRecursively();
        root.right = pushRecursively();


        return root;
    }

    public void print(TWG01_Node root){
        if (root == null)
            return;

        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        TWG02_PreorderTreeBuilt twg_02PreorderTreeBuilt = new TWG02_PreorderTreeBuilt();
        TWG01_Node root = twg_02PreorderTreeBuilt.pushRecursively();
        twg_02PreorderTreeBuilt.print(root);
    }
}
