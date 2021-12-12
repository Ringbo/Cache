diff --git a/app/src/cc/arduino/view/findreplace/FindReplace.java b/app/src/cc/arduino/view/findreplace/FindReplace.java
index f5e6a81..60dd662 100644
--- a/app/src/cc/arduino/view/findreplace/FindReplace.java
+++ b/app/src/cc/arduino/view/findreplace/FindReplace.java
@@ -345,12 +345,12 @@
             }
 
             if (backwards) {
-              editor.selectNextTab();
+              editor.selectPrevTab();
               this.setVisible(true);
               int l = editor.getCurrentTab().getText().length() - 1;
               editor.getCurrentTab().setSelection(l, l);
             } else {
-              editor.selectPrevTab();
+              editor.selectNextTab();
               this.setVisible(true);
               editor.getCurrentTab().setSelection(0, 0);
             }
