diff --git a/core/src/main/java/com/google/bitcoin/testing/TestWithNetworkConnections.java b/core/src/main/java/com/google/bitcoin/testing/TestWithNetworkConnections.java
index aaa5e88..fb32958 100644
--- a/core/src/main/java/com/google/bitcoin/testing/TestWithNetworkConnections.java
+++ b/core/src/main/java/com/google/bitcoin/testing/TestWithNetworkConnections.java
@@ -232,7 +232,7 @@
         return p1.nextMessage();
     }
 
-    protected Object waitForOutbound(InboundMessageQueuer ch) throws InterruptedException {
+    protected Message waitForOutbound(InboundMessageQueuer ch) throws InterruptedException {
         return ch.nextMessageBlocking();
     }
 
