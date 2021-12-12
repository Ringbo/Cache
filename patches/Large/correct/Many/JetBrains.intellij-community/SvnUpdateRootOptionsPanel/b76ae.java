diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/update/SvnUpdateRootOptionsPanel.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/update/SvnUpdateRootOptionsPanel.java
index e26d58d..5a260ed 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/update/SvnUpdateRootOptionsPanel.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/update/SvnUpdateRootOptionsPanel.java
@@ -136,7 +136,7 @@
       }
       else {
         try {
-          myURLText.setText(url.appendPath(branchRelativeUrl, true).toDecodedString());
+          myURLText.setText(url.appendPath(branchRelativeUrl, false).toDecodedString());
         }
         catch (SvnBindException e) {
           LOG.error(e);
