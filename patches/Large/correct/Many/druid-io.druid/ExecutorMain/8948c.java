diff --git a/merger/src/main/java/com/metamx/druid/merger/worker/executor/ExecutorMain.java b/merger/src/main/java/com/metamx/druid/merger/worker/executor/ExecutorMain.java
index b55060b..f495aad 100644
--- a/merger/src/main/java/com/metamx/druid/merger/worker/executor/ExecutorMain.java
+++ b/merger/src/main/java/com/metamx/druid/merger/worker/executor/ExecutorMain.java
@@ -37,7 +37,7 @@
   {
     LogLevelAdjuster.register();
 
-    if (args.length != 3) {
+    if (args.length != 2) {
       log.info("Usage: ExecutorMain <task.json> <status.json>");
       System.exit(2);
     }
