diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/flush/RestFlushAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/flush/RestFlushAction.java
index 89c025a..3c8fb80 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/flush/RestFlushAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/flush/RestFlushAction.java
@@ -82,7 +82,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
