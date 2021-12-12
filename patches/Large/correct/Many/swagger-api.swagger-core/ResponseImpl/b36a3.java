diff --git a/modules/swagger-models/src/main/java/io/swagger/models/ResponseImpl.java b/modules/swagger-models/src/main/java/io/swagger/models/ResponseImpl.java
index 1268977..732460c 100644
--- a/modules/swagger-models/src/main/java/io/swagger/models/ResponseImpl.java
+++ b/modules/swagger-models/src/main/java/io/swagger/models/ResponseImpl.java
@@ -13,19 +13,19 @@
     private Map<String, Property> headers;
 
     @Override
-    public ResponseImpl schema(Property property) {
+    public Response schema(Property property) {
         this.setSchema(property);
         return this;
     }
 
     @Override
-    public ResponseImpl description(String description) {
+    public Response description(String description) {
         this.setDescription(description);
         return this;
     }
 
     @Override
-    public ResponseImpl example(String type, Object example) {
+    public Response example(String type, Object example) {
         if (examples == null) {
             examples = new HashMap<String, Object>();
         }
@@ -34,13 +34,13 @@
     }
 
     @Override
-    public ResponseImpl header(String name, Property property) {
+    public Response header(String name, Property property) {
         addHeader(name, property);
         return this;
     }
 
     @Override
-    public ResponseImpl headers(Map<String, Property> headers) {
+    public Response headers(Map<String, Property> headers) {
         this.headers = headers;
         return this;
     }
