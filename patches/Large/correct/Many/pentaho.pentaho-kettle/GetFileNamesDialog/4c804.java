diff --git a/src-ui/org/pentaho/di/ui/trans/steps/getfilenames/GetFileNamesDialog.java b/src-ui/org/pentaho/di/ui/trans/steps/getfilenames/GetFileNamesDialog.java
index 5e633df..5a713c8 100644
--- a/src-ui/org/pentaho/di/ui/trans/steps/getfilenames/GetFileNamesDialog.java
+++ b/src-ui/org/pentaho/di/ui/trans/steps/getfilenames/GetFileNamesDialog.java
@@ -364,7 +364,7 @@
   		props.setLook(wlIncludeSubFolder );
   		fdlIncludeSubFolder = new FormData();
   		fdlIncludeSubFolder.left = new FormAttachment(0, -margin);
-  		fdlIncludeSubFolder.top = new FormAttachment(wWildcardField, margin);
+  		fdlIncludeSubFolder.top = new FormAttachment(wExcludeWildcardField, margin);
   		fdlIncludeSubFolder.right = new FormAttachment(middle, -2*margin);
   		wlIncludeSubFolder .setLayoutData(fdlIncludeSubFolder);
   		
@@ -373,7 +373,7 @@
   		wIncludeSubFolder.setToolTipText(BaseMessages.getString(PKG, "GetFileNamesDialog.includeSubFolder.Tooltip"));
   		fdIncludeSubFolder = new FormData();
   		fdIncludeSubFolder.left = new FormAttachment(middle, -margin);
-  		fdIncludeSubFolder.top = new FormAttachment(wWildcardField, margin);
+  		fdIncludeSubFolder.top = new FormAttachment(wExcludeWildcardField, margin);
   		wIncludeSubFolder .setLayoutData(fdIncludeSubFolder);		
         	  
 		fdOriginFiles = new FormData();
