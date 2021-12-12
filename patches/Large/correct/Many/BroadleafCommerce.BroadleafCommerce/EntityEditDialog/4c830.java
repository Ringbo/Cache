diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/view/dynamic/dialog/EntityEditDialog.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/view/dynamic/dialog/EntityEditDialog.java
index d6b85b9..40f014e 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/view/dynamic/dialog/EntityEditDialog.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/client/view/dynamic/dialog/EntityEditDialog.java
@@ -182,14 +182,14 @@
         redraw();
         saveButton.setVisible(true);
         setHeight(20);
-        int formHeight = hStack.getScrollHeight() + vLayout.getScrollHeight() + 30;
+        int formHeight = hStack.getScrollHeight() + vLayout.getScrollHeight() + 10;
         if (formHeight > 600) {
             setHeight(600);
         } else {
             setHeight(formHeight);
         }
         setWidth(20);
-        int formWidth = hStack.getScrollWidth() + 30;
+        int formWidth = hStack.getScrollWidth() + 10;
         if (formWidth > 800) {
             setWidth(800);
         } else if (formWidth < 400) {
@@ -269,14 +269,14 @@
         redraw();
         saveButton.setVisible(!readOnly);
         setHeight(20);
-        int formHeight = hStack.getScrollHeight() + vLayout.getScrollHeight() + 30;
+        int formHeight = hStack.getScrollHeight() + vLayout.getScrollHeight() + 10;
         if (formHeight > 600) {
             setHeight(600);
         } else {
             setHeight(formHeight);
         }
         setWidth(20);
-        int formWidth = hStack.getScrollWidth() + 30;
+        int formWidth = hStack.getScrollWidth() + 10;
         if (formWidth > 800) {
             setWidth(800);
         } else if (formWidth < 400) {
