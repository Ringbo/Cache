diff --git a/src/main/java/org/elasticsearch/action/bulk/TransportBulkAction.java b/src/main/java/org/elasticsearch/action/bulk/TransportBulkAction.java
index 57ccc3a..2a06ae1 100644
--- a/src/main/java/org/elasticsearch/action/bulk/TransportBulkAction.java
+++ b/src/main/java/org/elasticsearch/action/bulk/TransportBulkAction.java
@@ -274,7 +274,7 @@
                 public void onResponse(BulkResponse result) {
                     try {
                         channel.sendResponse(result);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
