diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/restart/RestNodesRestartAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/restart/RestNodesRestartAction.java
index 6d8877d..01163ea 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/restart/RestNodesRestartAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/restart/RestNodesRestartAction.java
@@ -70,7 +70,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, RestStatus.OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
