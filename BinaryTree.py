from binarytree import Node
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)
print("binary tree structure")
print(root)

def inorder_traversal(node):
    if node:
        inorder_traversal(node.left)
        print(node.value, end ="")
        inorder_traversal(node.right)

print("\n in order traversal:")
inorder_traversal(root)