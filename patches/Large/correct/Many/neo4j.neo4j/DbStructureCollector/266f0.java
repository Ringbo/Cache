diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/util/dbstructure/DbStructureCollector.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/util/dbstructure/DbStructureCollector.java
index b0872e0..3fd94d2 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/util/dbstructure/DbStructureCollector.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/util/dbstructure/DbStructureCollector.java
@@ -126,7 +126,7 @@
             public long nodesWithLabelCardinality( int labelId )
             {
                 Long result = labelId == -1 ? allNodesCount : nodeCounts.get( labelId );
-                return result == null ? 0l : result;
+                return result == null ? 0L : result;
             }
 
             @Override
@@ -134,7 +134,7 @@
             {
                 RelSpecifier specifier = new RelSpecifier( fromLabelId, relTypeId, toLabelId );
                 Long result = relCounts.get( specifier );
-                return result == null ? 0l : result;
+                return result == null ? 0L : result;
             }
 
             @Override
