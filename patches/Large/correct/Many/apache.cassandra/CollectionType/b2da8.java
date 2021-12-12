diff --git a/src/java/org/apache/cassandra/db/marshal/CollectionType.java b/src/java/org/apache/cassandra/db/marshal/CollectionType.java
index 9408980..07c86e0 100644
--- a/src/java/org/apache/cassandra/db/marshal/CollectionType.java
+++ b/src/java/org/apache/cassandra/db/marshal/CollectionType.java
@@ -113,7 +113,7 @@
         return (ByteBuffer)result.flip();
     }
 
-    protected List<Pair<ByteBuffer, IColumn>> enforceLimit(List<Pair<ByteBuffer, IColumn>> columns)
+    protected List<Pair<ByteBuffer, Column>> enforceLimit(List<Pair<ByteBuffer, Column>> columns)
     {
         if (columns.size() <= MAX_ELEMENTS)
             return columns;
