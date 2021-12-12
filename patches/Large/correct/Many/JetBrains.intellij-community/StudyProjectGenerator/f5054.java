diff --git a/python/educational-core/student/src/com/jetbrains/edu/learning/courseGeneration/StudyProjectGenerator.java b/python/educational-core/student/src/com/jetbrains/edu/learning/courseGeneration/StudyProjectGenerator.java
index 69c8701..55f5713 100644
--- a/python/educational-core/student/src/com/jetbrains/edu/learning/courseGeneration/StudyProjectGenerator.java
+++ b/python/educational-core/student/src/com/jetbrains/edu/learning/courseGeneration/StudyProjectGenerator.java
@@ -345,7 +345,7 @@
         courseInfos.addAll(getCoursesFromCache());
       }
 
-      writer = new PrintWriter(cacheFile);
+      writer = new PrintWriter(cacheFile, "UTF-8");
       for (CourseInfo courseInfo : courseInfos) {
         final String json = gson.toJson(courseInfo);
         writer.println(json);
