diff --git a/src/main/java/org/elasticsearch/rest/action/admin/indices/mapping/get/RestGetMappingAction.java b/src/main/java/org/elasticsearch/rest/action/admin/indices/mapping/get/RestGetMappingAction.java
index 26d6f87..b1f0bb9 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/indices/mapping/get/RestGetMappingAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/indices/mapping/get/RestGetMappingAction.java
@@ -129,7 +129,7 @@
                     builder.endObject();
 
                     channel.sendResponse(new XContentRestResponse(request, foundAny || indices.length == 0 ? OK : NOT_FOUND, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
