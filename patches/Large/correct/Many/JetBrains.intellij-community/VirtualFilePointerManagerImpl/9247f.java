diff --git a/platform/platform-impl/src/com/intellij/openapi/vfs/impl/VirtualFilePointerManagerImpl.java b/platform/platform-impl/src/com/intellij/openapi/vfs/impl/VirtualFilePointerManagerImpl.java
index 890af69..cbc36c9 100644
--- a/platform/platform-impl/src/com/intellij/openapi/vfs/impl/VirtualFilePointerManagerImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/vfs/impl/VirtualFilePointerManagerImpl.java
@@ -527,7 +527,7 @@
 
       if (!myPointersToUdate.isEmpty()) {
         VirtualFilePointer[] arr = myPointersToUdate.toArray(new VirtualFilePointer[myPointersToUdate.size()]);
-        myBus.syncPublisher(VirtualFilePointerListener.TOPIC).beforeValidityChanged(arr);
+        myBus.syncPublisher(VirtualFilePointerListener.TOPIC).validityChanged(arr);
       }
 
       myUrlsToUpdate = null;
