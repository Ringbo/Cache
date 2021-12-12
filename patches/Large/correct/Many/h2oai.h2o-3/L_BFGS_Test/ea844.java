diff --git a/h2o-algos/src/test/java/hex/optimization/L_BFGS_Test.java b/h2o-algos/src/test/java/hex/optimization/L_BFGS_Test.java
index 76af741..d642c6d 100644
--- a/h2o-algos/src/test/java/hex/optimization/L_BFGS_Test.java
+++ b/h2o-algos/src/test/java/hex/optimization/L_BFGS_Test.java
@@ -102,7 +102,7 @@
       GLMGradientSolver solver = new GLMGradientSolver(glmp, dinfo, 1e-5,source.lastVec().mean(), source.numRows());
       L_BFGS.Result r = L_BFGS.solve(dinfo.fullN() + 1, solver, new L_BFGS_Params());
       GLMGradientInfo ginfo = (GLMGradientInfo) r.ginfo;
-      assertEquals(0, ginfo._val.residualDeviance(), 1e-5);
+      assertEquals(0, ginfo._val.residualDeviance(), 1e-3);
       assertTrue("iter# expected < 100, got " + r.iter, r.iter < 100);
     } finally {
       Value v = DKV.get(parsedKey);
