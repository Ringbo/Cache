diff --git a/json-path/src/main/java/com/jayway/restassured/path/json/config/JsonPathConfig.java b/json-path/src/main/java/com/jayway/restassured/path/json/config/JsonPathConfig.java
index b54f139..91b39a3 100644
--- a/json-path/src/main/java/com/jayway/restassured/path/json/config/JsonPathConfig.java
+++ b/json-path/src/main/java/com/jayway/restassured/path/json/config/JsonPathConfig.java
@@ -125,7 +125,8 @@
      * @return A new instance of JsonPathConfig with the given configuration
      */
     public JsonPathConfig numberReturnType(NumberReturnType numberReturnType) {
-        return new JsonPathConfig(numberReturnType);
+        return new JsonPathConfig(numberReturnType, defaultParserType, gsonObjectMapperFactory,
+                jackson1ObjectMapperFactory, jackson2ObjectMapperFactory, defaultDeserializer, charset);
     }
 
     public boolean shouldRepresentJsonNumbersAsBigDecimal() {
