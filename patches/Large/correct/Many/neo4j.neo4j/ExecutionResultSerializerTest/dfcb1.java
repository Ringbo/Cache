diff --git a/community/server/src/test/java/org/neo4j/server/rest/transactional/ExecutionResultSerializerTest.java b/community/server/src/test/java/org/neo4j/server/rest/transactional/ExecutionResultSerializerTest.java
index c322222..17f3ff9 100644
--- a/community/server/src/test/java/org/neo4j/server/rest/transactional/ExecutionResultSerializerTest.java
+++ b/community/server/src/test/java/org/neo4j/server/rest/transactional/ExecutionResultSerializerTest.java
@@ -475,7 +475,7 @@
         // when
         serializer.statementResult( mockExecutionResult(
                 map( "node", node[0], "rel", rel[0], "path", path, "map", map( "n1", node[1], "r1", rel[1] ) )
-        ), ResultDataContent.rest );
+        ), false, ResultDataContent.rest );
         serializer.finish();
 
         // then
