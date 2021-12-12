diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/shards/RestClusterSearchShardsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/shards/RestClusterSearchShardsAction.java
index 20a10de..2e3ef1d 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/shards/RestClusterSearchShardsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/shards/RestClusterSearchShardsAction.java
@@ -76,7 +76,7 @@
                     response.toXContent(builder, request);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, RestStatus.OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
