package graphtools

import scala.collection.mutable.ArrayBuffer

class Vertex(var _name: String, var _idInVertexList: Int = 0) {
  
  private var _adjList: ArrayBuffer[String] = new ArrayBuffer[String]()
  private var _incidentEdges: ArrayBuffer[String] = new ArrayBuffer[String]()
  
  def name: String = _name

  def name_=(newName: String): Unit = {
    _name = newName
  }

  def idInVertexList: Int = _idInVertexList

  def idInVertexList_=(idInVertexListValue: Int): Unit = {
    _idInVertexList = idInVertexListValue
  }

  def addToAdjList(adjVertex: String): Unit = {
    _adjList += adjVertex
  }

  def adjList: ArrayBuffer[String] = _adjList

  def showAdjList: Unit = {
    print(s"${this.name} -> {")
    for (i <- 0 to (_adjList.length - 1)) {
      if (i == (_adjList.length - 1)) {
        print(_adjList(i) + "")
      } else {
        print(_adjList(i) + ", ")
      }
    }
    println("}")
  }

  def insertIncidentEdge(edgeName: String): Unit = {
    _incidentEdges += edgeName
  }

  def incidentEdges(vertexName: String): Unit = {
    print(s"Incident edges of $vertexName: ")
    for (m <- 0 to (_incidentEdges.length - 1)) {
      if (m == (_incidentEdges.length - 1)) {
        print(_incidentEdges(m))
      } else {
        print(_incidentEdges(m) + ", ")
      }
    }
  }

  def replace(vertex: Vertex, newVertexName: String): Unit = {
    vertex.name_=(newVertexName)
  }

}
