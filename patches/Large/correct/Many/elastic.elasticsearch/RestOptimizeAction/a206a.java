diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/optimize/RestOptimizeAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/optimize/RestOptimizeAction.java
index f52d326..a43bbd6 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/optimize/RestOptimizeAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/optimize/RestOptimizeAction.java
@@ -96,7 +96,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
