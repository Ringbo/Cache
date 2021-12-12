diff --git a/samediff/src/main/java/org/nd4j/autodiff/ArrayField.java b/samediff/src/main/java/org/nd4j/autodiff/ArrayField.java
index a20718b..7940eab 100644
--- a/samediff/src/main/java/org/nd4j/autodiff/ArrayField.java
+++ b/samediff/src/main/java/org/nd4j/autodiff/ArrayField.java
@@ -1025,7 +1025,7 @@
                 .vertexIds(new String[]{String.valueOf(vertex.vertexID()),String.valueOf(newVertex.vertexID())})
                 .opType(opType).build();
         xToZ.setResult(resultInfo);
-        if(vertex.vertexID() == newVertex.vertexID())
+        if(!ops.graph().isFrozen() && vertex.vertexID() == newVertex.vertexID())
             throw new IllegalStateException("Attempted to add edge with vertex id of " + newVertex.vertexID() +
                     " when next vertex id was " + this.ops.getGraph().getNextVertexId() + " . This usually means that the vertex id generation was behind the nodes being added.");
 
