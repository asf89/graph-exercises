import graphtools.{Vertex => V, Graph => G, Edge => E}
import scala.collection.mutable.ArrayBuffer

object GraphCreator {
  def main(args: Array[String]): Unit = {

    val vertex1: V = new V("v")
    val vertex2: V = new V("u")

    val graph: G = new G

    graph.addToVertexList(vertex1.name)
    vertex1.idInVertexList_=(graph.getIdFromVertexList(vertex1.name))

    graph.addToVertexList(vertex2.name)
    vertex2.idInVertexList_=(graph.getIdFromVertexList(vertex2.name))

    graph.vertexes

    println(s"id_${vertex1.name} = ${vertex1.idInVertexList}")
    println(s"id_${vertex2.name} = ${vertex2.idInVertexList}")

    graph.replaceVertexElement(vertex1, "a")

    
    
  }
}
