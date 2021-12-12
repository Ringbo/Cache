diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/settings/RestUpdateSettingsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/settings/RestUpdateSettingsAction.java
index 47ab59f..80a16c0 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/settings/RestUpdateSettingsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/settings/RestUpdateSettingsAction.java
@@ -97,7 +97,7 @@
                             .field("ok", true)
                             .endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
