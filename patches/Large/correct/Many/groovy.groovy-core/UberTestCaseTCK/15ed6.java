diff --git a/src/test/UberTestCaseTCK.java b/src/test/UberTestCaseTCK.java
index c32b1a9..00caec8 100644
--- a/src/test/UberTestCaseTCK.java
+++ b/src/test/UberTestCaseTCK.java
@@ -14,7 +14,7 @@
 public class UberTestCaseTCK extends TestCase {
     public static Test suite() {
         TestSuite suite = (TestSuite) AllTestSuite.suite("src/test/gls", "**/*Test.groovy");
-        suite.addTest(AllGlsJavaTestsSuite.suite());
+        suite.addTest(JavaSourceTckSuite.suite());
         return suite;
     }
 }
