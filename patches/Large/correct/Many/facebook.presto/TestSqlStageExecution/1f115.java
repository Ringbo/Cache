diff --git a/presto-main/src/test/java/com/facebook/presto/execution/TestSqlStageExecution.java b/presto-main/src/test/java/com/facebook/presto/execution/TestSqlStageExecution.java
index 2afc620..4325b17 100644
--- a/presto-main/src/test/java/com/facebook/presto/execution/TestSqlStageExecution.java
+++ b/presto-main/src/test/java/com/facebook/presto/execution/TestSqlStageExecution.java
@@ -173,7 +173,7 @@
 
         // The stage scheduler will block and this will cause a timeout exception
         try {
-            future1.get(1, TimeUnit.SECONDS);
+            future1.get(2, TimeUnit.SECONDS);
         }
         catch (TimeoutException e) {
             // expected
@@ -512,7 +512,7 @@
             @Override
             public int getQueuedPartitionedSplitCount()
             {
-                return 0;
+                return getPartitionedSplitCount();
             }
         }
     }
