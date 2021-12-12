diff --git a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
index 6757854..65b6c10 100644
--- a/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
+++ b/src/be/ibridge/kettle/trans/step/textfileinput/TextFileInputDialog.java
@@ -1801,7 +1801,7 @@
         fieldsLayout.marginWidth  = Const.FORM_MARGIN;
         fieldsLayout.marginHeight = Const.FORM_MARGIN;
         
-        wFieldsComp = new ScrolledComposite(wTabFolder, SWT.V_SCROLL | SWT.H_SCROLL );
+        wFieldsComp = new Composite(wTabFolder, SWT.NONE );
         wFieldsComp.setLayout(fieldsLayout);
         props.setLook(wFieldsComp);
         
