diff --git a/platform/diff-impl/src/com/intellij/diff/tools/util/side/TwosideTextDiffViewer.java b/platform/diff-impl/src/com/intellij/diff/tools/util/side/TwosideTextDiffViewer.java
index 96ea76a..3864ed6 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/util/side/TwosideTextDiffViewer.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/util/side/TwosideTextDiffViewer.java
@@ -320,7 +320,7 @@
       }
 
       setCurrentSide(targetSide);
-      currentEditor.getScrollingModel().scrollToCaret(ScrollType.MAKE_VISIBLE);
+      targetEditor.getScrollingModel().scrollToCaret(ScrollType.MAKE_VISIBLE);
 
       DiffUtil.requestFocus(getProject(), getPreferredFocusedComponent());
     }
