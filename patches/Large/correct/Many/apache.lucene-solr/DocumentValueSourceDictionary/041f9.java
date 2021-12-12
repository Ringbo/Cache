diff --git a/lucene/suggest/src/java/org/apache/lucene/search/suggest/DocumentValueSourceDictionary.java b/lucene/suggest/src/java/org/apache/lucene/search/suggest/DocumentValueSourceDictionary.java
index 9eedbc6..fbdfaa8 100644
--- a/lucene/suggest/src/java/org/apache/lucene/search/suggest/DocumentValueSourceDictionary.java
+++ b/lucene/suggest/src/java/org/apache/lucene/search/suggest/DocumentValueSourceDictionary.java
@@ -145,7 +145,7 @@
         try {
           currentWeightValues = weightsValueSource.getValues(new HashMap<String, Object>(), leaves.get(currentLeafIndex));
         } catch (IOException e) {
-          throw new RuntimeException();
+          throw new RuntimeException(e);
         }
       }
       return currentWeightValues.longVal(docId - starts[subIndex]);
