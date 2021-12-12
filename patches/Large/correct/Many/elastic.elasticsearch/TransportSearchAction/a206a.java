diff --git a/src/main/java/org/elasticsearch/action/search/TransportSearchAction.java b/src/main/java/org/elasticsearch/action/search/TransportSearchAction.java
index 95ccb98..195ab64 100644
--- a/src/main/java/org/elasticsearch/action/search/TransportSearchAction.java
+++ b/src/main/java/org/elasticsearch/action/search/TransportSearchAction.java
@@ -137,7 +137,7 @@
                 public void onResponse(SearchResponse result) {
                     try {
                         channel.sendResponse(result);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
