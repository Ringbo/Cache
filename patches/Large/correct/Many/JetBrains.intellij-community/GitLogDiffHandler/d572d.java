diff --git a/plugins/git4idea/src/git4idea/log/GitLogDiffHandler.java b/plugins/git4idea/src/git4idea/log/GitLogDiffHandler.java
index 41016ac..1b538b5 100644
--- a/plugins/git4idea/src/git4idea/log/GitLogDiffHandler.java
+++ b/plugins/git4idea/src/git4idea/log/GitLogDiffHandler.java
@@ -208,7 +208,7 @@
       if (submodule != null) {
         ContentRevision revision = GitSubmoduleContentRevision.createRevision(submodule, revisionNumber);
         String content = revision.getContent();
-        diffContent = content != null ? myDiffContentFactory.create(content) : myDiffContentFactory.createEmpty();
+        diffContent = content != null ? myDiffContentFactory.create(myProject, content) : myDiffContentFactory.createEmpty();
       }
       else {
         try {
