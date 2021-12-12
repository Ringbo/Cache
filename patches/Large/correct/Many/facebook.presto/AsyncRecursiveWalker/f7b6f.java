diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/util/AsyncRecursiveWalker.java b/presto-hive/src/main/java/com/facebook/presto/hive/util/AsyncRecursiveWalker.java
index 7632e5e..1e5788f 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/util/AsyncRecursiveWalker.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/util/AsyncRecursiveWalker.java
@@ -71,7 +71,7 @@
                 else {
                     callback.process(entry.getFileStatus(), entry.getBlockLocations());
                 }
-                if (future.isCancelled()) {
+                if (future.isDone()) {
                     return;
                 }
             }
