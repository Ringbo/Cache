diff --git a/src/java/org/jivesoftware/wildfire/http/HttpSession.java b/src/java/org/jivesoftware/wildfire/http/HttpSession.java
index 508f9e3..7bdf91c 100644
--- a/src/java/org/jivesoftware/wildfire/http/HttpSession.java
+++ b/src/java/org/jivesoftware/wildfire/http/HttpSession.java
@@ -641,7 +641,8 @@
 
         public void updateLastRequestId(HttpConnection request) {
             for(int i = 0; i < connections.length; i ++) {
-                if(connections[i].getRequestId() == request.getRequestId()) {
+                if(connections[i] != null
+                        && connections[i].getRequestId() == request.getRequestId()) {
                     connections[i] = null;
                     lastRequestId = request.getRequestId();
                     return;
