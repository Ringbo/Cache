diff --git a/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/impl/print/ColorGetterByLayoutIndex.java b/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/impl/print/ColorGetterByLayoutIndex.java
index 8b390e6..958cc6c 100644
--- a/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/impl/print/ColorGetterByLayoutIndex.java
+++ b/platform/vcs-log/graph/src/com/intellij/vcs/log/graph/impl/print/ColorGetterByLayoutIndex.java
@@ -62,7 +62,7 @@
       return myColorManager.getColorOfFragment(headCommitId, Math.max(upLayoutIndex, downLayoutIndex));
     }
 
-    if (upLayoutIndex == getLayoutIndex(getLayoutIndex(upNodeIndex)))
+    if (upLayoutIndex == getLayoutIndex(getHeadNodeId(upNodeIndex)))
       return myColorManager.getColorOfBranch(headCommitId);
     else
       return myColorManager.getColorOfFragment(headCommitId, upLayoutIndex);
