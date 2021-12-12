diff --git a/src/java/org/apache/cassandra/db/composites/CompoundSparseCellNameType.java b/src/java/org/apache/cassandra/db/composites/CompoundSparseCellNameType.java
index 2cc8516..a301665 100644
--- a/src/java/org/apache/cassandra/db/composites/CompoundSparseCellNameType.java
+++ b/src/java/org/apache/cassandra/db/composites/CompoundSparseCellNameType.java
@@ -231,7 +231,7 @@
                 return super.copyAndMakeWith(components, size, eoc);
 
             ByteBuffer[] clusteringColumns = Arrays.copyOfRange(components, 0, clusteringSize);
-            return new CompoundSparseCellName.WithCollection(clusteringColumns, idFor(components[clusteringSize]), components[fullSize + 1]);
+            return new CompoundSparseCellName.WithCollection(clusteringColumns, idFor(components[clusteringSize]), components[clusteringSize + 1]);
         }
     }
 }
