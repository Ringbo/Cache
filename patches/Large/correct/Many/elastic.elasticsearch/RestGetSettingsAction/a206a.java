diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/settings/RestGetSettingsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/settings/RestGetSettingsAction.java
index 79de9e1..53c9a76 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/settings/RestGetSettingsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/settings/RestGetSettingsAction.java
@@ -97,7 +97,7 @@
                     builder.endObject();
 
                     channel.sendResponse(new XContentRestResponse(request, foundAny ? OK : NOT_FOUND, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
