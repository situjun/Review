//同目录下的类不用导入，直接就可使用
//import Tree.java;

import java.util.*;
class TreeOperations{
	static Tree root = new Tree(99);
	public static void main(String[] args){
		
		init();
		//Key Point:直接打印t1.val会报错。因为变量名t1相当于一个指向地址的指针，但该指针只能在init存在。
		//但是开辟的变量和空间是依然存在的，单单只是t1不能再其他处访问而已
		//可以看出root是明显连着其它节点的
		//System.out.println(t1.val+"");
		
		printTree(root);
		
		System.out.println("Max height:"+maxHeight(root));
		System.out.println("preorderTraversal");
		preOrder(root);
		System.out.print("\n");
		System.out.println("InOrderTraversal");
		inOrder(root);
		System.out.print("\n");
		System.out.println("postorderTraversal");
		postOrder(root);
		
	}
	public static void inOrder(Tree root){
		//虽然传进来的参数和外面的那个static 变量同名，但是在inOrder里面的root指针指向的是传进来的这个参数
		if(root != null){
			inOrder(root.left);
			System.out.print(root.val+",");
			inOrder(root.right);
		}
	}
	public static List<Integer> rightView(){
		return null;
	}
	public static void preOrder(Tree root){
		if(root != null){
			System.out.print(root.val+",");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public static void postOrder(Tree root){
		if(root != null){
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.val+",");
		}
	}
	public static int maxHeight(Tree node){
		if(node != null){
			return Math.max(maxHeight(node.left),maxHeight(node.right))+1;
		}
		return 0;
	}
	/**
	Key Point:
	print binary tree 很麻烦
	很麻烦的一个问题
	**/
	public static void printTree(Tree root){
		
		Queue<Tree> currentLevel = new LinkedList<Tree>();
        Queue<Tree> nextLevel = new LinkedList<Tree>();

        currentLevel.add(root);

        while (!currentLevel.isEmpty()) {
            Iterator<Tree> iter = currentLevel.iterator();
            while (iter.hasNext()) {
                Tree currentNode = iter.next();
                if (currentNode.left != null) {
                    nextLevel.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    nextLevel.add(currentNode.right);
                }
                System.out.print(currentNode.val + " ");
            }
            System.out.println();
            currentLevel = nextLevel;
            nextLevel = new LinkedList<Tree>();

        }
		
		
		
	}
	public static void init(){
		/***
		以下static写法是错的,会报错：
		InorderTraversal.java:11: error: illegal start of expression
                static Tree t1 = new Tree();
		static variable只能在方法外声明。
		**/
		//static Tree t1 = new Tree();
		Tree t1 = new Tree();
		t1.val = 1;
		root.left = t1;
		Tree t2 = new Tree(2);
		t2.left = new Tree(6,new Tree(7),new Tree(8));
		t2.right = new Tree(5);
		root.right = t2;
		t1.left = new Tree(3);
		t1.right = new Tree(4,null,new Tree(21));
	}
}