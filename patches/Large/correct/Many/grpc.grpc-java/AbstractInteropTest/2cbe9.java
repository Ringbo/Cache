diff --git a/interop-testing/src/main/java/io/grpc/testing/integration/AbstractInteropTest.java b/interop-testing/src/main/java/io/grpc/testing/integration/AbstractInteropTest.java
index c5e5e85..e18b341 100644
--- a/interop-testing/src/main/java/io/grpc/testing/integration/AbstractInteropTest.java
+++ b/interop-testing/src/main/java/io/grpc/testing/integration/AbstractInteropTest.java
@@ -994,7 +994,7 @@
                 .build()).next();
   }
 
-  @Test(timeout = 10000)
+  @Test(timeout = 25000)
   public void deadlineExceeded() throws Exception {
     // warm up the channel and JVM
     blockingStub.emptyCall(Empty.getDefaultInstance());
@@ -1002,7 +1002,7 @@
         blockingStub.withDeadlineAfter(10, TimeUnit.MILLISECONDS);
     StreamingOutputCallRequest request = StreamingOutputCallRequest.newBuilder()
         .addResponseParameters(ResponseParameters.newBuilder()
-            .setIntervalUs(20000))
+            .setIntervalUs((int) TimeUnit.SECONDS.toMicros(20)))
         .build();
     try {
       stub.streamingOutputCall(request).next();
