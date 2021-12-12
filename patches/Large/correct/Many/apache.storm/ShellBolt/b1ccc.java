diff --git a/storm-core/src/jvm/backtype/storm/task/ShellBolt.java b/storm-core/src/jvm/backtype/storm/task/ShellBolt.java
index f34d465..17938dc 100644
--- a/storm-core/src/jvm/backtype/storm/task/ShellBolt.java
+++ b/storm-core/src/jvm/backtype/storm/task/ShellBolt.java
@@ -241,8 +241,8 @@
 
     private void die(Throwable exception) {
         _exception = exception;
-        LOG.info("Halting process: ShellBolt died.", exception);
+        LOG.error("Halting process: ShellBolt died.", exception);
         _collector.reportError(exception);
-        Runtime.getRuntime().halt(11);
+        System.exit(11);
     }
 }
