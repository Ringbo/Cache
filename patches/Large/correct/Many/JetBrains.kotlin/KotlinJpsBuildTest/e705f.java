diff --git a/jps-plugin/test/org/jetbrains/kotlin/jps/build/KotlinJpsBuildTest.java b/jps-plugin/test/org/jetbrains/kotlin/jps/build/KotlinJpsBuildTest.java
index c30fbd6..25061ee 100644
--- a/jps-plugin/test/org/jetbrains/kotlin/jps/build/KotlinJpsBuildTest.java
+++ b/jps-plugin/test/org/jetbrains/kotlin/jps/build/KotlinJpsBuildTest.java
@@ -324,19 +324,19 @@
     }
 
     public void testKotlinJavaProject() {
-        doTest();
+        doTestWithRuntime();
     }
 
     public void testJKJProject() {
-        doTest();
+        doTestWithRuntime();
     }
 
     public void testKJKProject() {
-        doTest();
+        doTestWithRuntime();
     }
 
     public void testKJCircularProject() {
-        doTest();
+        doTestWithRuntime();
     }
 
     public void testJKJInheritanceProject() {
