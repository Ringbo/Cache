diff --git a/server/src/main/java/com/metamx/druid/index/v1/IncrementalIndexStorageAdapter.java b/server/src/main/java/com/metamx/druid/index/v1/IncrementalIndexStorageAdapter.java
index bf8e0ac..8ec2cc1 100644
--- a/server/src/main/java/com/metamx/druid/index/v1/IncrementalIndexStorageAdapter.java
+++ b/server/src/main/java/com/metamx/druid/index/v1/IncrementalIndexStorageAdapter.java
@@ -164,7 +164,7 @@
                                 timeStart, new String[][]{}
                             ),
                             new IncrementalIndex.TimeAndDims(
-                                Math.min(actualInterval.getEndMillis(), gran.next(timeStart)), new String[][]{}
+                                Math.min(actualInterval.getEndMillis(), gran.next(input)), new String[][]{}
                             )
                         );
                         time = gran.toDateTime(input);
