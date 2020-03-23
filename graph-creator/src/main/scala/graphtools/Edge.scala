package graphtools

import scala.collection.mutable.ArrayBuffer

class Edge(var _name: String,
  var startVertex: String,
  var endVertex: String,
  var adjListStartVertex: ArrayBuffer[String],
  var adjListEndVertex: ArrayBuffer[String],
  var _idToAdjList2: String,
  var _idVertex1: String,
  var _idVertex2: String) {
  
  private var _endVertexes: ArrayBuffer[String] = ArrayBuffer[String](this.startVertex, this.endVertex)

  def name: String = _name

  def name_=(newName: String): Unit = {
    _name = newName
  }

  def opposite(vertexName: String, edgeName: String): Unit = {

    if (vertexName == this.startVertex && edgeName == this.name) {
      for (element <- adjListStartVertex) {
        if (element == this.endVertex) {
          println(element)
        }
      }
    } else if (vertexName == this.endVertex && edgeName == this.name) {
        for (element <- adjListEndVertex) {
          if (element == this.startVertex) {
            println(element)
          }
        }
      } else println("Error: $edgeName doesn't incide in $vertexName")
    }
  

  def endVertexes(edgeName: String): Unit = {

    println(s"End Vertexes of $edgeName: ${_endVertexes(0)}, ${_endVertexes(1)}")
    
  }

  def areAdjacent(vertexName1: String, vertexName2: String): Unit = {
    if (vertexName1 == this.startVertex && vertexName2 == this.endVertex)
      println(true)
    else
      println(false)
  }

  def replace(edgeName: Edge, newEdgeName: String): Unit = {
    edgeName.name_=(newEdgeName)
  }

}
