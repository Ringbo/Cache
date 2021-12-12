diff --git a/EDIDE/src/ru/compscicenter/edide/StudyDirectoryProjectGenerator.java b/EDIDE/src/ru/compscicenter/edide/StudyDirectoryProjectGenerator.java
index 8338736..defc1ad 100644
--- a/EDIDE/src/ru/compscicenter/edide/StudyDirectoryProjectGenerator.java
+++ b/EDIDE/src/ru/compscicenter/edide/StudyDirectoryProjectGenerator.java
@@ -115,7 +115,7 @@
       String fileName = file.getName();
       String unzippedName = fileName.substring(0, fileName.indexOf("."));
       File courseDir = new File(myCoursesDir, unzippedName);
-      ZipUtil.unzip(null, courseDir, file, null, null, true);
+      ZipUtil.unzip(null, myCoursesDir, file, null, null, true);
       CourseInfo courseName = addCourse(myCourses, courseDir);
       flushCache();
       return courseName;
