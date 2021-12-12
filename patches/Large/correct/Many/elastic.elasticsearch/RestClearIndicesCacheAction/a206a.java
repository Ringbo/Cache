diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/cache/clear/RestClearIndicesCacheAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/cache/clear/RestClearIndicesCacheAction.java
index ca9e560..10ba32f 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/cache/clear/RestClearIndicesCacheAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/cache/clear/RestClearIndicesCacheAction.java
@@ -96,7 +96,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
