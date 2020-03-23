package graphtools

import scala.collection.mutable.ArrayBuffer

class Graph {

  private var vertexList: ArrayBuffer[String] = new ArrayBuffer[String]()
  private var edgeList: ArrayBuffer[String] = new ArrayBuffer[String]()

  def addToVertexList(vertexElementName: String): Unit = { 
    vertexList += vertexElementName 
  }

  def getIdFromVertexList(element: String): Int = {
    var idFromVertexList: Int = 0
    
    for (k <- 0 to (vertexList.length - 1)) {
      if (vertexList(k) == element) { idFromVertexList = k }
    }

    idFromVertexList
  }

  def vertexes: Unit = {
    print("V = {") 
    for (i <- 0 to (vertexList.length - 1)) {
      if (i == (vertexList.length - 1)) {
        print(vertexList(i))
      } else {
        print(vertexList(i) + ", ")
      }
    }
    println("}")
  }

  def addToEdgeList(edgeElementName: String): Unit = {
    edgeList += edgeElementName
  }

  def edges: Unit = {

    print("E = {")
    for (j <- 0 to (edgeList.length - 1)) {
      if (j == (edgeList.length - 1)) {
        print(edgeList(j))
      } else {
        print(edgeList(j) + ", ")
      }
    }
    println("}")
  
  }

  def replaceVertexElement(vertex: Vertex, newVertexName: String): Unit = {
    vertex.name_=(newVertexName)    
  }

  def replaceEdgeElement(edge: Edge, newEdgeName: String): Unit = {
    edge.name_=(newEdgeName)
  }

}
