diff --git a/plugins/core/ui/src/main/java/org/pentaho/di/ui/trans/steps/abort/AbortDialog.java b/plugins/core/ui/src/main/java/org/pentaho/di/ui/trans/steps/abort/AbortDialog.java
index b487810..c3ed65c 100644
--- a/plugins/core/ui/src/main/java/org/pentaho/di/ui/trans/steps/abort/AbortDialog.java
+++ b/plugins/core/ui/src/main/java/org/pentaho/di/ui/trans/steps/abort/AbortDialog.java
@@ -315,7 +315,7 @@
     fdMessage = new FormData();
     fdMessage.left = new FormAttachment( 0, 0 );
     fdMessage.top = new FormAttachment( wlMessage, 5 );
-    fdMessage.right = new FormAttachment( 100, 15 );
+    fdMessage.right = new FormAttachment( 100, 0 );
     wMessage.setLayoutData( fdMessage );
 
     wAlwaysLogRows = new Button( wLoggingGroup, SWT.CHECK );
