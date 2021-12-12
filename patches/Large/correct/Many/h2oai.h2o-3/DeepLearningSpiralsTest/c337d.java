diff --git a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningSpiralsTest.java b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningSpiralsTest.java
index c357d77..a02cb3f 100644
--- a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningSpiralsTest.java
+++ b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningSpiralsTest.java
@@ -90,7 +90,7 @@
         }
       }
     }
-    fr.delete();
+    frame.delete();
     Scope.exit();
   }
 }
