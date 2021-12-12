diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/gateway/snapshot/RestGatewaySnapshotAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/gateway/snapshot/RestGatewaySnapshotAction.java
index 228b645..f36fbc2 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/gateway/snapshot/RestGatewaySnapshotAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/gateway/snapshot/RestGatewaySnapshotAction.java
@@ -68,7 +68,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
