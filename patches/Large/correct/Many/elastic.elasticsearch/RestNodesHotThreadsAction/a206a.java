diff --git a/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/hotthreads/RestNodesHotThreadsAction.java b/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/hotthreads/RestNodesHotThreadsAction.java
index 769600e..546d8d2 100644
--- a/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/hotthreads/RestNodesHotThreadsAction.java
+++ b/src/main/java/org/elasticsearch/rest/action/admin/cluster/node/hotthreads/RestNodesHotThreadsAction.java
@@ -70,7 +70,7 @@
                         sb.append('\n');
                     }
                     channel.sendResponse(new StringRestResponse(RestStatus.OK, sb.toString()));
-                } catch (Exception e) {
+                } catch (Throwable e) {
                     onFailure(e);
                 }
             }
