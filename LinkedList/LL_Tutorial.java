
public class LL_Tutorial {

	public class TestNode{
		public int data;
		public TestNode next;
		
		
		public TestNode(int data){
			this.data = data;
			
		}
		
		public String toString(){
			System.out.println("data value: "+ data + "memory value " + next );
			return "data" + data;
		}
	}
	
	public static void main(String[] args){
		LL_Tutorial ll = new LL_Tutorial();
		LL_Tutorial.TestNode node = ll.new TestNode(10);
		node.toString();
		
		BST_Create tree = new BST_Create(10);
		
		tree.insert(11, tree);
		tree.insert(9, tree);
		tree.insert(5, tree);
		tree.insert(15, tree);			
		
	}
}
