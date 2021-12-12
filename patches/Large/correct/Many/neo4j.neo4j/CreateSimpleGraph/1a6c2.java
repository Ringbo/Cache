diff --git a/community/src/main/java/org/neo4j/examples/server/CreateSimpleGraph.java b/community/src/main/java/org/neo4j/examples/server/CreateSimpleGraph.java
index ed126ce..eb2e068 100644
--- a/community/src/main/java/org/neo4j/examples/server/CreateSimpleGraph.java
+++ b/community/src/main/java/org/neo4j/examples/server/CreateSimpleGraph.java
@@ -39,7 +39,7 @@
         URI firstNode = createNode();
         addProperty(firstNode, "name", "Joe Strummer");
         URI secondNode = createNode();
-        addProperty(firstNode, "band", "The Clash");
+        addProperty(secondNode, "band", "The Clash");
         // END SNIPPET: nodesAndProps    
         
         // START SNIPPET: addRel
