diff --git a/components/camel-mina/src/test/java/org/apache/camel/component/mina/MinaTcpWithInOutUsingPlainSocketTest.java b/components/camel-mina/src/test/java/org/apache/camel/component/mina/MinaTcpWithInOutUsingPlainSocketTest.java
index 1759087..aa85025 100644
--- a/components/camel-mina/src/test/java/org/apache/camel/component/mina/MinaTcpWithInOutUsingPlainSocketTest.java
+++ b/components/camel-mina/src/test/java/org/apache/camel/component/mina/MinaTcpWithInOutUsingPlainSocketTest.java
@@ -39,7 +39,7 @@
     protected CamelContext container = new DefaultCamelContext();
 
     // use parameter sync=true to force InOut pattern of the MinaExchange
-    protected String uri = "mina:tcp://localhost:9888?textline=true&sync=true";
+    protected String uri = "mina:tcp://localhost:6333?textline=true&sync=true";
 
     public void testSendAndReceiveOnce() throws Exception {
         String response = sendAndReceive("World");
@@ -81,7 +81,7 @@
         byte buf[] = new byte[128];
 
         Socket soc = new Socket();
-        soc.connect(new InetSocketAddress("localhost", 8888));
+        soc.connect(new InetSocketAddress("localhost", 6333));
 
         // Send message using plain Socket to test if this works
         OutputStream os = null;
