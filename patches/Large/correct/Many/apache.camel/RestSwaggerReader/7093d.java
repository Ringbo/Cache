diff --git a/components/camel-swagger-java/src/main/java/org/apache/camel/swagger/RestSwaggerReader.java b/components/camel-swagger-java/src/main/java/org/apache/camel/swagger/RestSwaggerReader.java
index cd3d58c..c0631b4 100644
--- a/components/camel-swagger-java/src/main/java/org/apache/camel/swagger/RestSwaggerReader.java
+++ b/components/camel-swagger-java/src/main/java/org/apache/camel/swagger/RestSwaggerReader.java
@@ -97,8 +97,9 @@
      * @param config            the swagger configuration
      * @param classResolver     class resolver to use
      * @return the swagger model
+     * @throws ClassNotFoundException 
      */
-    public Swagger read(List<RestDefinition> rests, String route, BeanConfig config, String camelContextId, ClassResolver classResolver) {
+    public Swagger read(List<RestDefinition> rests, String route, BeanConfig config, String camelContextId, ClassResolver classResolver) throws ClassNotFoundException {
         Swagger swagger = new Swagger();
 
         for (RestDefinition rest : rests) {
@@ -118,7 +119,7 @@
         return swagger;
     }
 
-    private void parse(Swagger swagger, RestDefinition rest, String camelContextId, ClassResolver classResolver) {
+    private void parse(Swagger swagger, RestDefinition rest, String camelContextId, ClassResolver classResolver) throws ClassNotFoundException {
         List<VerbDefinition> verbs = new ArrayList<>(rest.getVerbs());
         // must sort the verbs by uri so we group them together when an uri has multiple operations
         Collections.sort(verbs, new VerbOrdering());
@@ -223,7 +224,7 @@
 
         // use annotation scanner to find models (annotated classes)
         for (String type : types) {
-            Class<?> clazz = classResolver.resolveClass(type);
+            Class<?> clazz = classResolver.resolveMandatoryClass(type);
             appendModels(clazz, swagger);
         }
 
