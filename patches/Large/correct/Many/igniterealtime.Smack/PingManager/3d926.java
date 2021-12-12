diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java
index af201ff..7f5d1a6 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/ping/PingManager.java
@@ -308,7 +308,7 @@
             int nextPingIn = pingInterval - delta;
             LOGGER.fine("Scheduling ServerPingTask in " + nextPingIn + " seconds (pingInterval="
                             + pingInterval + ", delta=" + delta + ")");
-            nextAutomaticPing = schedule(pingServerRunnable, pingInterval, TimeUnit.SECONDS);
+            nextAutomaticPing = schedule(pingServerRunnable, nextPingIn, TimeUnit.SECONDS);
         }
     }
 
