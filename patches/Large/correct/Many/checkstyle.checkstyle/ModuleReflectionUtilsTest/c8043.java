diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/utils/ModuleReflectionUtilsTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/utils/ModuleReflectionUtilsTest.java
index de02292..c415f7b 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/utils/ModuleReflectionUtilsTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/utils/ModuleReflectionUtilsTest.java
@@ -104,12 +104,12 @@
 
     private static class Bar extends AbstractInvalidClass {
         @Override
-        void method() {
+        public void method() {
         }
     }
 
     private abstract static class AbstractInvalidClass extends AutomaticBean {
-        abstract void method();
+        public abstract void method();
     }
 
     private static class CheckClass extends AbstractCheck {
