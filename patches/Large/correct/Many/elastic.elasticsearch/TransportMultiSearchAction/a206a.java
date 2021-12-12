diff --git a/src/main/java/org/elasticsearch/action/search/TransportMultiSearchAction.java b/src/main/java/org/elasticsearch/action/search/TransportMultiSearchAction.java
index f5e4f1a..723a06d 100644
--- a/src/main/java/org/elasticsearch/action/search/TransportMultiSearchAction.java
+++ b/src/main/java/org/elasticsearch/action/search/TransportMultiSearchAction.java
@@ -104,7 +104,7 @@
                 public void onResponse(MultiSearchResponse response) {
                     try {
                         channel.sendResponse(response);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
