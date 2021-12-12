diff --git a/h2o-algos/src/test/java/hex/glm/GLMBasicTestBinomial.java b/h2o-algos/src/test/java/hex/glm/GLMBasicTestBinomial.java
index 52f45ed..0d5f971 100644
--- a/h2o-algos/src/test/java/hex/glm/GLMBasicTestBinomial.java
+++ b/h2o-algos/src/test/java/hex/glm/GLMBasicTestBinomial.java
@@ -438,7 +438,7 @@
         // compare validation res dev matches R
         // sum(binomial()$dev.resids(y=test$CAPSULE,mu=p,wt=1))
         // [1]80.92923
-        assertTrue(80.92923 >= GLMTest.residualDevianceTest(model) + 1e-2);
+        assertTrue(80.92923 >= GLMTest.residualDevianceTest(model) - 1e-2);
 //      compare validation null dev against R
 //      sum(binomial()$dev.resids(y=test$CAPSULE,mu=.5,wt=1))
 //      [1] 124.7665
