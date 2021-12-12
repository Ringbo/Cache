diff --git a/platform/diff-impl/src/com/intellij/diff/tools/util/threeside/ThreesideTextDiffViewer.java b/platform/diff-impl/src/com/intellij/diff/tools/util/threeside/ThreesideTextDiffViewer.java
index 3740fd2..80372f4 100644
--- a/platform/diff-impl/src/com/intellij/diff/tools/util/threeside/ThreesideTextDiffViewer.java
+++ b/platform/diff-impl/src/com/intellij/diff/tools/util/threeside/ThreesideTextDiffViewer.java
@@ -347,7 +347,7 @@
 
       DiffRequest request = new SimpleDiffRequest(myRequest.getTitle(),
                                                   mySide1.select(contents), mySide2.select(contents),
-                                                  mySide1.select(titles), mySide1.select(titles));
+                                                  mySide1.select(titles), mySide2.select(titles));
       DiffManager.getInstance().showDiff(myProject, request, new DiffDialogHints(null, myPanel));
     }
   }
