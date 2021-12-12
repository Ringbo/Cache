diff --git a/src/java/org/jivesoftware/messenger/XMPPServer.java b/src/java/org/jivesoftware/messenger/XMPPServer.java
index bb4544c..c8767e0 100644
--- a/src/java/org/jivesoftware/messenger/XMPPServer.java
+++ b/src/java/org/jivesoftware/messenger/XMPPServer.java
@@ -414,7 +414,7 @@
                     "Please verify your database settings and check the " +
                     "logs/error.log file for detailed error messages.");
             Log.error("Database could not be accessed", e);
-            throw new IllegalArgumentException();
+            throw new IllegalArgumentException(e);
         }
         finally {
             if (conn != null) {
