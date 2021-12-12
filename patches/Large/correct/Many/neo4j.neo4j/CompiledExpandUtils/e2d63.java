diff --git a/community/cypher/cypher/src/main/java/org/neo4j/cypher/internal/codegen/CompiledExpandUtils.java b/community/cypher/cypher/src/main/java/org/neo4j/cypher/internal/codegen/CompiledExpandUtils.java
index 0e7b908..673ff02 100644
--- a/community/cypher/cypher/src/main/java/org/neo4j/cypher/internal/codegen/CompiledExpandUtils.java
+++ b/community/cypher/cypher/src/main/java/org/neo4j/cypher/internal/codegen/CompiledExpandUtils.java
@@ -132,17 +132,17 @@
             }
 
             return connectingRelationshipsIterator( CompiledCursorUtils
-                    .nodeGetRelationships( read, cursors, nodeCursor, startNode, relDirection ), endNode );
+                    .nodeGetRelationships( read, cursors, nodeCursor, startNode, relDirection, relTypes ), endNode );
         }
         else if ( fromNodeIsDense )
         {
             return connectingRelationshipsIterator( CompiledCursorUtils
-                    .nodeGetRelationships( read, cursors, nodeCursor, toNode, direction.reverse() ), fromNode );
+                    .nodeGetRelationships( read, cursors, nodeCursor, toNode, direction.reverse(), relTypes ), fromNode );
         }
         else
         {   //either only toNode is dense or none of them, just go with what we got
             return connectingRelationshipsIterator( CompiledCursorUtils
-                    .nodeGetRelationships( read, cursors, nodeCursor, fromNode, direction ), toNode );
+                    .nodeGetRelationships( read, cursors, nodeCursor, fromNode, direction, relTypes ), toNode );
         }
     }
 
