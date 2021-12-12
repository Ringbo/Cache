diff --git a/src/test/java/org/elasticsearch/test/integration/search/functionscore/RandomScoreFunctionTests.java b/src/test/java/org/elasticsearch/test/integration/search/functionscore/RandomScoreFunctionTests.java
index 6015915..b270131 100644
--- a/src/test/java/org/elasticsearch/test/integration/search/functionscore/RandomScoreFunctionTests.java
+++ b/src/test/java/org/elasticsearch/test/integration/search/functionscore/RandomScoreFunctionTests.java
@@ -57,7 +57,7 @@
         int docCount = atLeast(100);
 
         for (int i = 0; i < docCount; i++) {
-            index("test", "type", "" + docCount, jsonBuilder().startObject().endObject());
+            index("test", "type", "" + i, jsonBuilder().startObject().endObject());
         }
 
         flush();
