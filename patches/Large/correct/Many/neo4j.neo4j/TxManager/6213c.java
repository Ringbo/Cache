diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/TxManager.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/TxManager.java
index 6ca8218..27052ca 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/TxManager.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/TxManager.java
@@ -135,7 +135,7 @@
     }
 
     @Override
-    public void start()
+    public synchronized void start()
             throws Throwable
     {
         openLog();
@@ -174,7 +174,7 @@
     }
 
     @Override
-    public void stop()
+    public synchronized void stop()
     {
         recovered = false;
         xaDataSourceManager.removeDataSourceRegistrationListener( dataSourceRegistrationListener );
