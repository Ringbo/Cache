diff --git a/vcs-impl/src/com/intellij/openapi/vcs/actions/CompareWithSelectedRevisionAction.java b/vcs-impl/src/com/intellij/openapi/vcs/actions/CompareWithSelectedRevisionAction.java
index cb9cd44..e9c96f6 100644
--- a/vcs-impl/src/com/intellij/openapi/vcs/actions/CompareWithSelectedRevisionAction.java
+++ b/vcs-impl/src/com/intellij/openapi/vcs/actions/CompareWithSelectedRevisionAction.java
@@ -115,7 +115,8 @@
 
     }
     catch (VcsException e1) {
-      Messages.showErrorDialog(VcsBundle.message("message.text.cannot.show.differences"), CommonBundle.message("title.error"));
+      Messages.showErrorDialog(VcsBundle.message("message.text.cannot.show.differences", e1.getMessage()),
+                               CommonBundle.message("title.error"));
     }
 
 
