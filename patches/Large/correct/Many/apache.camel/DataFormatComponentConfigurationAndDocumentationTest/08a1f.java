diff --git a/camel-core/src/test/java/org/apache/camel/component/dataformat/DataFormatComponentConfigurationAndDocumentationTest.java b/camel-core/src/test/java/org/apache/camel/component/dataformat/DataFormatComponentConfigurationAndDocumentationTest.java
index c486ce0..e556f1c 100644
--- a/camel-core/src/test/java/org/apache/camel/component/dataformat/DataFormatComponentConfigurationAndDocumentationTest.java
+++ b/camel-core/src/test/java/org/apache/camel/component/dataformat/DataFormatComponentConfigurationAndDocumentationTest.java
@@ -71,7 +71,7 @@
                 + ", \"javaType\": \"java.lang.String\", \"deprecated\": \"false\", \"secret\": \"false\", \"defaultValue\": \"\\\"\""));
 
         List<Map<String, String>> rows = JsonSchemaHelper.parseJsonSchema("properties", json, true);
-        assertEquals(9, rows.size());
+        assertEquals(10, rows.size());
 
         Map<String, String> found = null;
         for (Map<String, String> row : rows) {
@@ -105,7 +105,7 @@
                 + " \"deprecated\": \"false\", \"secret\": \"false\", \"defaultValue\": \"\\\\\", \"description\": \"The escape character.\""));
 
         List<Map<String, String>> rows = JsonSchemaHelper.parseJsonSchema("properties", json, true);
-        assertEquals(15, rows.size());
+        assertEquals(16, rows.size());
 
         Map<String, String> found = null;
         for (Map<String, String> row : rows) {
