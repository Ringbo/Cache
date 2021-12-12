diff --git a/h2o-algos/src/test/java/hex/tree/gbm/GBMTest.java b/h2o-algos/src/test/java/hex/tree/gbm/GBMTest.java
index c2421e3..bc1b4de 100755
--- a/h2o-algos/src/test/java/hex/tree/gbm/GBMTest.java
+++ b/h2o-algos/src/test/java/hex/tree/gbm/GBMTest.java
@@ -632,7 +632,7 @@
     }
     Scope.exit();
     for( double mse : mses )
-      assertEquals(0.21926955145068244, mse, 1e-8); //check for the same result on 1 nodes and 5 nodes (will only work with enough chunks)
+      assertEquals(0.21979375165014595, mse, 1e-8); //check for the same result on 1 nodes and 5 nodes (will only work with enough chunks)
   }
 
   @Test public void testReprodubilityAirlineSingleNode() {
@@ -691,7 +691,7 @@
     }
     Scope.exit();
     for( double mse : mses )
-      assertEquals(0.21926955145068244, mse, 1e-8); //check for the same result on 1 nodes and 5 nodes (will only work with enough chunks)
+      assertEquals(0.21979375165014595, mse, 1e-8); //check for the same result on 1 nodes and 5 nodes (will only work with enough chunks)
   }
 
   // HEXDEV-223
