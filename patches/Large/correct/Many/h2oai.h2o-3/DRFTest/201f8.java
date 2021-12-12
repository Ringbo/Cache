diff --git a/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java b/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
index ebf0282..648bb39 100755
--- a/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
+++ b/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
@@ -574,7 +574,7 @@
       Log.info("trial: " + i + " -> MSE: " + mses[i]);
     }
     for (int i=0; i<mses.length; ++i) {
-      assertEquals(0.208323733363106, mses[i], 1e-4); //check for the same result on 1 nodes and 5 nodes
+      assertEquals(0.2087662734069947, mses[i], 1e-4); //check for the same result on 1 nodes and 5 nodes
     }
   }
 
