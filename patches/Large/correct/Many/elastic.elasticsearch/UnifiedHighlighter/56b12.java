diff --git a/core/src/main/java/org/elasticsearch/search/fetch/subphase/highlight/UnifiedHighlighter.java b/core/src/main/java/org/elasticsearch/search/fetch/subphase/highlight/UnifiedHighlighter.java
index 223e9f4..034cac9 100644
--- a/core/src/main/java/org/elasticsearch/search/fetch/subphase/highlight/UnifiedHighlighter.java
+++ b/core/src/main/java/org/elasticsearch/search/fetch/subphase/highlight/UnifiedHighlighter.java
@@ -219,9 +219,9 @@
 
     private OffsetSource getOffsetSource(MappedFieldType fieldType) {
         if (fieldType.indexOptions() == IndexOptions.DOCS_AND_FREQS_AND_POSITIONS_AND_OFFSETS) {
-            return fieldType.storeTermVectorOffsets() ? OffsetSource.POSTINGS_WITH_TERM_VECTORS : OffsetSource.POSTINGS;
+            return fieldType.storeTermVectors() ? OffsetSource.POSTINGS_WITH_TERM_VECTORS : OffsetSource.POSTINGS;
         }
-        if (fieldType.storeTermVectors()) {
+        if (fieldType.storeTermVectorOffsets()) {
             return OffsetSource.TERM_VECTORS;
         }
         return OffsetSource.ANALYSIS;
