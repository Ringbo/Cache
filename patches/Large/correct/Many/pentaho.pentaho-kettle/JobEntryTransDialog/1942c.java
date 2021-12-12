diff --git a/src/be/ibridge/kettle/job/entry/trans/JobEntryTransDialog.java b/src/be/ibridge/kettle/job/entry/trans/JobEntryTransDialog.java
index 17faafd..04f2213 100644
--- a/src/be/ibridge/kettle/job/entry/trans/JobEntryTransDialog.java
+++ b/src/be/ibridge/kettle/job/entry/trans/JobEntryTransDialog.java
@@ -92,7 +92,7 @@
 
     private Label wlDirectory;
 
-    private TextVar wDirectory;
+    private Text wDirectory;
 
     private FormData fdlDirectory, fdDirectory;
 
@@ -292,7 +292,7 @@
         fdlDirectory.right = new FormAttachment(middle, 0);
         wlDirectory.setLayoutData(fdlDirectory);
 
-        wDirectory = new TextVar(shell, SWT.SINGLE | SWT.LEFT | SWT.BORDER);
+        wDirectory = new Text(shell, SWT.SINGLE | SWT.LEFT | SWT.BORDER);
         props.setLook(wDirectory);
         wDirectory.addModifyListener(lsMod);
         fdDirectory = new FormData();
