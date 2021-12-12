diff --git a/plugins/plugins-tests/tests/org/jetbrains/kotlin/annotation/processing/test/wrappers/AbstractJavaAnnotationProcessingTest.java b/plugins/plugins-tests/tests/org/jetbrains/kotlin/annotation/processing/test/wrappers/AbstractJavaAnnotationProcessingTest.java
index f35b455..ed58a90 100755
--- a/plugins/plugins-tests/tests/org/jetbrains/kotlin/annotation/processing/test/wrappers/AbstractJavaAnnotationProcessingTest.java
+++ b/plugins/plugins-tests/tests/org/jetbrains/kotlin/annotation/processing/test/wrappers/AbstractJavaAnnotationProcessingTest.java
@@ -60,7 +60,7 @@
         TestCase.assertTrue("No FqName specified. First line of the form '// f.q.Name' expected", matcher.find());
         String fqName = matcher.group(1);
 
-        getEnvironment().updateClasspath(Collections.singletonList(testDir));
+        getEnvironment().tryUpdateClasspath(Collections.singletonList(testDir));
 
         super.doTest(new File(testDir.getParentFile(), "common.kt").getCanonicalPath());
         
