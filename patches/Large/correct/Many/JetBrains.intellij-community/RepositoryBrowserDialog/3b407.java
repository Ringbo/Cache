diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/dialogs/RepositoryBrowserDialog.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/dialogs/RepositoryBrowserDialog.java
index 83f74ac..d10f0dd 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/dialogs/RepositoryBrowserDialog.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/dialogs/RepositoryBrowserDialog.java
@@ -652,7 +652,7 @@
             final int result =
               Messages.showOkCancelDialog(myProject, "You are about to move folder named '" + lastFolder +
                                                      "'. Are you sure?", SvnBundle.message(myDialogTitleKey), Messages.getWarningIcon());
-            if (Messages.OK == result) return;
+            if (Messages.OK != result) return;
           }
         }
         String message = dialog.getCommitMessage();
