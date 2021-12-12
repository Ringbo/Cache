diff --git a/platform/platform-impl/src/com/intellij/ui/messages/JBMacMessages.java b/platform/platform-impl/src/com/intellij/ui/messages/JBMacMessages.java
index 2a70b61..47ebb82 100644
--- a/platform/platform-impl/src/com/intellij/ui/messages/JBMacMessages.java
+++ b/platform/platform-impl/src/com/intellij/ui/messages/JBMacMessages.java
@@ -190,7 +190,7 @@
     SheetMessage sheetMessage = new SheetMessage(window, title, message, UIUtil.getQuestionIcon(),
                                                  new String [] {yesButton, noButton}, doNotAskDialogOption, yesButton, noButton);
     int result = sheetMessage.getResult().equals(yesButton) ? Messages.YES : Messages.NO;
-    if (doNotAskDialogOption != null) {
+    if (doNotAskDialogOption != null && (result == Messages.YES || doNotAskDialogOption.shouldSaveOptionsOnCancel())) {
       doNotAskDialogOption.setToBeShown(sheetMessage.toBeShown(), result);
     }
     return result;
