diff --git a/src/main/java/org/elasticsearch/action/search/TransportSearchScrollAction.java b/src/main/java/org/elasticsearch/action/search/TransportSearchScrollAction.java
index 23272f0..d0f8631 100644
--- a/src/main/java/org/elasticsearch/action/search/TransportSearchScrollAction.java
+++ b/src/main/java/org/elasticsearch/action/search/TransportSearchScrollAction.java
@@ -73,7 +73,7 @@
             } else {
                 throw new ElasticSearchIllegalArgumentException("Scroll id type [" + scrollId.getType() + "] unrecognized");
             }
-        } catch (Exception e) {
+        } catch (Throwable e) {
             listener.onFailure(e);
         }
     }
@@ -94,7 +94,7 @@
                 public void onResponse(SearchResponse result) {
                     try {
                         channel.sendResponse(result);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
