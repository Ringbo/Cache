diff --git a/ui/src/org/pentaho/di/ui/trans/steps/abort/AbortDialog.java b/ui/src/org/pentaho/di/ui/trans/steps/abort/AbortDialog.java
index 2df706c..bb77e0f 100644
--- a/ui/src/org/pentaho/di/ui/trans/steps/abort/AbortDialog.java
+++ b/ui/src/org/pentaho/di/ui/trans/steps/abort/AbortDialog.java
@@ -140,7 +140,7 @@
     props.setLook( wlRowThreshold );
     fdlRowThreshold = new FormData();
     fdlRowThreshold.left = new FormAttachment( 0, 0 );
-    fdlRowThreshold.top = new FormAttachment( spacer, 15 );
+    fdlRowThreshold.top = new FormAttachment( spacer, 20 );
     wlRowThreshold.setLayoutData( fdlRowThreshold );
     wRowThreshold = new TextVar( transMeta, shell, SWT.SINGLE | SWT.LEFT | SWT.BORDER );
     wRowThreshold.setText( "" );
