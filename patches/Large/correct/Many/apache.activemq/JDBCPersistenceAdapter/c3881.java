diff --git a/activemq-core/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java b/activemq-core/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java
index 3e18caa..40a3264 100755
--- a/activemq-core/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java
+++ b/activemq-core/src/main/java/org/apache/activemq/store/jdbc/JDBCPersistenceAdapter.java
@@ -215,7 +215,7 @@
 
         // Cleanup the db periodically.
         if (cleanupPeriod > 0) {
-            cleanupTicket = getScheduledThreadPoolExecutor().scheduleAtFixedRate(new Runnable() {
+            cleanupTicket = getScheduledThreadPoolExecutor().scheduleWithFixedDelay(new Runnable() {
                 public void run() {
                     cleanup();
                 }
