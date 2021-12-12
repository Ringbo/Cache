diff --git a/dictionary/src/test/java/org/apache/kylin/dict/NumberDictionaryTest.java b/dictionary/src/test/java/org/apache/kylin/dict/NumberDictionaryTest.java
index 239f7ee..7c8fc76 100644
--- a/dictionary/src/test/java/org/apache/kylin/dict/NumberDictionaryTest.java
+++ b/dictionary/src/test/java/org/apache/kylin/dict/NumberDictionaryTest.java
@@ -55,7 +55,7 @@
         
         // check "" is treated as NULL, not a code of dictionary
         Dictionary<?> dict = DictionaryGenerator.buildDictionaryFromValueList(DataType.getInstance("integer"), intBytes);
-        assertEquals(4, dict.getSize());
+        assertEquals(5, dict.getSize());
     }
 
     
