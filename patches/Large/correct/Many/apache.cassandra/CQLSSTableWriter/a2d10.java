diff --git a/src/java/org/apache/cassandra/io/sstable/CQLSSTableWriter.java b/src/java/org/apache/cassandra/io/sstable/CQLSSTableWriter.java
index a243175..3e27ff9 100644
--- a/src/java/org/apache/cassandra/io/sstable/CQLSSTableWriter.java
+++ b/src/java/org/apache/cassandra/io/sstable/CQLSSTableWriter.java
@@ -549,7 +549,7 @@
             };
         }
 
-        protected void addColumn(Column column) throws IOException
+        protected void addColumn(Cell cell) throws IOException
         {
             throw new UnsupportedOperationException();
         }
