diff --git a/components/camel-swagger-java/src/test/java/org/apache/camel/swagger/RestSwaggerArrayEnumTest.java b/components/camel-swagger-java/src/test/java/org/apache/camel/swagger/RestSwaggerArrayEnumTest.java
index e3276a0..6672215 100644
--- a/components/camel-swagger-java/src/test/java/org/apache/camel/swagger/RestSwaggerArrayEnumTest.java
+++ b/components/camel-swagger-java/src/test/java/org/apache/camel/swagger/RestSwaggerArrayEnumTest.java
@@ -36,7 +36,7 @@
 public class RestSwaggerArrayEnumTest {
 
     @Test
-    public void shouldGenerateEnumValuesForArraysAndNonArrays() {
+    public void shouldGenerateEnumValuesForArraysAndNonArrays() throws Exception {
         final RestSwaggerReader reader = new RestSwaggerReader();
 
         final RestDefinition restDefinition = new RestDefinition();
