diff --git a/plugin/src/test/java/org/elasticsearch/xpack/ml/job/persistence/JobProviderTests.java b/plugin/src/test/java/org/elasticsearch/xpack/ml/job/persistence/JobProviderTests.java
index 847f41b..62d1c04 100644
--- a/plugin/src/test/java/org/elasticsearch/xpack/ml/job/persistence/JobProviderTests.java
+++ b/plugin/src/test/java/org/elasticsearch/xpack/ml/job/persistence/JobProviderTests.java
@@ -875,8 +875,9 @@
             queryBuilderConsumer.accept(multiSearchRequest.requests().get(0).source().query());
             @SuppressWarnings("unchecked")
             ActionListener<MultiSearchResponse> actionListener = (ActionListener<MultiSearchResponse>) invocationOnMock.getArguments()[1];
-            MultiSearchResponse mresponse =
-                    new MultiSearchResponse(new MultiSearchResponse.Item[]{new MultiSearchResponse.Item(response, null)});
+            MultiSearchResponse mresponse = new MultiSearchResponse(
+                    new MultiSearchResponse.Item[]{new MultiSearchResponse.Item(response, null)},
+                    randomNonNegativeLong());
             actionListener.onResponse(mresponse);
             return null;
         }).when(client).multiSearch(any(), any());
