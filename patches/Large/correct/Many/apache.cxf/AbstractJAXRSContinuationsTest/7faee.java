diff --git a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/AbstractJAXRSContinuationsTest.java b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/AbstractJAXRSContinuationsTest.java
index b621a23..9fc9d88 100644
--- a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/AbstractJAXRSContinuationsTest.java
+++ b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/AbstractJAXRSContinuationsTest.java
@@ -179,7 +179,7 @@
         private CountDownLatch startSignal;
         private CountDownLatch doneSignal;
         private Exception error;
-        public BookWorker(String address,
+        BookWorker(String address,
                           String id,
                           String expected,
                            CountDownLatch startSignal,
