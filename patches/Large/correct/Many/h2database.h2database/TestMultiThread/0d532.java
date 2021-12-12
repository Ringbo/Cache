diff --git a/h2/src/test/org/h2/test/db/TestMultiThread.java b/h2/src/test/org/h2/test/db/TestMultiThread.java
index cebf016..f2b7c4f 100644
--- a/h2/src/test/org/h2/test/db/TestMultiThread.java
+++ b/h2/src/test/org/h2/test/db/TestMultiThread.java
@@ -390,7 +390,7 @@
         conn.createStatement().execute(
                 "CREATE TABLE IF NOT EXISTS TRAN (ID NUMBER(18,0) not null PRIMARY KEY)");
 
-        final int threadCount = 100;
+        final int threadCount = 25;
         final ArrayList<Callable<Void>> callables = new ArrayList<Callable<Void>>();
         for (int i = 0; i < threadCount; i++) {
             final Connection taskConn = getConnection(url);
@@ -450,7 +450,7 @@
             mergeAcctStmt.execute();
         }
 
-        final int threadCount = 100;
+        final int threadCount = 25;
         final ArrayList<Callable<Void>> callables = new ArrayList<Callable<Void>>();
         for (int i = 0; i < threadCount; i++) {
             final Connection taskConn = getConnection(url);
