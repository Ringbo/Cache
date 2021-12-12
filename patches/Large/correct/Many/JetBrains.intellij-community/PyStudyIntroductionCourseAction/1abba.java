diff --git a/python/educational-python/Edu-Python/src/com/jetbrains/edu/learning/actions/PyStudyIntroductionCourseAction.java b/python/educational-python/Edu-Python/src/com/jetbrains/edu/learning/actions/PyStudyIntroductionCourseAction.java
index 35ca0b5..0b48bac 100644
--- a/python/educational-python/Edu-Python/src/com/jetbrains/edu/learning/actions/PyStudyIntroductionCourseAction.java
+++ b/python/educational-python/Edu-Python/src/com/jetbrains/edu/learning/actions/PyStudyIntroductionCourseAction.java
@@ -50,7 +50,7 @@
     }
     final EduPluginConfigurator configurator = EduPluginConfigurator.INSTANCE.forLanguage(PythonLanguage.getInstance());
     final List<String> paths = configurator.getBundledCoursePaths();
-    if (paths.isEmpty()) {
+    if (!paths.isEmpty()) {
       return;
     }
     Presentation presentation = e.getPresentation();
