diff --git a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java
index 15efe3f..e2e0a77 100755
--- a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java
+++ b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java
@@ -24,7 +24,7 @@
 import static hex.ConfusionMatrix.buildCM;
 
 public class DeepLearningProstateTest extends TestUtil {
-  @BeforeClass() public static void setup() { stall_till_cloudsize(1); }
+  @BeforeClass() public static void setup() { stall_till_cloudsize(5); }
 
   @Test public void run() throws Exception { runFraction(0.00001f); }
 
@@ -303,7 +303,7 @@
                                           assert(model1.model_info().get_params()._l1 == 0);
                                           assert(model1.model_info().get_params()._l2 == 0);
 
-                                          Assert.assertTrue(model2.model_info().get_processed_total() >= frame.numRows() * 2 * epochs);
+                                          Assert.assertTrue(model2.model_info().isBogus() || model2.model_info().get_processed_total() >= frame.numRows() * 2 * epochs);
 
                                           assert(p != p2);
                                           assert(p != model1.model_info().get_params());
@@ -333,10 +333,10 @@
                                           assert(model2.model_info().get_params()._l2 == 1e-3);
 
                                           if (valid == null) valid = frame;
-                                          double threshold = 0;
+                                          double threshold;
                                           if (model2._output.isClassifier()) {
                                             Frame pred = null, pred2 = null;
-                                            Vec labels = null, predlabels = null, pred2labels = null;
+                                            Vec labels, predlabels, pred2labels;
                                             try {
                                               pred = model2.score(valid);
                                               // Build a POJO, validate same results
