diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/security/JAASAuthenticationFilter.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/security/JAASAuthenticationFilter.java
index 7c5b861..2fdb6cb 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/security/JAASAuthenticationFilter.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/security/JAASAuthenticationFilter.java
@@ -127,7 +127,7 @@
             StringBuilder sb = new StringBuilder();
             
             List<String> authHeader = headers.getRequestHeader(HttpHeaders.AUTHORIZATION);
-            if (authHeader.size() > 0) {
+            if (authHeader != null && authHeader.size() > 0) {
                 // should HttpHeadersImpl do it ?
                 String[] authValues = StringUtils.split(authHeader.get(0), " ");
                 if (authValues.length > 0) {
