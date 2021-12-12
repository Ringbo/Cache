diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/NodeAroundProvider.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/NodeAroundProvider.java
index 9526c7b..bec7540 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/data/NodeAroundProvider.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/data/NodeAroundProvider.java
@@ -43,7 +43,7 @@
       Node commitNode = getCommitNodeInRow(i);
       if (commitNode != null) {
         Hash hash = myDataHolder.getHash(commitNode.getCommitIndex());
-        commits.putValue(node.getBranch().getRepositoryRoot(), hash);
+        commits.putValue(commitNode.getBranch().getRepositoryRoot(), hash);
       }
     }
     return commits;
