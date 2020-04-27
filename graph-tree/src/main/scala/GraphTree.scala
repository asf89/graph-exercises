import treeElements.Position
import treeOperations.LinkedBinaryTree

object GraphTree {

  def main(args: Array[String]): Unit = {

    var leaf: Position = new Position()
    var tree: LinkedBinaryTree = new LinkedBinaryTree(leaf)

    tree.addRoot(40)
    tree.insertLeft(leaf, 60)
    tree.insertRight(leaf, 23)


    println(s"Tamanho da árvore: ${tree.treeSize}")
    println(s"A árvore está vazia? ${tree.isEmpty}")
    println(s"O nó é interno? ${tree.isInternal(leaf)}")
    println(s"O nó é externo? ${tree.isExternal(leaf)}")
    println(s"O nó é raiz? ${tree.isRoot(leaf)}")
    println(s"$leaf tem filho à esquerda? ${tree.hasLeft(leaf)}")
    println(s"$leaf tem filho à direita? ${tree.hasRight(leaf)}")

  }

}


