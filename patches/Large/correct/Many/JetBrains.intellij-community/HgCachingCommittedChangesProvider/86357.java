diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/provider/HgCachingCommittedChangesProvider.java b/plugins/hg4idea/src/org/zmlx/hg4idea/provider/HgCachingCommittedChangesProvider.java
index e83e9c2..98577e3 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/provider/HgCachingCommittedChangesProvider.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/provider/HgCachingCommittedChangesProvider.java
@@ -348,7 +348,7 @@
       new HgCommandResultNotifier(project).notifyError(null, HgVcsMessages.message("hg4idea.error.log.command.execution"), e.getMessage());
       return null;
     }
-    if (revisions == null || revision.isEmpty()) {
+    if (revisions == null || revisions.isEmpty()) {
       return null;
     }
     HgFileRevision localRevision = revisions.get(0);
