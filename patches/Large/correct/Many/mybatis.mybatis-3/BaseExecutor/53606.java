diff --git a/src/main/java/org/apache/ibatis/executor/BaseExecutor.java b/src/main/java/org/apache/ibatis/executor/BaseExecutor.java
index b059404..d2e636d 100644
--- a/src/main/java/org/apache/ibatis/executor/BaseExecutor.java
+++ b/src/main/java/org/apache/ibatis/executor/BaseExecutor.java
@@ -179,7 +179,7 @@
     if (!closed) {
       try {
         clearLocalCache();
-        flushStatements(false);
+        flushStatements(true);
       } finally {
         if (required) {
           transaction.rollback();
