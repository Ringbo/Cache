diff --git a/modules/rank-eval/src/test/java/org/elasticsearch/index/rankeval/RatedRequestsTests.java b/modules/rank-eval/src/test/java/org/elasticsearch/index/rankeval/RatedRequestsTests.java
index f046f20..3b7d64f 100644
--- a/modules/rank-eval/src/test/java/org/elasticsearch/index/rankeval/RatedRequestsTests.java
+++ b/modules/rank-eval/src/test/java/org/elasticsearch/index/rankeval/RatedRequestsTests.java
@@ -215,7 +215,7 @@
             break;
         case 1:
             if (testRequest != null) {
-                int size = randomValueOtherThan(testRequest.size(), () -> randomInt());
+                int size = randomValueOtherThan(testRequest.size(), () -> randomInt(Integer.MAX_VALUE));
                 testRequest = new SearchSourceBuilder();
                 testRequest.size(size);
                 testRequest.query(new MatchAllQueryBuilder());
