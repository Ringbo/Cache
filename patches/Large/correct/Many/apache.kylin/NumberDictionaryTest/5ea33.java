diff --git a/dictionary/src/test/java/org/apache/kylin/dict/NumberDictionaryTest.java b/dictionary/src/test/java/org/apache/kylin/dict/NumberDictionaryTest.java
index 673d8b0..2bc8c4f 100644
--- a/dictionary/src/test/java/org/apache/kylin/dict/NumberDictionaryTest.java
+++ b/dictionary/src/test/java/org/apache/kylin/dict/NumberDictionaryTest.java
@@ -50,7 +50,7 @@
         
         // check "" is treated as NULL, not a code of dictionary
         Dictionary<?> dict = DictionaryGenerator.buildDictionaryFromValueList(DataType.getInstance("integer"), intBytes);
-        assertEquals(5, dict.getSize());
+        assertEquals(4, dict.getSize());
 
         final int id = ((NumberDictionary<String>) dict).getIdFromValue("");
         assertEquals(id, dict.nullId());
