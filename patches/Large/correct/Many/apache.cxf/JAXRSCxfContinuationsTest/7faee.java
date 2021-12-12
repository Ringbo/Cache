diff --git a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSCxfContinuationsTest.java b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSCxfContinuationsTest.java
index a2bf33f..dc69ab8 100644
--- a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSCxfContinuationsTest.java
+++ b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSCxfContinuationsTest.java
@@ -96,7 +96,7 @@
         private String expected;
         private CountDownLatch startSignal;
         private CountDownLatch doneSignal;
-        public BookWorker(String address,
+        BookWorker(String address,
                           String id,
                           String expected,
                            CountDownLatch startSignal,
