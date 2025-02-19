class Node {
        int value;
        Node left, right;
    
        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }
    
    class BinarySearchTree {
        Node root;
    
        // Yeni bir düğüm ekleme
        void insert(int value) {
            root = insertRec(root, value);
        }

        public static void main(String[] args) {
            BinarySearchTree bst = new BinarySearchTree();
            

            
            // Düğümleri ekle
            bst.insert(50);
            bst.insert(30);
            bst.insert(20);
            bst.insert(40);
            bst.insert(70);
            bst.insert(60);
            bst.insert(80);
    
            // Ağacı sıralı şekilde yazdır
            System.out.println("In-order traversal sonucu:");
            bst.inorder();

            System.out.print("\nMax Value: ");
          if(bst.root!=null){  System.out.println(bst.Max(bst.root));}
        }

         int Max(Node n){

            while (n.right!=null) { 
                n=n.right;
            }

        return n.value;
        }
    
        // Rekürsif olarak düğüm ekleme
        Node insertRec(Node root, int value) {
            if (root == null) {
                root = new Node(value);
                return root;
            }
            if (value < root.value) {
                root.left = insertRec(root.left, value);
            } else if (value > root.value) {
                root.right = insertRec(root.right, value);
            }
            return root;
        }
    
        void inorder() {
            inorderRec(root);
        }
    
        void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.value + " ");
                inorderRec(root.right);
            }
        }
    }
    
        
    
