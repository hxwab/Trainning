package com.algorithms.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunny on 4/2/16.
 *
 * 对于普�?的二叉树，如何找到两个给定节点之家的距离？距离是指连接两个节点需要的�?��的边的条�? * http://www.acmerblog.com/distance-between-given-keys-5995.html
 */
public class TreeNodeDistance {
    /**
     * 利用LowestCommonAncestor的第�?��方法
     * 遍历这两条路径，直到遇到�?��不同的节点，计算两条路径上不同节点的个数+1(lca节点) - 1(路径长度 = 节点�?1)
     */
    public static int distance(Node root, int node1, int node2) {
        List<Node> path1 = new ArrayList<Node>(), path2 = new ArrayList<Node>();
        boolean find1 = LowestCommonAncestor.findPath(root, path1, node1);
        boolean find2 = LowestCommonAncestor.findPath(root, path2, node2);
        if (find1 && find2) {
            int i;
            for (i = 0; i < path1.size() && i < path2.size(); i++){
                if (path1.get(i) != path2.get(i))
                    break;
            }
            int len1 = path1.size() - i, len2 = path2.size() - i;
            return len1 + len2;
        }
        return -1;
    }

    public static void main(String[] args) {
        char[] preOrder = new char[]{'a', 'b', 'd', 'c', 'e', 'f'};
        char[] inOrder = new char[]{'d', 'b', 'a', 'e', 'c', 'f'};
        Node root = RebuildBT.rebuildTree(preOrder.length, preOrder, 0, inOrder, 0);

        System.out.println(distance(root, 'd', 'f'));
    }

}
