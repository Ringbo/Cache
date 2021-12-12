diff --git a/core/src/main/java/org/elasticsearch/search/SearchService.java b/core/src/main/java/org/elasticsearch/search/SearchService.java
index f15a802..7b7f764 100644
--- a/core/src/main/java/org/elasticsearch/search/SearchService.java
+++ b/core/src/main/java/org/elasticsearch/search/SearchService.java
@@ -296,7 +296,7 @@
                     contextProcessedSuccessfully(context);
                 }
             } catch (Throwable e) {
-                shardSearchStats.onFailedQueryPhase(context);
+                shardSearchStats.onFailedFetchPhase(context);
                 throw ExceptionsHelper.convertToRuntime(e);
             }
             shardSearchStats.onFetchPhase(context, System.nanoTime() - queryFinishTime);
