package tech.yangdian.dsaa.ds.tree;

public class AVL<E extends Comparable<E>>
{
    private Node root;

    public void insert(E element)
    {
        root = avl_insert(element, root);
    }

    public E find_min()
    {
        Node node = avl_find_min(root);

        if (node != null)
        {
            return node.element;
        }

        return null;
    }

    public E find_max()
    {
        Node node = avl_find_max(root);

        if (node != null)
        {
            return node.element;
        }

        return null;
    }



    private int avl_height(Node node)
    {
        if (node == null)
        {
            return -1;
        }
        else
        {
            return node.height;
        }
    }

    private Node avl_singRotateWithLeft(Node k2)
    {
        Node k1 = k2.left;

        k2.left = k1.right;
        k1.right = k2;

        updateHeight(k1);
        updateHeight(k2);

        return k1;
    }

    private Node avl_singRotateWithRight(Node k2)
    {
        Node k1 = k2.right;

        k2.right = k1.left;
        k1.left = k2;

        updateHeight(k1);
        updateHeight(k2);

        return k1;
    }

    private Node avl_doubleRotateWithLeft(Node k3)
    {
        k3.left = avl_singRotateWithRight(k3.left);

        return avl_singRotateWithLeft(k3);
    }

    private Node avl_doubleRotateWithRight(Node k3)
    {
        k3.right = avl_singRotateWithLeft(k3.right);

        return avl_singRotateWithRight(k3);
    }

    private Node avl_insert(E element, Node tree)
    {
        if (tree == null)
        {
            tree = new Node();
            tree.element = element;
            tree.left = tree.right = null;
            tree.height = 0;
        }
        else if (element.compareTo(tree.element) < 0)
        {
            tree.left = avl_insert(element, tree.left);

            if (avl_height(tree.left) - avl_height(tree.right) == 2)
            {
                if (element.compareTo(tree.left.element) < 0)
                {
                    tree = avl_singRotateWithLeft(tree);
                }
                else
                {
                    tree = avl_doubleRotateWithLeft(tree);
                }
            }
        }
        else if (element.compareTo(tree.element) > 0)
        {
            tree.right = avl_insert(element, tree.right);

            if (avl_height(tree.right) - avl_height(tree.left) == 2)
            {
                if (element.compareTo(tree.right.element) > 0)
                {
                    tree = avl_singRotateWithRight(tree);
                }
                else
                {
                    tree = avl_doubleRotateWithRight(tree);
                }
            }
        }

        updateHeight(tree);

        return tree;
    }

    private Node avl_find_min(Node node)
    {
        Node temp = node;

        if (node != null)
        {
            while (temp.left!=null)
                temp = temp.left;
        }

        return temp;
    }

    private Node avl_find_max(Node node)
    {
        Node temp = node;

        if (node != null)
        {
            while (temp.right!=null)
                temp = temp.right;
        }

        return temp;
    }

    private void updateHeight(Node k)
    {
        k.height = Math.max(avl_height(k.left), avl_height(k.right)) + 1;
    }

    private class Node
    {
        public E element;
        public Node left;
        public Node right;
        public int height;
    }
}
