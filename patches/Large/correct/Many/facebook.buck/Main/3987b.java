diff --git a/src/com/facebook/buck/cli/Main.java b/src/com/facebook/buck/cli/Main.java
index 76fdd9b..f5b963c 100644
--- a/src/com/facebook/buck/cli/Main.java
+++ b/src/com/facebook/buck/cli/Main.java
@@ -1777,13 +1777,12 @@
           }
 
           // Do not log anything in case we do not have space on the disk
-          if (exitCode == ExitCode.FATAL_DISK_FULL) {
+          if (exitCode != ExitCode.FATAL_DISK_FULL) {
             LOG.error(e, "Uncaught exception from thread %s", t);
           }
 
           if (context.isPresent()) {
             // Shut down the Nailgun server and make sure it stops trapping System.exit().
-            //
             // We pass false for exitVM because otherwise Nailgun exits with code 0.
             context.get().getNGServer().shutdown(/* exitVM */ false);
           }
