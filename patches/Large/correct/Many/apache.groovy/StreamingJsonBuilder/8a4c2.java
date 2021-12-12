diff --git a/subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java b/subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java
index 69d5173..f8c5f72 100644
--- a/subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java
+++ b/subprojects/groovy-json/src/main/java/groovy/json/StreamingJsonBuilder.java
@@ -728,7 +728,7 @@
             writeName(name);
             verifyValue();
             if(json instanceof GString) {
-                writer.write(JsonOutput.toJson(json.toString()));
+                writer.write(generator.toJson(json.toString()));
             }
             else {
                 json.writeTo(writer);
