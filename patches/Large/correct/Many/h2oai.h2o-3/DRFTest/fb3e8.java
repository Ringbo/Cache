diff --git a/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java b/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
index 500002e..6c89824 100755
--- a/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
+++ b/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
@@ -569,7 +569,7 @@
       Log.info("trial: " + i + " -> MSE: " + mses[i]);
     }
     for (int i=0; i<mses.length; ++i) {
-      assertEquals(0.20462305452536414, mses[i], 1e-4); //check for the same result on 1 nodes and 5 nodes
+      assertEquals(0.20430759039450014, mses[i], 1e-4); //check for the same result on 1 nodes and 5 nodes
     }
   }
 
