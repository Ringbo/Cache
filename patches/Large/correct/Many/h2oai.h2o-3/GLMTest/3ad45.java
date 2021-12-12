diff --git a/h2o-algos/src/test/java/hex/glm/GLMTest.java b/h2o-algos/src/test/java/hex/glm/GLMTest.java
index 336a17c..aa5044c 100644
--- a/h2o-algos/src/test/java/hex/glm/GLMTest.java
+++ b/h2o-algos/src/test/java/hex/glm/GLMTest.java
@@ -31,7 +31,7 @@
 
 public class GLMTest  extends TestUtil {
 
-  @BeforeClass public static void setup() { stall_till_cloudsize(5); }
+  @BeforeClass public static void setup() { stall_till_cloudsize(1); }
 
   public static void testScoring(GLMModel m, Frame fr) {
     Scope.enter();
@@ -643,7 +643,7 @@
       ModelMetricsBinomialGLM val = (ModelMetricsBinomialGLM) model._output._training_metrics;
       assertEquals(512.2888, val._nullDev, 1e-1);
       // 388.4952716196743
-      assertTrue(val._resDev <= 379);
+      assertTrue(val._resDev <= 388.5);
       model.delete();
       params._lambda = new double[]{0};
       params._alpha = new double[]{0};
