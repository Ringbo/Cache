diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ExtractedField.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ExtractedField.java
index 50a1394..c994c81 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ExtractedField.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ExtractedField.java
@@ -50,7 +50,7 @@
 
     private static class FromFields extends ExtractedField {
 
-        public FromFields(String name, ExtractionMethod extractionMethod) {
+        FromFields(String name, ExtractionMethod extractionMethod) {
             super(name, extractionMethod);
         }
 
@@ -69,7 +69,7 @@
 
         private String[] namePath;
 
-        public FromSource(String name, ExtractionMethod extractionMethod) {
+        FromSource(String name, ExtractionMethod extractionMethod) {
             super(name, extractionMethod);
             namePath = name.split("\\.");
         }
