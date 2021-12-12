diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter.java
index abc2bf4..c23739b 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/security/KerberosAuthenticationFilter.java
@@ -73,7 +73,7 @@
         
         List<String> authHeaders = messageContext.getHttpHeaders()
             .getRequestHeader(HttpHeaders.AUTHORIZATION);
-        if (authHeaders.size() != 1) {
+        if (authHeaders == null || authHeaders.size() != 1) {
             LOG.fine("No Authorization header is available");
             throw ExceptionUtils.toNotAuthorizedException(null, getFaultResponse());
         }
