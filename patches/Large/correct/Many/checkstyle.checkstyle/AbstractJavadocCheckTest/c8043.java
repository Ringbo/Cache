diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractJavadocCheckTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractJavadocCheckTest.java
index b6733bf..6d1cb44 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractJavadocCheckTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractJavadocCheckTest.java
@@ -255,7 +255,7 @@
     private static class JavadocCatchCheck extends AbstractJavadocCheck {
         private static int javadocsNumber;
 
-        static void clearCounter() {
+        public static void clearCounter() {
             javadocsNumber = 0;
         }
 
@@ -329,7 +329,7 @@
         private static int visitCount;
         private static int leaveCount;
 
-        static void clearCounter() {
+        public static void clearCounter() {
             visitCount = 0;
             leaveCount = 0;
         }
