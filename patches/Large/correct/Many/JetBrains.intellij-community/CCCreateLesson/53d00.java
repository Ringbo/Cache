diff --git a/python/educational-core/src/com/jetbrains/edu/coursecreator/actions/CCCreateLesson.java b/python/educational-core/src/com/jetbrains/edu/coursecreator/actions/CCCreateLesson.java
index a27f895..0436abb 100644
--- a/python/educational-core/src/com/jetbrains/edu/coursecreator/actions/CCCreateLesson.java
+++ b/python/educational-core/src/com/jetbrains/edu/coursecreator/actions/CCCreateLesson.java
@@ -83,7 +83,7 @@
 
   @Override
   protected List<? extends StudyItem> getSiblings(@NotNull Course course, @Nullable StudyItem parentItem) {
-    return course.getLessons();
+    return course.getLessons(true);
   }
 
   @Override
