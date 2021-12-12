diff --git a/modules/swagger-models/src/main/java/io/swagger/models/RefResponse.java b/modules/swagger-models/src/main/java/io/swagger/models/RefResponse.java
index 3cce777..b677597 100644
--- a/modules/swagger-models/src/main/java/io/swagger/models/RefResponse.java
+++ b/modules/swagger-models/src/main/java/io/swagger/models/RefResponse.java
@@ -52,27 +52,27 @@
     }
 
     @Override
-    public ResponseImpl schema(Property property) {
+    public Response schema(Property property) {
         throw new RuntimeException("Not implemented");
     }
 
     @Override
-    public ResponseImpl description(String description) {
+    public Response description(String description) {
         throw new RuntimeException("Not implemented");
     }
 
     @Override
-    public ResponseImpl example(String type, Object example) {
+    public Response example(String type, Object example) {
         throw new RuntimeException("Not implemented");
     }
 
     @Override
-    public ResponseImpl header(String name, Property property) {
+    public Response header(String name, Property property) {
         throw new RuntimeException("Not implemented");
     }
 
     @Override
-    public ResponseImpl headers(Map<String, Property> headers) {
+    public Response headers(Map<String, Property> headers) {
         throw new RuntimeException("Not implemented");
     }
 
