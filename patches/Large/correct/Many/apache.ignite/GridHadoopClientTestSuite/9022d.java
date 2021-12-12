diff --git a/modules/hadoop-client/src/test/java/org/gridgain/client/hadoop/suite/GridHadoopClientTestSuite.java b/modules/hadoop-client/src/test/java/org/gridgain/client/hadoop/suite/GridHadoopClientTestSuite.java
index 722fe4c..e9231fe 100644
--- a/modules/hadoop-client/src/test/java/org/gridgain/client/hadoop/suite/GridHadoopClientTestSuite.java
+++ b/modules/hadoop-client/src/test/java/org/gridgain/client/hadoop/suite/GridHadoopClientTestSuite.java
@@ -19,13 +19,14 @@
 public class GridHadoopClientTestSuite extends TestSuite {
     /**
      * @return Test suite.
+     * @throws Exception If failed.
      */
-    public static TestSuite suite() {
+    public static TestSuite suite() throws Exception {
         TestSuite suite = new TestSuite("Gridgain Hadoop Client Test Suite");
 
         suite.addTestSuite(GridHadoopClientProtocolSelfTest.class);
 
-        suite.addTest(new TestSuite(GridHadoopTestSuite.class));
+        suite.addTest(GridHadoopTestSuite.suite());
 
         return suite;
     }
