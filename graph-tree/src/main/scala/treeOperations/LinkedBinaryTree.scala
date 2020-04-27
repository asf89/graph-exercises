package treeOperations

import treeElements.Position

class LinkedBinaryTree(var root: Position = null, var _treeSize: Int = 0) {

  def treeSize = _treeSize

  def treeSize_=(newTreeSize: Int): Unit = {
    _treeSize = newTreeSize
  }

  @Override
  def isEmpty: Boolean = {
    if (root != null) false else true
  }

  def isRoot(node: Position): Boolean = {
    if (node.father != null) false else true
  }

  def isExternal(node: Position): Boolean = {
    if (node.father != null && (node.leftChild != null && node.rightChild != null)) false else true
  }

  def isInternal(node: Position): Boolean = {
    !this.isExternal(node)
  }

  def hasLeft(node: Position): Boolean = {
    node.rightChild match {
      case null => false
      case other => true
    }
  }

  def hasRight(node: Position): Boolean = {
    node.leftChild match {
      case null => false
      case other => true
    }
  }

  def addRoot(rootValue: Int): Unit = {
    root.element_=(rootValue)
  }

  def insertLeft(node: Position, leftChildValue: Int): Unit = {
    if (node.leftChild == null) {
      node.leftChild.father = node
      node.leftChild.element_=(leftChildValue)
      if (this.hasRight(node) == false) this.treeSize_=(this.treeSize + 1)
    } else {
      println("O nó já possui um filho à esquerda.")
    }
  }

  def insertRight(node: Position, rightChildValue: Int): Unit = {
    if (node.rightChild == null) {
      node.rightChild.father = node
      node.rightChild.element_=(rightChildValue)
      if (this.hasLeft(node) == false) this.treeSize_=(this.treeSize + 1)
    } else {
      println("O nó já possui um filho à direita.")
    }
  }

  

}
