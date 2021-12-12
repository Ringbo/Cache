diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java
index f3681ef..7f50f6a 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java
@@ -309,7 +309,7 @@
             int nextPingIn = pingInterval - delta;
             LOGGER.fine("Scheduling ServerPingTask in " + nextPingIn + " seconds (pingInterval="
                             + pingInterval + ", delta=" + delta + ")");
-            nextAutomaticPing = executorService.schedule(pingServerRunnable, pingInterval, TimeUnit.SECONDS);
+            nextAutomaticPing = executorService.schedule(pingServerRunnable, nextPingIn, TimeUnit.SECONDS);
         }
     }
 
