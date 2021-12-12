diff --git a/activemq-amqp/src/test/java/org/apache/activemq/transport/amqp/IDERunner.java b/activemq-amqp/src/test/java/org/apache/activemq/transport/amqp/IDERunner.java
index 7067605..0ef8b77 100644
--- a/activemq-amqp/src/test/java/org/apache/activemq/transport/amqp/IDERunner.java
+++ b/activemq-amqp/src/test/java/org/apache/activemq/transport/amqp/IDERunner.java
@@ -27,7 +27,7 @@
 public class IDERunner {
 
     private static final String AMQP_TRANSFORMER = "jms";
-    private static final boolean TRANSPORT_TRACE = true;
+    private static final boolean TRANSPORT_TRACE = false;
     private static final boolean PERSISTENT = true;
     private static final boolean CLIENT_CONNECT = false;
 
@@ -37,7 +37,7 @@
         TransportConnector connector = brokerService.addConnector(
             "amqp://0.0.0.0:5672?trace=" + TRANSPORT_TRACE +
                 "&transport.transformer=" + AMQP_TRANSFORMER +
-                "&transport.wireFormat.maxAmqpFrameSize=104857600");
+                "&transport.wireFormat.maxFrameSize=104857600");
 
         KahaDBStore store = new KahaDBStore();
         store.setDirectory(new File("target/activemq-data/kahadb"));
