diff --git a/src/main/java/junit/runner/BaseTestRunner.java b/src/main/java/junit/runner/BaseTestRunner.java
index 48e62a0..ced137e 100644
--- a/src/main/java/junit/runner/BaseTestRunner.java
+++ b/src/main/java/junit/runner/BaseTestRunner.java
@@ -111,7 +111,7 @@
         }
         Method suiteMethod = null;
         try {
-            suiteMethod = testClass.getMethod(SUITE_METHODNAME, new Class[0]);
+            suiteMethod = testClass.getMethod(SUITE_METHODNAME);
         } catch (Exception e) {
             // try to extract a test suite automatically
             clearStatus();
@@ -123,7 +123,7 @@
         }
         Test test = null;
         try {
-            test = (Test) suiteMethod.invoke(null, (Object[]) new Class[0]); // static method
+            test = (Test) suiteMethod.invoke(null); // static method
             if (test == null) {
                 return test;
             }
