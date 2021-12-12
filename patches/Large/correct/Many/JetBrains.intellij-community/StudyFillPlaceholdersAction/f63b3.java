diff --git a/python/educational/interactive-learning/src/com/jetbrains/edu/learning/actions/StudyFillPlaceholdersAction.java b/python/educational/interactive-learning/src/com/jetbrains/edu/learning/actions/StudyFillPlaceholdersAction.java
index 634b0ca..d8e323c 100644
--- a/python/educational/interactive-learning/src/com/jetbrains/edu/learning/actions/StudyFillPlaceholdersAction.java
+++ b/python/educational/interactive-learning/src/com/jetbrains/edu/learning/actions/StudyFillPlaceholdersAction.java
@@ -57,7 +57,7 @@
         e.getPresentation().setEnabledAndVisible(false);
       }
       TaskFile taskFile = studyState.getTaskFile();
-      if (taskFile.getAnswerPlaceholders().isEmpty()) {
+      if (taskFile == null || taskFile.getAnswerPlaceholders().isEmpty()) {
         e.getPresentation().setEnabledAndVisible(false);
       }
     }
