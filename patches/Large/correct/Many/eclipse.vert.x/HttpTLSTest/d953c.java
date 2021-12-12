diff --git a/src/test/java/io/vertx/test/core/HttpTLSTest.java b/src/test/java/io/vertx/test/core/HttpTLSTest.java
index 0014e8a..935bd8a 100644
--- a/src/test/java/io/vertx/test/core/HttpTLSTest.java
+++ b/src/test/java/io/vertx/test/core/HttpTLSTest.java
@@ -245,7 +245,7 @@
   @Test
   // Client specifies cert that the server does not trust via a revoked certificate of the CA
   public void testTLSRevokedClientCertServer() throws Exception {
-    testTLS(Cert.CLIENT_PEM_ROOT_CA, Trust.SERVER_JKS, Cert.SERVER_JKS, Trust.CLIENT_PEM_ROOT_CA).requiresClientAuth().clientUsesCrl().fail();
+    testTLS(Cert.CLIENT_PEM_ROOT_CA, Trust.SERVER_JKS, Cert.SERVER_JKS, Trust.CLIENT_PEM_ROOT_CA).requiresClientAuth().serverUsesCrl().fail();
   }
 
   @Test
@@ -569,7 +569,7 @@
             response.bodyHandler(data -> assertEquals("bar", data.toString()));
             testComplete();
           } else {
-            fail();
+            HttpTLSTest.this.fail("Should not get a response");
           }
         });
         req.exceptionHandler(t -> {
@@ -783,7 +783,7 @@
   // Check that proxy auth fails if it is missing
   public void testHttpsProxyAuthFail() throws Exception {
     startProxy("username", ProxyType.HTTP);
-    testTLS(Cert.NONE, Trust.SERVER_JKS, Cert.SERVER_JKS, Trust.NONE).useProxy().useProxyAuth().fail();
+    testTLS(Cert.NONE, Trust.SERVER_JKS, Cert.SERVER_JKS, Trust.NONE).useProxy().fail();
   }
 
   @Test
