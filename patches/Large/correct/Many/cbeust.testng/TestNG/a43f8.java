diff --git a/src/main/org/testng/TestNG.java b/src/main/org/testng/TestNG.java
index 29bec7a..4e2a32a 100644
--- a/src/main/org/testng/TestNG.java
+++ b/src/main/org/testng/TestNG.java
@@ -1052,7 +1052,7 @@
     setSourcePath((String) cmdLineArgs.get(TestNGCommandLineArgs.SRC_COMMAND_OPT));
     setAnnotations(((AnnotationTypeEnum) cmdLineArgs.get(TestNGCommandLineArgs.ANNOTATIONS_COMMAND_OPT)));
 
-    List<String> testClasses = (List<String>) cmdLineArgs.get(TestNGCommandLineArgs.TESTCLASS_COMMAND_OPT);
+    List<Class> testClasses = (List<Class>) cmdLineArgs.get(TestNGCommandLineArgs.TESTCLASS_COMMAND_OPT);
     if (null != testClasses) {
       Class[] classes = (Class[]) testClasses.toArray(new Class[testClasses.size()]);
       setTestClasses(classes);
