diff --git a/curator-framework/src/main/java/org/apache/curator/framework/imps/FindAndDeleteProtectedNodeInBackground.java b/curator-framework/src/main/java/org/apache/curator/framework/imps/FindAndDeleteProtectedNodeInBackground.java
index 7b5073b..3882a0e 100644
--- a/curator-framework/src/main/java/org/apache/curator/framework/imps/FindAndDeleteProtectedNodeInBackground.java
+++ b/curator-framework/src/main/java/org/apache/curator/framework/imps/FindAndDeleteProtectedNodeInBackground.java
@@ -97,7 +97,7 @@
 
                 if ( rc != KeeperException.Code.OK.intValue() )
                 {
-                    CuratorEventImpl event = new CuratorEventImpl(client, CuratorEventType.CHILDREN, rc, path, null, o, stat, null, strings, null, null);
+                    CuratorEventImpl event = new CuratorEventImpl(client, CuratorEventType.CHILDREN, rc, path, null, o, stat, null, strings, null, null, null);
                     client.processBackgroundOperation(operationAndData, event);
                 }
             }
