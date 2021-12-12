diff --git a/invertedindex/src/test/java/org/apache/kylin/invertedindex/invertedindex/InvertedIndexLocalTest.java b/invertedindex/src/test/java/org/apache/kylin/invertedindex/invertedindex/InvertedIndexLocalTest.java
index 86c736d..cab069d 100644
--- a/invertedindex/src/test/java/org/apache/kylin/invertedindex/invertedindex/InvertedIndexLocalTest.java
+++ b/invertedindex/src/test/java/org/apache/kylin/invertedindex/invertedindex/InvertedIndexLocalTest.java
@@ -158,13 +158,13 @@
         }
         Map<Integer, Dictionary<?>> result = Maps.newHashMap();
         for (TblColRef tblColRef : valueMap.keys()) {
-            result.put(desc.findColumn(tblColRef), DictionaryGenerator.buildDictionaryFromValueList(Collections2.transform(valueMap.get(tblColRef), new Function<String, byte[]>() {
+            result.put(desc.findColumn(tblColRef), DictionaryGenerator.buildDictionaryFromValueList(tblColRef.getType(), Collections2.transform(valueMap.get(tblColRef), new Function<String, byte[]>() {
                 @Nullable
                 @Override
                 public byte[] apply(String input) {
                     return input.getBytes();
                 }
-            }), tblColRef.getType()));
+            })));
         }
         return result;
     }
