diff --git a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/profiles/SeparateClassloaderTestRunner.java b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/profiles/SeparateClassloaderTestRunner.java
index cdb4e7b..fa4ba6d 100644
--- a/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/profiles/SeparateClassloaderTestRunner.java
+++ b/truffle/com.oracle.truffle.api.test/src/com/oracle/truffle/api/profiles/SeparateClassloaderTestRunner.java
@@ -47,7 +47,7 @@
     }
 
     private static class TestClassLoader extends URLClassLoader {
-        public TestClassLoader() {
+        TestClassLoader() {
             super(((URLClassLoader) getSystemClassLoader()).getURLs());
         }
 
