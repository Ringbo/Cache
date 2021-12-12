diff --git a/lucene/core/src/java/org/apache/lucene/codecs/lucene41/Lucene41SimpleDocValuesFormat.java b/lucene/core/src/java/org/apache/lucene/codecs/lucene41/Lucene41SimpleDocValuesFormat.java
index 08afbf1..df93720 100644
--- a/lucene/core/src/java/org/apache/lucene/codecs/lucene41/Lucene41SimpleDocValuesFormat.java
+++ b/lucene/core/src/java/org/apache/lucene/codecs/lucene41/Lucene41SimpleDocValuesFormat.java
@@ -374,12 +374,12 @@
 
         @Override
         public int getValueCount() {
-          return ordinals.size();
+          return binary.size();
         }
 
         @Override
         public int size() {
-          return binary.size();
+          return ordinals.size();
         }
       };
     }
