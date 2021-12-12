diff --git a/platform/platform-impl/src/com/intellij/diagnostic/IdeErrorsDialog.java b/platform/platform-impl/src/com/intellij/diagnostic/IdeErrorsDialog.java
index e1c4f43..ce56c4c 100644
--- a/platform/platform-impl/src/com/intellij/diagnostic/IdeErrorsDialog.java
+++ b/platform/platform-impl/src/com/intellij/diagnostic/IdeErrorsDialog.java
@@ -347,7 +347,7 @@
       @Override
       public void hyperlinkUpdate(HyperlinkEvent e) {
         if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
-          JetBrainsAccountDialogKt.showJetBrainsAccountDialog(getRootPane(), null).show();
+          JetBrainsAccountDialogKt.showJetBrainsAccountDialog(getRootPane()).show();
           updateCredentialsPane(getSelectedMessage());
         }
       }
