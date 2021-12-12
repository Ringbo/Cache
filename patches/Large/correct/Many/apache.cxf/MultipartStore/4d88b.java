diff --git a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/MultipartStore.java b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/MultipartStore.java
index 77d0376..534df2a 100644
--- a/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/MultipartStore.java
+++ b/systests/jaxrs/src/test/java/org/apache/cxf/systest/jaxrs/MultipartStore.java
@@ -147,7 +147,7 @@
     @Path("/books/testnullpart")
     @Consumes("multipart/form-data")
     @Produces("text/plain")
-    public String testNullPart(@Multipart(value = "someid", errorIfMissing = false) String value) {
+    public String testNullPart(@Multipart(value = "someid", required = false) String value) {
         if (value != null) {
             return value;
         } else {
