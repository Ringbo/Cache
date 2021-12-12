diff --git a/plugins/git4idea/src/git4idea/log/GitLogProvider.java b/plugins/git4idea/src/git4idea/log/GitLogProvider.java
index 37a8a31..cf43a69 100644
--- a/plugins/git4idea/src/git4idea/log/GitLogProvider.java
+++ b/plugins/git4idea/src/git4idea/log/GitLogProvider.java
@@ -301,7 +301,7 @@
     List<String> parameters = new ArrayList<>(GitLogUtil.LOG_ALL);
     parameters.add("--date-order");
 
-    final GitBekParentFixer parentFixer = GitBekParentFixer.prepare(root, this);
+    final GitBekParentFixer parentFixer = GitBekParentFixer.prepare(myProject, root, this);
     Set<VcsUser> userRegistry = newHashSet();
     Set<VcsRef> refs = newHashSet();
     GitLogUtil.readTimedCommits(myProject, root, parameters, new CollectConsumer<>(userRegistry), new CollectConsumer<>(refs),
