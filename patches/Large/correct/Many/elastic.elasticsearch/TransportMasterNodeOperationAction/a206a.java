diff --git a/src/main/java/org/elasticsearch/action/support/master/TransportMasterNodeOperationAction.java b/src/main/java/org/elasticsearch/action/support/master/TransportMasterNodeOperationAction.java
index 27be335..9e8c723 100644
--- a/src/main/java/org/elasticsearch/action/support/master/TransportMasterNodeOperationAction.java
+++ b/src/main/java/org/elasticsearch/action/support/master/TransportMasterNodeOperationAction.java
@@ -135,7 +135,7 @@
                         try {
                             Response response = masterOperation(request, clusterState);
                             listener.onResponse(response);
-                        } catch (Exception e) {
+                        } catch (Throwable e) {
                             listener.onFailure(e);
                         }
                     }
@@ -261,7 +261,7 @@
                 public void onResponse(Response response) {
                     try {
                         channel.sendResponse(response);
-                    } catch (Exception e) {
+                    } catch (Throwable e) {
                         onFailure(e);
                     }
                 }
