diff --git a/ui/src/org/pentaho/di/ui/spoon/Spoon.java b/ui/src/org/pentaho/di/ui/spoon/Spoon.java
index 52563bb..3ca8b81 100644
--- a/ui/src/org/pentaho/di/ui/spoon/Spoon.java
+++ b/ui/src/org/pentaho/di/ui/spoon/Spoon.java
@@ -6545,7 +6545,7 @@
         continue;
       }
 
-      TreeItem tiSlave = createTreeItem( tiSlaveTitle, slaveServer.getName(), guiResource.getImageSlaveMedium() );
+      TreeItem tiSlave = createTreeItem( tiSlaveTitle, slaveServer.getName(), guiResource.getImageSlaveTree() );
       if ( slaveServer.isShared() ) {
         tiSlave.setFont( guiResource.getFontBold() );
       }
