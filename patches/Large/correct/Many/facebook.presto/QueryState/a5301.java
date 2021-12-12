diff --git a/presto-main/src/main/java/com/facebook/presto/server/QueryState.java b/presto-main/src/main/java/com/facebook/presto/server/QueryState.java
index 89de18c..40d4e8e 100644
--- a/presto-main/src/main/java/com/facebook/presto/server/QueryState.java
+++ b/presto-main/src/main/java/com/facebook/presto/server/QueryState.java
@@ -127,12 +127,12 @@
 
     public int getStartedSplits()
     {
-        return Ints.min(startedSplits.get(), completedSplits.get(), splits);
+        return Ints.min(startedSplits.get(), splits);
     }
 
     public int getCompletedSplits()
     {
-        return Ints.min(completedSplits.get(), splits);
+        return Ints.min(completedSplits.get(), startedSplits.get(), splits);
     }
 
     public int getBufferedPageCount()
