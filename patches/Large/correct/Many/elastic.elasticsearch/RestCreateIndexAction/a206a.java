diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/create/RestCreateIndexAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/create/RestCreateIndexAction.java
index be25063..d91699a 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/create/RestCreateIndexAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/create/RestCreateIndexAction.java
@@ -76,7 +76,7 @@
                             .field("acknowledged", response.isAcknowledged())
                             .endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
