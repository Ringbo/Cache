diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/CImageCombo.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/CImageCombo.java
index 1aaa438..51ceedc 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/CImageCombo.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/CImageCombo.java
@@ -69,7 +69,7 @@
 
     private Composite comboComposite;
     private Label imageLabel;
-    private Label text;
+    private Text text;
     private Table table;
     private int visibleItemCount = 4;
     private int widthHint = SWT.DEFAULT;
@@ -137,7 +137,7 @@
         this.imageLabel = new Label(this.comboComposite, SWT.NONE);
         this.imageLabel.setLayoutData(new GridData(GridData.FILL_VERTICAL | GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER));
 
-        this.text = new Label(this.comboComposite, SWT.NONE);
+        this.text = new Text(this.comboComposite, SWT.READ_ONLY);
         this.text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_CENTER));
 
         this.comboComposite.setCursor(getDisplay().getSystemCursor(SWT.CURSOR_ARROW));
