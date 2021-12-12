diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/template/get/RestGetIndexTemplateAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/template/get/RestGetIndexTemplateAction.java
index 747c442..cdbd5c5 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/template/get/RestGetIndexTemplateAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/template/get/RestGetIndexTemplateAction.java
@@ -109,7 +109,7 @@
                     builder.endObject();
 
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
