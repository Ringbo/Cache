diff --git a/h2o-core/src/main/java/hex/Distributions.java b/h2o-core/src/main/java/hex/Distributions.java
index 4192991..0827bcb 100644
--- a/h2o-core/src/main/java/hex/Distributions.java
+++ b/h2o-core/src/main/java/hex/Distributions.java
@@ -115,7 +115,7 @@
       case poisson:
       case gamma:
       case tweedie:
-        assert(0<f);
+        assert(0<=f);
         return log(f);
       default:
         throw H2O.unimpl();
