diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/state/RestClusterStateAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/state/RestClusterStateAction.java
index 7a13f07..b1ddc0a 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/state/RestClusterStateAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/state/RestClusterStateAction.java
@@ -74,7 +74,7 @@
                     response.getState().settingsFilter(settingsFilter).toXContent(builder, request);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, RestStatus.OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
