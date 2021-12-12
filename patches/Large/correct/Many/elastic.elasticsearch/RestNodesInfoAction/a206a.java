diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/info/RestNodesInfoAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/info/RestNodesInfoAction.java
index 335e9a9..5107783 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/info/RestNodesInfoAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/info/RestNodesInfoAction.java
@@ -114,7 +114,7 @@
                     response.toXContent(builder, request);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, RestStatus.OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
