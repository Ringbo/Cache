diff --git a/rt/rs/security/http-signature/src/main/java/org/apache/cxf/rs/security/httpsignature/filters/VerifySignatureFilter.java b/rt/rs/security/http-signature/src/main/java/org/apache/cxf/rs/security/httpsignature/filters/VerifySignatureFilter.java
index 434f9f8..37c8691 100644
--- a/rt/rs/security/http-signature/src/main/java/org/apache/cxf/rs/security/httpsignature/filters/VerifySignatureFilter.java
+++ b/rt/rs/security/http-signature/src/main/java/org/apache/cxf/rs/security/httpsignature/filters/VerifySignatureFilter.java
@@ -64,7 +64,7 @@
         LOG.fine("Starting filter message verification process");
         MultivaluedMap<String, String> responseHeaders = requestCtx.getHeaders();
         messageVerifier.verifyMessage(responseHeaders,
-                requestCtx.getUriInfo().getAbsolutePath().getPath(), requestCtx.getMethod());
+                                      requestCtx.getMethod(), requestCtx.getUriInfo().getAbsolutePath().getPath());
         LOG.fine("Finished filter message verification process");
     }
 
