diff --git a/src/com/facebook/buck/distributed/build_client/BuildPhase.java b/src/com/facebook/buck/distributed/build_client/BuildPhase.java
index e47759a..65b935f 100644
--- a/src/com/facebook/buck/distributed/build_client/BuildPhase.java
+++ b/src/com/facebook/buck/distributed/build_client/BuildPhase.java
@@ -538,7 +538,7 @@
                   elapseMillisSinceFirstFinishedStatus));
           return; // Events are still missing, and we haven't timed out, so poll again.
         } else {
-          LOG.error(
+          LOG.warn(
               String.format(
                   "%d ms elapsed since build job marked as finished, but still missing finished status from some workers.",
                   elapseMillisSinceFirstFinishedStatus));
@@ -553,7 +553,7 @@
                   elapseMillisSinceFirstFinishedStatus));
           return; // Events are still missing, and we haven't timed out, so poll again.
         } else {
-          LOG.error(
+          LOG.warn(
               String.format(
                   "%d ms elapsed since build job marked as finished, but still missing build rule finished events.",
                   elapseMillisSinceFirstFinishedStatus));
