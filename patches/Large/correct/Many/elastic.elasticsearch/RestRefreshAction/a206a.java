diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/refresh/RestRefreshAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/refresh/RestRefreshAction.java
index 8c8446b..914153d 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/refresh/RestRefreshAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/refresh/RestRefreshAction.java
@@ -79,7 +79,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
