diff --git a/plugins/git4idea/src/git4idea/changes/GitChangeUtils.java b/plugins/git4idea/src/git4idea/changes/GitChangeUtils.java
index 70fc108..bad9519 100644
--- a/plugins/git4idea/src/git4idea/changes/GitChangeUtils.java
+++ b/plugins/git4idea/src/git4idea/changes/GitChangeUtils.java
@@ -526,7 +526,7 @@
       return getDiff(repository.getProject(), repository.getRoot(), oldRevision, newRevision, null, detectRenames);
     }
     catch (VcsException e) {
-      LOG.warn("Couldn't collect changes between " + oldRevision + " and " + newRevision, e);
+      LOG.info("Couldn't collect changes between " + oldRevision + " and " + newRevision, e);
       return null;
     }
   }
