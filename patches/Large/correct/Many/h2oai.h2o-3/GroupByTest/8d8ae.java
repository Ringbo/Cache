diff --git a/h2o-core/src/test/java/water/rapids/GroupByTest.java b/h2o-core/src/test/java/water/rapids/GroupByTest.java
index 863e107..2e2da18 100644
--- a/h2o-core/src/test/java/water/rapids/GroupByTest.java
+++ b/h2o-core/src/test/java/water/rapids/GroupByTest.java
@@ -9,11 +9,11 @@
 import water.fvec.Frame;
 
 public class GroupByTest extends TestUtil {
-  @BeforeClass public static void setup() { stall_till_cloudsize(5); }
+  @BeforeClass public static void setup() { stall_till_cloudsize(1); }
 
   @Test public void testBasic() {
     Frame fr = null;
-    String tree = "(GB hex [1] [] mean 2 \"all\")"; // Group-By on col 1 (not 0), no order-by, mean of col 2
+    String tree = "(GB hex [1] [0] mean 2 \"all\")"; // Group-By on col 1 (not 0), no order-by, mean of col 2
     try {
       fr = chkTree(tree,"smalldata/iris/iris_wheader.csv");
       chkDim(fr,2,23);
@@ -35,7 +35,7 @@
 
   @Test public void testCatGroup() {
     Frame fr = null;
-    String tree = "(GB hex [4] [] nrow 0 \"all\" mean 2 \"all\")"; // Group-By on col 4, no order-by, nrow and mean of col 2
+    String tree = "(GB hex [4] [0] nrow 0 \"all\" mean 2 \"all\")"; // Group-By on col 4, no order-by, nrow and mean of col 2
     try {
       fr = chkTree(tree,"smalldata/iris/iris_wheader.csv");
       chkDim(fr,3,3);
@@ -62,7 +62,7 @@
   @Test public void testNAHandle() {
     Frame fr = null;
     try {
-      String tree = "(GB hex [7] [] nrow 0 \"all\" mean 1 \"all\")"; // Group-By on year, no order-by, mean of economy
+      String tree = "(GB hex [7] [0] nrow 0 \"all\" mean 1 \"all\")"; // Group-By on year, no order-by, mean of economy
       fr = chkTree(tree,"smalldata/junit/cars.csv");
       chkDim(fr,3,13);
 
@@ -101,7 +101,7 @@
   @Test public void testAllAggs() {
     Frame fr = null;
     try {
-      String tree = "(GB hex [4] []  nrow 0 \"rm\"  mean 1 \"rm\"  sum 1 \"rm\"  min 1 \"rm\"  max 1 \"rm\" )";
+      String tree = "(GB hex [4] [0]  nrow 0 \"rm\"  mean 1 \"rm\"  sum 1 \"rm\"  min 1 \"rm\"  max 1 \"rm\" )";
       fr = chkTree(tree,"smalldata/iris/iris_wheader.csv");
       chkDim(fr,6,3);
 
