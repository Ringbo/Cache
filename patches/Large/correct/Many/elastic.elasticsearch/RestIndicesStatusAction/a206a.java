diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/status/RestIndicesStatusAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/status/RestIndicesStatusAction.java
index 854ea62..3ca0c45 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/status/RestIndicesStatusAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/status/RestIndicesStatusAction.java
@@ -82,7 +82,7 @@
                     response.toXContent(builder, request, settingsFilter);
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
