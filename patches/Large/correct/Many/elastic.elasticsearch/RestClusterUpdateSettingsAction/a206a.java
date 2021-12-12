diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/settings/RestClusterUpdateSettingsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/settings/RestClusterUpdateSettingsAction.java
index a2e5552..0ee1013 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/settings/RestClusterUpdateSettingsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/settings/RestClusterUpdateSettingsAction.java
@@ -68,7 +68,7 @@
             public void onResponse(ClusterUpdateSettingsResponse response) {
                 try {
                     channel.sendResponse(new StringRestResponse(RestStatus.OK));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
