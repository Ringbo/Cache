diff --git a/plugins/git4idea/src/git4idea/rebase/GitRebaseDialog.java b/plugins/git4idea/src/git4idea/rebase/GitRebaseDialog.java
index 9a31198..e2fe11e 100644
--- a/plugins/git4idea/src/git4idea/rebase/GitRebaseDialog.java
+++ b/plugins/git4idea/src/git4idea/rebase/GitRebaseDialog.java
@@ -204,7 +204,7 @@
       GitRevisionNumber.resolve(myProject, gitRoot(), revisionExpression);
       return true;
     }
-    catch (VcsException e) {
+    catch (Exception e) {
       LOG.debug(e);
       return false;
     }
