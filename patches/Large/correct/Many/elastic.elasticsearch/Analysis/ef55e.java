diff --git a/src/main/java/org/elasticsearch/index/analysis/Analysis.java b/src/main/java/org/elasticsearch/index/analysis/Analysis.java
index c3f0025..602207e 100644
--- a/src/main/java/org/elasticsearch/index/analysis/Analysis.java
+++ b/src/main/java/org/elasticsearch/index/analysis/Analysis.java
@@ -163,7 +163,7 @@
         }
         List<String> pathLoadedStopWords = getWordList(env, settings, "stopwords");
         if (pathLoadedStopWords != null) {
-            return resolveNamedStopWords(stopWords, version, ignore_case);
+            return resolveNamedStopWords(pathLoadedStopWords, version, ignore_case);
         }
 
         return defaultStopWords;
