class Tree{
	int value = 0;
	Tree left = null;
	Tree right = null;
	Tree(int value,Tree left,Tree right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
class MaxDepth{
	static Tree root = new Tree(99,null,null);
	public static void main(String[] args){
		init(root);
		System.out.print("The max depth is "+maxDepth(root));
		System.out.print("\n");
		System.out.println("Pre order is ");
		preOrder(root);
	}
	public static int maxDepth(Tree t){
		//Key Point:
		//root 必须在最外层声明为static，否则root只存在于init()的作用域中。
		//虽然root的left和right都是在init()中声明的，直接调用他们没反应。但left和right都是存在的，并没有被销毁。
		//如果用static的root就能访问到他们的地址
		if(t!=null) return Math.max(maxDepth(t.left)+1,maxDepth(t.right)+1);
		return 0;
	}
	public static void init(Tree node){
		root.left = new Tree(22,new Tree(11,new Tree(5,null,null),null),null);
		root.right = new Tree(188,new Tree(11,new Tree(5,new Tree(777,null,null),null),null),null);
	}
	public static void preOrder(Tree node){
		if(node != null){
			System.out.print(node.value+"\t");
			preOrder(node.left);
			preOrder(node.right);
		}
	}
}