class Tree{
	int val;
	Tree left;
	Tree right;
	//以下写法是错误的，java不像C++那样有形参。需要用方法重载来实现
	//public void Tree(int val = 0){
		
	//Key Point:
	//构造方法只有方法名，什么关键字都不要加，否则会报错
	//public void Tree(int val,Tree left,Tree right){
	Tree(int val,Tree left,Tree right){
		this.left = left;
		this.right = right;
		this.val = val;
	}
	Tree(int val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
	Tree(){}
}