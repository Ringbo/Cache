diff --git a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSLocalTransportTest.java b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSLocalTransportTest.java
index 0245cb9..678df1d 100644
--- a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSLocalTransportTest.java
+++ b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/JAXRSLocalTransportTest.java
@@ -235,11 +235,11 @@
     }
     
     private static class TestFaultInInterceptor extends AbstractPhaseInterceptor<Message> {
-        public TestFaultInInterceptor() {
+        TestFaultInInterceptor() {
             this(Phase.PRE_STREAM);
         }
 
-        public TestFaultInInterceptor(String s) {
+        TestFaultInInterceptor(String s) {
             super(Phase.PRE_STREAM);
             
         } 
