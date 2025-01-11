package com.practique.firstApp.Algorithm;

public class SameTree {
    public static void main(String[] args) {

    }

    public static boolean compareTrees(Node root1, Node root2){

        if(root1 == null && root2==null){
            return true;
        }

        if(root1 ==null||root2==null){
            return false;
        }

        if(root1.data== root2.data
                && compareTrees(root1.left, root2.left)
                && compareTrees(root1.right,root2.right)){
            return true;
        }
return  false;
    }
}
