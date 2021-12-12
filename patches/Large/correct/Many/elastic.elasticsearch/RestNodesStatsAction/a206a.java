diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/stats/RestNodesStatsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/stats/RestNodesStatsAction.java
index 6838fa5..880c5f6 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/stats/RestNodesStatsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/stats/RestNodesStatsAction.java
@@ -136,7 +136,7 @@
                     response.toXContent(builder, request);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, RestStatus.OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
