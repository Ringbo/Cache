diff --git a/processing/src/main/java/io/druid/segment/QueryableIndexStorageAdapter.java b/processing/src/main/java/io/druid/segment/QueryableIndexStorageAdapter.java
index 443c9cb..72758ef 100644
--- a/processing/src/main/java/io/druid/segment/QueryableIndexStorageAdapter.java
+++ b/processing/src/main/java/io/druid/segment/QueryableIndexStorageAdapter.java
@@ -490,7 +490,7 @@
               for (ComplexColumn complexColumn : complexColumnCache.values()) {
                 Closeables.closeQuietly(complexColumn);
               }
-              for (Object column : complexColumnCache.values()) {
+              for (Object column : objectColumnCache.values()) {
                 if (column instanceof Closeable) {
                   Closeables.closeQuietly((Closeable) column);
                 }
