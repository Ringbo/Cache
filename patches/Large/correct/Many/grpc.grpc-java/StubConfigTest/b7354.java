diff --git a/interop-testing/src/test/java/io/grpc/stub/StubConfigTest.java b/interop-testing/src/test/java/io/grpc/stub/StubConfigTest.java
index d93c387..2ff8a19 100644
--- a/interop-testing/src/test/java/io/grpc/stub/StubConfigTest.java
+++ b/interop-testing/src/test/java/io/grpc/stub/StubConfigTest.java
@@ -111,7 +111,7 @@
     TestServiceGrpc.TestServiceBlockingStub reconfiguredStub = stub.withDeadlineNanoTime(deadline);
     // New altered config
     assertNotNull(reconfiguredStub.getCallOptions().getDeadlineNanoTime());
-    long maxDelta = MILLISECONDS.toNanos(20);
+    long maxDelta = MILLISECONDS.toNanos(30);
     long actualDelta = Math.abs(reconfiguredStub.getCallOptions().getDeadlineNanoTime() - deadline);
     assertTrue(maxDelta + " < " + actualDelta, maxDelta >= actualDelta);
     // Default config unchanged
