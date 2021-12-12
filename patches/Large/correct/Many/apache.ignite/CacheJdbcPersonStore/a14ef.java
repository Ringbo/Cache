diff --git a/examples/src/main/java/org/apache/ignite/examples/datagrid/store/jdbc/CacheJdbcPersonStore.java b/examples/src/main/java/org/apache/ignite/examples/datagrid/store/jdbc/CacheJdbcPersonStore.java
index 6388fbf..d80861d 100644
--- a/examples/src/main/java/org/apache/ignite/examples/datagrid/store/jdbc/CacheJdbcPersonStore.java
+++ b/examples/src/main/java/org/apache/ignite/examples/datagrid/store/jdbc/CacheJdbcPersonStore.java
@@ -92,7 +92,7 @@
     }
 
     /** {@inheritDoc} */
-    @Nullable @Override public Person load(Long key) {
+    @Override public Person load(Long key) {
         Transaction tx = transaction();
 
         System.out.println(">>> Store load [key=" + key + ", xid=" + (tx == null ? null : tx.xid()) + ']');
@@ -185,7 +185,7 @@
             }
         }
         catch (SQLException e) {
-            throw new CacheLoaderException("Failed to remove object: " + key, e);
+            throw new CacheWriterException("Failed to remove object: " + key, e);
         }
         finally {
             end(tx, conn);
@@ -302,7 +302,7 @@
     /**
      * @return Current transaction.
      */
-    @Nullable private Transaction transaction() {
+    private Transaction transaction() {
         return ses != null ? ses.transaction() : null;
     }
 }
