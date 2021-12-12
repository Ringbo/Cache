diff --git a/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/InvocationFuture.java b/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/InvocationFuture.java
index 1e15766..88ea044 100644
--- a/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/InvocationFuture.java
+++ b/hazelcast/src/main/java/com/hazelcast/spi/impl/operationservice/impl/InvocationFuture.java
@@ -136,7 +136,7 @@
                 // this is no good; no logging while holding a lock
                 ILogger logger = invocation.logger;
                 if (logger.isFinestEnabled()) {
-                    logger.info("Future response is already set! Current response: "
+                    logger.finest("Future response is already set! Current response: "
                             + response + ", Offered response: " + offeredResponse + ", Invocation: " + invocation);
                 }
                 return;
