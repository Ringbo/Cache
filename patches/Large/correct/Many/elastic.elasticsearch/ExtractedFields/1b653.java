diff --git a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ExtractedFields.java b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ExtractedFields.java
index abded99..719870d 100644
--- a/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ExtractedFields.java
+++ b/elasticsearch/src/main/java/org/elasticsearch/xpack/ml/datafeed/extractor/scroll/ExtractedFields.java
@@ -22,7 +22,7 @@
     private final ExtractedField timeField;
     private final List<ExtractedField> allFields;
 
-    public ExtractedFields(ExtractedField timeField, List<ExtractedField> allFields) {
+    ExtractedFields(ExtractedField timeField, List<ExtractedField> allFields) {
         if (!allFields.contains(timeField)) {
             throw new IllegalArgumentException("timeField should also be contained in allFields");
         }
