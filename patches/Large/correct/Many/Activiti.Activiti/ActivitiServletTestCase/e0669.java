diff --git a/modules/activiti-cactus/src/main/java/org/activiti/test/cactus/ActivitiServletTestCase.java b/modules/activiti-cactus/src/main/java/org/activiti/test/cactus/ActivitiServletTestCase.java
index 17bcc24..811fa8a 100644
--- a/modules/activiti-cactus/src/main/java/org/activiti/test/cactus/ActivitiServletTestCase.java
+++ b/modules/activiti-cactus/src/main/java/org/activiti/test/cactus/ActivitiServletTestCase.java
@@ -102,7 +102,7 @@
     } else if (Test.class.isAssignableFrom(testClass)) {
       // Test case, should be wrapped in TestSuite to have all
       // test-methods turned into a single Test
-      TestSuite testSuite = new TestSuite(testClass);
+      ServletTestSuite testSuite = new ServletTestSuite(testClass);
       suite.addTest(testSuite);
     } else {
       throw new RuntimeException("Class " + classname + " is not a TestCase nor a TestSuite");
