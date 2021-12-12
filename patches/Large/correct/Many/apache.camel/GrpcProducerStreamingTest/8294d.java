diff --git a/components/camel-grpc/src/test/java/org/apache/camel/component/grpc/GrpcProducerStreamingTest.java b/components/camel-grpc/src/test/java/org/apache/camel/component/grpc/GrpcProducerStreamingTest.java
index 53b2321..0a128a4 100644
--- a/components/camel-grpc/src/test/java/org/apache/camel/component/grpc/GrpcProducerStreamingTest.java
+++ b/components/camel-grpc/src/test/java/org/apache/camel/component/grpc/GrpcProducerStreamingTest.java
@@ -82,7 +82,7 @@
             template.sendBody("direct:grpc-stream-async-async-route", PingRequest.newBuilder().setPingName(String.valueOf(i)).build());
         }
 
-        template.sendBody("direct:grpc-stream-async-async-route", PingRequest.newBuilder().setPingName(String.valueOf("error")).build());
+        template.sendBody("direct:grpc-stream-async-async-route", PingRequest.newBuilder().setPingName("error").build());
 
 
 
@@ -90,7 +90,7 @@
         replies.expectedMessageCount(messageGroupCount);
         replies.assertIsSatisfied();
 
-        Thread.sleep(200);
+        Thread.sleep(1000);
 
         for (int i = messageGroupCount + 1; i <= 2 * messageGroupCount; i++) {
             template.sendBody("direct:grpc-stream-async-async-route", PingRequest.newBuilder().setPingName(String.valueOf(i)).build());
