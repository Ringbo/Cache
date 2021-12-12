diff --git a/community/cypher/src/main/java/org/neo4j/cypher/javacompat/QueryStatistics.java b/community/cypher/src/main/java/org/neo4j/cypher/javacompat/QueryStatistics.java
index b48ef15..575e820 100644
--- a/community/cypher/src/main/java/org/neo4j/cypher/javacompat/QueryStatistics.java
+++ b/community/cypher/src/main/java/org/neo4j/cypher/javacompat/QueryStatistics.java
@@ -73,7 +73,7 @@
      */
     public int getDeletedRelationships()
     {
-        return inner.deletedNodes();
+        return inner.deletedRelationships();
     }
 
     /**
