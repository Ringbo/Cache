diff --git a/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyRedeliveryTest.java b/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyRedeliveryTest.java
index ab394da..7e45577 100644
--- a/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyRedeliveryTest.java
+++ b/components/camel-netty4/src/test/java/org/apache/camel/component/netty4/NettyRedeliveryTest.java
@@ -196,7 +196,7 @@
     private class ClosingClientRunnable implements Runnable {
         private final Socket socket;
 
-        public ClosingClientRunnable(Socket socket) {
+        ClosingClientRunnable(Socket socket) {
             this.socket = socket;
         }
 
