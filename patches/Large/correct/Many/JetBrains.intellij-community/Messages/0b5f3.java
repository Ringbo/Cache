diff --git a/platform/platform-api/src/com/intellij/openapi/ui/Messages.java b/platform/platform-api/src/com/intellij/openapi/ui/Messages.java
index fae5466..1d500eb 100644
--- a/platform/platform-api/src/com/intellij/openapi/ui/Messages.java
+++ b/platform/platform-api/src/com/intellij/openapi/ui/Messages.java
@@ -213,7 +213,7 @@
    */
   public static int showYesNoDialog(Project project, String message, String title, String yesText, String noText, @Nullable Icon icon) {
     if (SystemInfo.isMac && !isApplicationInUnitTestOrHeadless()) {
-      return MacMessages.showYesNoDialog(message, title, yesText, noText, WindowManager.getInstance().suggestParentWindow(project));
+      return MacMessages.showYesNoDialog(title, message, yesText, noText, WindowManager.getInstance().suggestParentWindow(project));
     }
     
     return showDialog(project, message, title, new String[]{yesText, noText}, 0, icon);
@@ -224,7 +224,7 @@
    */
   public static int showYesNoDialog(Project project, String message, String title, @Nullable Icon icon) {
     if (SystemInfo.isMac && !isApplicationInUnitTestOrHeadless()) {
-      return MacMessages.showYesNoDialog(message, title, YES_BUTTON, NO_BUTTON, WindowManager.getInstance().suggestParentWindow(project));
+      return MacMessages.showYesNoDialog(title, message, YES_BUTTON, NO_BUTTON, WindowManager.getInstance().suggestParentWindow(project));
     }
     
     return showYesNoDialog(project, message, title, YES_BUTTON, NO_BUTTON, icon);
@@ -235,7 +235,7 @@
    */
   public static int showYesNoDialog(Component parent, String message, String title, @Nullable Icon icon) {
     if (SystemInfo.isMac && !isApplicationInUnitTestOrHeadless()) {
-      return MacMessages.showYesNoDialog(message, title, YES_BUTTON, NO_BUTTON, SwingUtilities.getWindowAncestor(parent));
+      return MacMessages.showYesNoDialog(title, message, YES_BUTTON, NO_BUTTON, SwingUtilities.getWindowAncestor(parent));
     }
     
     return showDialog(parent, message, title, new String[]{YES_BUTTON, NO_BUTTON}, 0, icon);
