package treeElements

class Position(var _element: Int = 0, var father: Position = null, var leftChild: Position = null, var rightChild: Position = null) {

  def element = _element

  def element_=(newElementValue: Int): Unit = {
    _element = newElementValue
  }

 
}



