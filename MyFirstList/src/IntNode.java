// class: intern node of the concatenated list. The data is of type integer
public class IntNode {
	
	private int data;
	private IntNode link;
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public IntNode getLink() {
		return link;
	}

	public void setLink(IntNode link) {
		this.link = link;
	}
	
	public IntNode(int Data, IntNode Link) {
		this.setData(Data);
		this.setLink(Link);
	}
	
	public static void main(String[] args) {
		
		IntNode initialNode = new IntNode(5, null);
		System.out.println(" Content of the initial node is the integer: " + initialNode.getData());
		System.out.println(" This initial node pointed to: " + initialNode.getLink());
					
	}
	

}
