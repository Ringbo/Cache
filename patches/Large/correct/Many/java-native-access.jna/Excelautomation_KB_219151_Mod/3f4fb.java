diff --git a/contrib/msoffice/src/com/sun/jna/platform/win32/COM/util/office/Excelautomation_KB_219151_Mod.java b/contrib/msoffice/src/com/sun/jna/platform/win32/COM/util/office/Excelautomation_KB_219151_Mod.java
index 60dff17..6b51706 100644
--- a/contrib/msoffice/src/com/sun/jna/platform/win32/COM/util/office/Excelautomation_KB_219151_Mod.java
+++ b/contrib/msoffice/src/com/sun/jna/platform/win32/COM/util/office/Excelautomation_KB_219151_Mod.java
@@ -142,7 +142,7 @@
             pane.setOptionType(JOptionPane.YES_NO_OPTION);
             JDialog dialog = pane.createDialog("Input...");
             dialog.setAlwaysOnTop(true);
-            dialog.show();
+            dialog.setVisible(true);
             if(((Integer) pane.getValue()) == JOptionPane.YES_OPTION) {
                 break;
             }
