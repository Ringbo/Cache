diff --git a/platform/lang-impl/src/com/intellij/openapi/module/impl/RemoveInvalidElementsDialog.java b/platform/lang-impl/src/com/intellij/openapi/module/impl/RemoveInvalidElementsDialog.java
index 4fc802a..f27d9e4 100644
--- a/platform/lang-impl/src/com/intellij/openapi/module/impl/RemoveInvalidElementsDialog.java
+++ b/platform/lang-impl/src/com/intellij/openapi/module/impl/RemoveInvalidElementsDialog.java
@@ -85,7 +85,7 @@
       ConfigurationErrorDescription error = errors.get(0);
       String message = error.getDescription() + "\n" + error.getIgnoreConfirmationMessage();
       final int answer = Messages.showYesNoDialog(project, message, title, Messages.getErrorIcon());
-      if (answer == 1) {
+      if (answer == 0) {
         error.ignoreInvalidElement();
       }
       return;
