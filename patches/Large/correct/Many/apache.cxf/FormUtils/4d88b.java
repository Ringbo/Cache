diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/FormUtils.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/FormUtils.java
index cc1f69a..dd344fd 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/FormUtils.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/utils/FormUtils.java
@@ -157,7 +157,7 @@
                 || cd.getParameter("name") == null) {
                 Multipart id = AnnotationUtils.getAnnotation(anns, Multipart.class);
                 
-                if (id == null || id.errorIfMissing()) {
+                if (id == null || id.required()) {
                     throw new WebApplicationException(400);
                 } else {
                     return;
