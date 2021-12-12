diff --git a/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java b/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java
index c69501b..203a715 100644
--- a/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java
+++ b/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java
@@ -658,7 +658,7 @@
     }
     if (!removed.isEmpty()) {
       try {
-        GitFileUtils.delete(project, root, removed, "--ignore-unmatch");
+        GitFileUtils.delete(project, root, removed, "--ignore-unmatch", "--cached");
       }
       catch (VcsException ex) {
         exceptions.add(ex);
