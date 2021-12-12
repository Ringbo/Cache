diff --git a/python/educational-core/course-creator/src/com/jetbrains/edu/coursecreator/CCRefactoringElementListenerProvider.java b/python/educational-core/course-creator/src/com/jetbrains/edu/coursecreator/CCRefactoringElementListenerProvider.java
index 86121ab..75634c0 100644
--- a/python/educational-core/course-creator/src/com/jetbrains/edu/coursecreator/CCRefactoringElementListenerProvider.java
+++ b/python/educational-core/course-creator/src/com/jetbrains/edu/coursecreator/CCRefactoringElementListenerProvider.java
@@ -95,7 +95,7 @@
         return;
       }
       ApplicationManager.getApplication().runWriteAction(() -> {
-        VirtualFile patternFile = StudyUtils.getPatternFile(taskFile, oldName);
+        VirtualFile patternFile = StudyUtils.getPatternFile(project, taskFile, oldName);
         if (patternFile != null) {
           try {
             patternFile.delete(CCRefactoringElementListenerProvider.class);
