diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/shutdown/RestNodesShutdownAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/shutdown/RestNodesShutdownAction.java
index d146522..675b0f2 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/shutdown/RestNodesShutdownAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/shutdown/RestNodesShutdownAction.java
@@ -73,7 +73,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, RestStatus.OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
