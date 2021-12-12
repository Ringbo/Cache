diff --git a/modules/rank-eval/src/test/java/org/elasticsearch/index/rankeval/RankEvalSpecTests.java b/modules/rank-eval/src/test/java/org/elasticsearch/index/rankeval/RankEvalSpecTests.java
index 6694360..6a34499 100644
--- a/modules/rank-eval/src/test/java/org/elasticsearch/index/rankeval/RankEvalSpecTests.java
+++ b/modules/rank-eval/src/test/java/org/elasticsearch/index/rankeval/RankEvalSpecTests.java
@@ -112,7 +112,7 @@
                 script = randomAsciiOfLengthBetween(1, 5);
             }
 
-            testItem.setTemplate(new Script(scriptType, randomFrom("_lang1", "_lang2", null), script, params));
+            testItem.setTemplate(new Script(scriptType, randomFrom("_lang1", "_lang2"), script, params));
         }
 
         XContentBuilder shuffled = ESTestCase.shuffleXContent(testItem.toXContent(XContentFactory.jsonBuilder(), ToXContent.EMPTY_PARAMS));
