diff --git a/src/main/java/org/elasticsearch/action/search/type/TransportSearchDfsQueryThenFetchAction.java b/src/main/java/org/elasticsearch/action/search/type/TransportSearchDfsQueryThenFetchAction.java
index ff43951..2736509 100644
--- a/src/main/java/org/elasticsearch/action/search/type/TransportSearchDfsQueryThenFetchAction.java
+++ b/src/main/java/org/elasticsearch/action/search/type/TransportSearchDfsQueryThenFetchAction.java
@@ -172,7 +172,7 @@
         void executeFetchPhase() {
             try {
                 innerExecuteFetchPhase();
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(new ReduceSearchPhaseException("query", "", e, buildShardFailures()));
             }
         }
@@ -263,7 +263,7 @@
         void finishHim() {
             try {
                 innerFinishHim();
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 ReduceSearchPhaseException failure = new ReduceSearchPhaseException("fetch", "", e, buildShardFailures());
                 if (logger.isDebugEnabled()) {
                     logger.debug("failed to reduce search", failure);
