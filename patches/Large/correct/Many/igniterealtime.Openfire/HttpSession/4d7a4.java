diff --git a/src/java/org/jivesoftware/wildfire/http/HttpSession.java b/src/java/org/jivesoftware/wildfire/http/HttpSession.java
index b111f5b..5922dec 100644
--- a/src/java/org/jivesoftware/wildfire/http/HttpSession.java
+++ b/src/java/org/jivesoftware/wildfire/http/HttpSession.java
@@ -106,7 +106,9 @@
         }
 
         connection.setSession(this);
-        if (pendingElements.size() > 0) {
+        // We aren't supposed to hold connections open or we already have some packets waiting
+        // to be sent to the client.
+        if (hold <= 0 || pendingElements.size() > 0) {
             String deliverable = createDeliverable(pendingElements);
             try {
                 fireConnectionOpened(connection);
@@ -121,7 +123,7 @@
         else {
             // With this connection we need to check if we will have too many connections open,
             // closing any extras.
-            while (hold > 0 && connectionQueue.size() >= hold) {
+            while (connectionQueue.size() >= hold) {
                 HttpConnection toClose = connectionQueue.remove();
                 toClose.close();
                 fireConnectionClosed(toClose);
@@ -157,7 +159,7 @@
 
     private void checkPollingInterval() throws HttpBindException {
         long time = System.currentTimeMillis();
-        if(lastPoll > 0  && ((time - lastPoll) / 1000) < maxPollingInterval) {
+        if(((time - lastPoll) / 1000) < maxPollingInterval) {
             throw new HttpBindException("Too frequent polling minimum interval is "
                     + maxPollingInterval + ", current interval " + ((lastPoll - time) / 1000),
                     true, 403);
