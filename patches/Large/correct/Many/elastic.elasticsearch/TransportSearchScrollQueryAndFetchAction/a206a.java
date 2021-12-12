diff --git a/src/main/java/org/elasticsearch/action/search/type/TransportSearchScrollQueryAndFetchAction.java b/src/main/java/org/elasticsearch/action/search/type/TransportSearchScrollQueryAndFetchAction.java
index 4722377..3a331fe 100644
--- a/src/main/java/org/elasticsearch/action/search/type/TransportSearchScrollQueryAndFetchAction.java
+++ b/src/main/java/org/elasticsearch/action/search/type/TransportSearchScrollQueryAndFetchAction.java
@@ -222,7 +222,7 @@
         private void finishHim() {
             try {
                 innerFinishHim();
-            } catch (Exception e) {
+            } catch (Throwable e) {
                 listener.onFailure(new ReduceSearchPhaseException("fetch", "", e, buildShardFailures()));
             }
         }
