diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/settings/RestClusterGetSettingsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/settings/RestClusterGetSettingsAction.java
index 48a30c0..9f3cd82 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/settings/RestClusterGetSettingsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/settings/RestClusterGetSettingsAction.java
@@ -71,7 +71,7 @@
                     builder.endObject();
 
                     channel.sendResponse(new XContentRestResponse(request, RestStatus.OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
