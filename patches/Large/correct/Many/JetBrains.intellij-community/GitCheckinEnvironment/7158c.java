diff --git a/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java b/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java
index b8ebc8d..285a9b4 100644
--- a/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java
+++ b/plugins/git4idea/src/git4idea/checkin/GitCheckinEnvironment.java
@@ -923,18 +923,18 @@
                                      final Collection<? extends FilePath> removed,
                                      final List<? super VcsException> exceptions) {
     boolean rc = true;
-    if (!added.isEmpty()) {
+    if (!removed.isEmpty()) {
       try {
-        GitFileUtils.addPathsForce(project, root, added);
+        GitFileUtils.deletePaths(project, root, removed, "--ignore-unmatch", "--cached", "-r");
       }
       catch (VcsException ex) {
         exceptions.add(ex);
         rc = false;
       }
     }
-    if (!removed.isEmpty()) {
+    if (!added.isEmpty()) {
       try {
-        GitFileUtils.deletePaths(project, root, removed, "--ignore-unmatch", "--cached");
+        GitFileUtils.addPathsForce(project, root, added);
       }
       catch (VcsException ex) {
         exceptions.add(ex);
