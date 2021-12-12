diff --git a/platform/platform-api/src/com/intellij/execution/configurations/PtyCommandLine.java b/platform/platform-api/src/com/intellij/execution/configurations/PtyCommandLine.java
index 7f793f7..65f2198 100644
--- a/platform/platform-api/src/com/intellij/execution/configurations/PtyCommandLine.java
+++ b/platform/platform-api/src/com/intellij/execution/configurations/PtyCommandLine.java
@@ -70,10 +70,10 @@
           logContent = "Unable to retrieve log: " + e.getMessage();
         }
 
-        LOG.error("Couldn't run process with PTY", t, logContent);
+        LOG.debug("Couldn't run process with PTY", t, logContent);
       }
       else {
-        LOG.error("Couldn't run process with PTY", t);
+        LOG.debug("Couldn't run process with PTY", t);
       }
     }
 
