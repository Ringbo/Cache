diff --git a/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputDialog.java b/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputDialog.java
index d8dfa8b..1b8eee0 100644
--- a/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/textfileoutput/TextFileOutputDialog.java
@@ -631,7 +631,7 @@
         props.setLook(wlEncoding);
         fdlEncoding=new FormData();
         fdlEncoding.left = new FormAttachment(0, 0);
-        fdlEncoding.top  = new FormAttachment(wFormat, margin);
+        fdlEncoding.top  = new FormAttachment(wCompression, margin);
         fdlEncoding.right= new FormAttachment(middle, -margin);
         wlEncoding.setLayoutData(fdlEncoding);
         wEncoding=new CCombo(wContentComp, SWT.BORDER | SWT.READ_ONLY);
