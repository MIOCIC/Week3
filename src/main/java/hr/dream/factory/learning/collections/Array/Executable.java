package hr.dream.factory.learning.collections.Array;

import hr.dream.factory.learning.collections.tree.DTree;

public class Executable {
    public static void main(String[] args) {
        DTree d = new DTree();
        for(String s : args){
            try{
                d.add(Integer.parseInt(s));
            } catch (Exception e) {
                System.out.println("not a number in argument, ignored!");
            }

        }
        d.printEspecial(d.getHead());
    }
}
