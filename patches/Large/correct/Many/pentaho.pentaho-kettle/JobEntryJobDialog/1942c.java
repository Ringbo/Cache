diff --git a/src/be/ibridge/kettle/job/entry/job/JobEntryJobDialog.java b/src/be/ibridge/kettle/job/entry/job/JobEntryJobDialog.java
index 7468825..904cc7c 100644
--- a/src/be/ibridge/kettle/job/entry/job/JobEntryJobDialog.java
+++ b/src/be/ibridge/kettle/job/entry/job/JobEntryJobDialog.java
@@ -94,7 +94,7 @@
 
     private Label wlDirectory;
 
-    private TextVar wDirectory;
+    private Text wDirectory;
 
     private FormData fdlDirectory, fdDirectory;
 
@@ -277,7 +277,7 @@
         fdlDirectory.right = new FormAttachment(middle, 0);
         wlDirectory.setLayoutData(fdlDirectory);
 
-        wDirectory = new TextVar(shell, SWT.SINGLE | SWT.LEFT | SWT.BORDER);
+        wDirectory = new Text(shell, SWT.SINGLE | SWT.LEFT | SWT.BORDER);
         props.setLook(wDirectory);
         wDirectory.setToolTipText(Messages.getString("JobJob.Repository.Tooltip"));
         wDirectory.addModifyListener(lsMod);
