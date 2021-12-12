diff --git a/src/java/org/jivesoftware/messenger/SessionManager.java b/src/java/org/jivesoftware/messenger/SessionManager.java
index 730e3ac..6809359 100644
--- a/src/java/org/jivesoftware/messenger/SessionManager.java
+++ b/src/java/org/jivesoftware/messenger/SessionManager.java
@@ -894,7 +894,9 @@
     public void removeSession(ClientSession session) {
         // TODO: Requires better error checking to ensure the session count is maintained
         // TODO: properly (removal actually does remove).
-        if (session == null) {
+        // Do nothing if session is null or if the server is shutting down. Note: When the server
+        // is shutting down the serverName will be null.
+        if (session == null || serverName == null) {
             return;
         }
         SessionMap sessionMap = null;
