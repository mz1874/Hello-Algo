package org.example.entity;

import lombok.Data;

/**
 * @author aiden
 * @data 27/03/2024
 * @description
 */
@Data
public class TreeNode {

    public int id;

    public TreeNode leftNode;

    public TreeNode rightNode;

    public TreeNode(int id) {
        this.id = id;
    }


    /*注意, 如果你尝试删除一个树的某一个子节点,那么这个节点下的所有节点都会被删除掉*/

}
