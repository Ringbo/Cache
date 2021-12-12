diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/reroute/RestClusterRerouteAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/reroute/RestClusterRerouteAction.java
index 33d913e..04895f9 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/reroute/RestClusterRerouteAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/reroute/RestClusterRerouteAction.java
@@ -82,7 +82,7 @@
 
                     builder.endObject();
                     channel.sendResponse(new XContentRestResponse(request, RestStatus.OK, builder));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
