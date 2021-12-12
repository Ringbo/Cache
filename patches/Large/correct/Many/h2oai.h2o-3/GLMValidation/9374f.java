diff --git a/h2o-algos/src/main/java/hex/glm/GLMValidation.java b/h2o-algos/src/main/java/hex/glm/GLMValidation.java
index ab5d403..b810ee8 100644
--- a/h2o-algos/src/main/java/hex/glm/GLMValidation.java
+++ b/h2o-algos/src/main/java/hex/glm/GLMValidation.java
@@ -117,7 +117,7 @@
       double logfactorial = 0;
       for( long i = 2; i <= y; ++i )
         logfactorial += Math.log(i);
-      _aic2 += weight + (yreal * Math.log(ymodel) - logfactorial - ymodel);
+      _aic2 += weight * (yreal * Math.log(ymodel) - logfactorial - ymodel);
     }
   }
 
