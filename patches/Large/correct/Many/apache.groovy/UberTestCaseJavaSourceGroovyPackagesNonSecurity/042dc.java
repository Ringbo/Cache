diff --git a/src/test/UberTestCaseJavaSourceGroovyPackagesNonSecurity.java b/src/test/UberTestCaseJavaSourceGroovyPackagesNonSecurity.java
index 3724491..8c714f2 100644
--- a/src/test/UberTestCaseJavaSourceGroovyPackagesNonSecurity.java
+++ b/src/test/UberTestCaseJavaSourceGroovyPackagesNonSecurity.java
@@ -9,6 +9,6 @@
  */
 public class UberTestCaseJavaSourceGroovyPackagesNonSecurity extends TestCase {
     public static Test suite() {
-        return GroovyJavaNonSecurityTestsSuite.suite();
+        return JavaSourceGroovyPackagesNonSecuritySuite.suite();
     }
 }
