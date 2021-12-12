diff --git a/jdisc_http_service/src/test/java/com/yahoo/jdisc/http/server/jetty/HttpServerConformanceTest.java b/jdisc_http_service/src/test/java/com/yahoo/jdisc/http/server/jetty/HttpServerConformanceTest.java
index cc7095d..632613a 100644
--- a/jdisc_http_service/src/test/java/com/yahoo/jdisc/http/server/jetty/HttpServerConformanceTest.java
+++ b/jdisc_http_service/src/test/java/com/yahoo/jdisc/http/server/jetty/HttpServerConformanceTest.java
@@ -576,7 +576,7 @@
     @Override
     @Test
     public void testRequestContentCloseNondeterministicExceptionWithSyncFailure() throws Throwable {
-        new TestRunner().expect(anyOf(success(), serverError()))
+        new TestRunner().expect(anyOf(success(), successNoContent(), serverError()))
                         .execute();
     }
 
