diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/MultiPageAbstractEditor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/MultiPageAbstractEditor.java
index e5bce45..5821640 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/MultiPageAbstractEditor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/MultiPageAbstractEditor.java
@@ -102,10 +102,11 @@
                 tabFolder.setTopRight(topRight, SWT.RIGHT | SWT.WRAP);
             }
             tabFolder.setTabPosition(SWT.TOP);
+//            tabFolder.setSimple(false);
             //tabFolder.setBorderVisible(true);
             Layout parentLayout = tabFolder.getParent().getLayout();
             if (parentLayout instanceof FillLayout) {
-                ((FillLayout)parentLayout).marginHeight = 5;
+                ((FillLayout)parentLayout).marginHeight = 0;
                 //((FillLayout)parentLayout).marginWidth = 5;
             }
         }
