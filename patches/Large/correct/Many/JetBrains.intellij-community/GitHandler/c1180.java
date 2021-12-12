diff --git a/plugins/git4idea/src/git4idea/commands/GitHandler.java b/plugins/git4idea/src/git4idea/commands/GitHandler.java
index c6e68ff..cdd3136 100644
--- a/plugins/git4idea/src/git4idea/commands/GitHandler.java
+++ b/plugins/git4idea/src/git4idea/commands/GitHandler.java
@@ -597,10 +597,10 @@
     if (myEnvironmentCleanedUp) {
       return;
     }
-    if (mySshHandler > 0) {
+    if (mySshHandler >= 0) {
       ServiceManager.getService(GitXmlRpcSshService.class).unregisterHandler(mySshHandler);
     }
-    if (myHttpHandler > 0) {
+    if (myHttpHandler >= 0) {
       ServiceManager.getService(GitHttpAuthService.class).unregisterHandler(myHttpHandler);
     }
     myEnvironmentCleanedUp = true;
