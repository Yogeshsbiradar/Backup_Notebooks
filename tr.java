class node{
    node left,right;
    int data;
    public node(int data){
        this.data=data;
    }

    public void insert(int value){
        if(value<=data){
            if(left==null){
                left=new node(value);
            }
            else{
                left.insert(value);
            }
        }
        else{
            if(right==null){
                right=new node(value);
            }
            else{
                right.insert(value);
            }
        }
    }
    public void inorder(){
        if(left!=null){
            left.inorder();
        }
        System.out.println(data);
        if(right!=null){
            right.inorder();
        }
    }
}
class tr{
public static void main(String[] args){
      node n = new node(32);
      n.insert(78);
      n.insert(87);
      n.insert(65);
      n.insert(643);
      n.insert(2);
      n.insert(5);
      n.insert(27);
      n.insert(75);
      n.inorder();
}
}