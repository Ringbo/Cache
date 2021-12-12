diff --git a/modules/core/src/main/java/org/apache/ignite/cache/store/jdbc/JdbcCacheStore.java b/modules/core/src/main/java/org/apache/ignite/cache/store/jdbc/JdbcCacheStore.java
index 2147e3f..1cd387d 100644
--- a/modules/core/src/main/java/org/apache/ignite/cache/store/jdbc/JdbcCacheStore.java
+++ b/modules/core/src/main/java/org/apache/ignite/cache/store/jdbc/JdbcCacheStore.java
@@ -204,16 +204,16 @@
     }
 
     /** {@inheritDoc} */
-    @Override public void start() throws IgniteCheckedException {
+    @Override public void start() throws IgniteException {
         if (dataSrc == null)
-            throw new IgniteCheckedException("Failed to initialize cache store (data source is not provided).");
+            throw new IgniteException("Failed to initialize cache store (data source is not provided).");
 
         if (dialect == null)
             dialect = resolveDialect();
     }
 
     /** {@inheritDoc} */
-    @Override public void stop() throws IgniteCheckedException {
+    @Override public void stop() throws IgniteException {
         // No-op.
     }
 
