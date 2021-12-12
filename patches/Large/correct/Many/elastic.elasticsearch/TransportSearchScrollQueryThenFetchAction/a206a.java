diff --git a/src/main/java/org/elasticsearch/action/search/type/TransportSearchScrollQueryThenFetchAction.java b/src/main/java/org/elasticsearch/action/search/type/TransportSearchScrollQueryThenFetchAction.java
index 5920050..145f980 100644
--- a/src/main/java/org/elasticsearch/action/search/type/TransportSearchScrollQueryThenFetchAction.java
+++ b/src/main/java/org/elasticsearch/action/search/type/TransportSearchScrollQueryThenFetchAction.java
@@ -253,7 +253,7 @@
         private void finishHim() {
             try {
                 innerFinishHim();
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(new ReduceSearchPhaseException("fetch", "", e, buildShardFailures()));
             }
         }
