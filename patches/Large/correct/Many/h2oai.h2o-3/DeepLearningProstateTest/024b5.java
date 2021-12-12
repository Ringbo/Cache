diff --git a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java
index 4b65a5b..d39bdf1 100644
--- a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java
+++ b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java
@@ -22,7 +22,7 @@
 import static hex.deeplearning.DeepLearningModel.DeepLearningParameters;
 
 public class DeepLearningProstateTest extends TestUtil {
-  @BeforeClass() public static void setup() { stall_till_cloudsize(1); }
+  @BeforeClass() public static void setup() { stall_till_cloudsize(5); }
 
   @Test public void run() throws Exception { runFraction(0.001f); }
 
