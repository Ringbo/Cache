diff --git a/source/com/intellij/openapi/vfs/impl/VirtualFileManagerImpl.java b/source/com/intellij/openapi/vfs/impl/VirtualFileManagerImpl.java
index a460219..160c3ac 100644
--- a/source/com/intellij/openapi/vfs/impl/VirtualFileManagerImpl.java
+++ b/source/com/intellij/openapi/vfs/impl/VirtualFileManagerImpl.java
@@ -258,7 +258,7 @@
 
               if (myRefreshCount > 0) {
                 myRefreshEventsToFire.clear();
-                if (mySynchronousRefreshCount == 0) {
+                if (!asynchronous && mySynchronousRefreshCount == 0) {
                   myVirtualFileManagerListenerMulticaster.getMulticaster().afterRefreshFinish(asynchronous);
                 }
               }
