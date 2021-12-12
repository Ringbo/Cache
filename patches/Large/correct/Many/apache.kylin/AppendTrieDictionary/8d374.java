diff --git a/core-dictionary/src/main/java/org/apache/kylin/dict/AppendTrieDictionary.java b/core-dictionary/src/main/java/org/apache/kylin/dict/AppendTrieDictionary.java
index 80403cc..b797167 100644
--- a/core-dictionary/src/main/java/org/apache/kylin/dict/AppendTrieDictionary.java
+++ b/core-dictionary/src/main/java/org/apache/kylin/dict/AppendTrieDictionary.java
@@ -1191,7 +1191,7 @@
 
         // init new AppendTrieDictionary
         AppendTrieDictionary newDict = new AppendTrieDictionary();
-        newDict.initParams(baseDir.replaceFirst(srcConfig.getHdfsWorkingDirectory(), dstConfig.getHdfsWorkingDirectory()), baseId, maxId, maxValueLength, nValues, bytesConverter);
+        newDict.initParams(baseDir.replaceFirst(srcConfig.getHdfsWorkingDirectory(), dstConfig.getHdfsWorkingDirectory()), baseId, maxId, maxValueLength, nValues, bytesConvert);
         newDict.initDictSliceMap((CachedTreeMap) dictSliceMap);
 
         return newDict;
