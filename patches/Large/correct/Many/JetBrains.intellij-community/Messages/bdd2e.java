diff --git a/platform/platform-api/src/com/intellij/openapi/ui/Messages.java b/platform/platform-api/src/com/intellij/openapi/ui/Messages.java
index 34db663..00c7bfb 100644
--- a/platform/platform-api/src/com/intellij/openapi/ui/Messages.java
+++ b/platform/platform-api/src/com/intellij/openapi/ui/Messages.java
@@ -432,7 +432,7 @@
 
   public static void showWarningDialog(Project project, String message, String title) {
     if (canShowMacSheetPanel()) {
-      MacMessages.getInstance().showErrorDialog(CommonBundle.getErrorTitle(), message, OK_BUTTON, WindowManager.getInstance().suggestParentWindow(project));
+      MacMessages.getInstance().showErrorDialog(CommonBundle.getWarningTitle(), message, OK_BUTTON, WindowManager.getInstance().suggestParentWindow(project));
       return;
     }
     
@@ -441,7 +441,7 @@
 
   public static void showWarningDialog(Component component, String message, String title) {
     if (canShowMacSheetPanel()) {
-      MacMessages.getInstance().showErrorDialog(CommonBundle.getErrorTitle(), message, OK_BUTTON, SwingUtilities.getWindowAncestor(component));
+      MacMessages.getInstance().showErrorDialog(CommonBundle.getWarningTitle(), message, OK_BUTTON, SwingUtilities.getWindowAncestor(component));
       return;
     }
 
@@ -456,7 +456,7 @@
    */
   public static void showWarningDialog(String message, String title) {
     if (canShowMacSheetPanel()) {
-      MacMessages.getInstance().showErrorDialog(CommonBundle.getErrorTitle(), message, OK_BUTTON, null);
+      MacMessages.getInstance().showErrorDialog(CommonBundle.getWarningTitle(), message, OK_BUTTON, null);
       return;
     }
     
