diff --git a/h2o-core/src/main/java/water/Job.java b/h2o-core/src/main/java/water/Job.java
index 00d3bc9..8643931 100644
--- a/h2o-core/src/main/java/water/Job.java
+++ b/h2o-core/src/main/java/water/Job.java
@@ -134,7 +134,7 @@
    */
   public Job<T> start(final H2OCountedCompleter fjtask, long work) {
     // FIXME: Do not override shared progress key
-    if (work > 0) DKV.put(_progressKey = createProgressKey(), new Progress(work));
+    if (work >= 0) DKV.put(_progressKey = createProgressKey(), new Progress(work));
     assert _state == JobState.CREATED : "Trying to run job which was already run?";
     assert fjtask != null : "Starting a job with null working task is not permitted!";
     assert fjtask.getCompleter() == null : "Cannot have a completer; this must be a top-level task";
