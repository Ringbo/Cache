diff --git a/dictionary/src/main/java/org/apache/kylin/dict/DictionaryGenerator.java b/dictionary/src/main/java/org/apache/kylin/dict/DictionaryGenerator.java
index 92d1705..7c1f808 100644
--- a/dictionary/src/main/java/org/apache/kylin/dict/DictionaryGenerator.java
+++ b/dictionary/src/main/java/org/apache/kylin/dict/DictionaryGenerator.java
@@ -117,7 +117,7 @@
     }
 
     private static Dictionary buildDateTimeDict(Collection<byte[]> values, int baseId, int nSamples, ArrayList samples) {
-        final int BAD_THRESHOLD = 2;
+        final int BAD_THRESHOLD = 0;
         String matchPattern = null;
 
         for (String ptn : DATE_PATTERNS) {
