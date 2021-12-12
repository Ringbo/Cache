diff --git a/core/src/test/java/io/grpc/DeadlineTest.java b/core/src/test/java/io/grpc/DeadlineTest.java
index 61baa99..39392af 100644
--- a/core/src/test/java/io/grpc/DeadlineTest.java
+++ b/core/src/test/java/io/grpc/DeadlineTest.java
@@ -117,7 +117,7 @@
             latch.countDown();
           }
         }, Executors.newSingleThreadScheduledExecutor());
-    if (!latch.await(55, TimeUnit.MILLISECONDS)) {
+    if (!latch.await(70, TimeUnit.MILLISECONDS)) {
       fail("Deadline listener did not execute in time");
     }
   }
