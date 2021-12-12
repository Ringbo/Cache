diff --git a/src/java/org/jivesoftware/wildfire/http/HttpSession.java b/src/java/org/jivesoftware/wildfire/http/HttpSession.java
index 5a417cd..1227105 100644
--- a/src/java/org/jivesoftware/wildfire/http/HttpSession.java
+++ b/src/java/org/jivesoftware/wildfire/http/HttpSession.java
@@ -505,7 +505,7 @@
         boolean delivered = false;
         for (HttpConnection connection : connectionQueue) {
             try {
-                if (connection.getRequestId() == lastRequestID + 1) {
+                if (connection.getRequestId() <= lastRequestID + 1) {
                     deliver(connection, deliverable);
                     delivered = true;
                     lastRequestID = connection.getRequestId();
