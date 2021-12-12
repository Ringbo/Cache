diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/health/RestClusterHealthAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/health/RestClusterHealthAction.java
index f4a518b..1bc8d07 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/health/RestClusterHealthAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/health/RestClusterHealthAction.java
@@ -182,7 +182,7 @@
                     builder.endObject();
 
                     channel.sendResponse(new XContentRestResponse(request, status, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
