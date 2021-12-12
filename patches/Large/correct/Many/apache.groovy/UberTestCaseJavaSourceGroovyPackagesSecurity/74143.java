diff --git a/src/test/UberTestCaseJavaSourceGroovyPackagesSecurity.java b/src/test/UberTestCaseJavaSourceGroovyPackagesSecurity.java
index be05159..6462b9b 100644
--- a/src/test/UberTestCaseJavaSourceGroovyPackagesSecurity.java
+++ b/src/test/UberTestCaseJavaSourceGroovyPackagesSecurity.java
@@ -10,7 +10,7 @@
 public class UberTestCaseJavaSourceGroovyPackagesSecurity extends TestCase {
 
     public static Test suite() {
-        return GroovyJavaSecurityTestsSuite.suite();
+        return JavaSourceGroovyPackagesSecuritySuite.suite();
     }
 
 }
