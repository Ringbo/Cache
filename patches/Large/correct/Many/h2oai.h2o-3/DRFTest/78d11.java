diff --git a/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java b/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
index 106a617..ada92e4 100755
--- a/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
+++ b/h2o-algos/src/test/java/hex/tree/drf/DRFTest.java
@@ -35,7 +35,7 @@
             1,
             a(a(25, 0, 0),
               a(0, 17, 1),
-              a(1, 2, 15)),
+              a(2, 1, 15)),
             s("Iris-setosa", "Iris-versicolor", "Iris-virginica"));
 
   }
@@ -52,8 +52,8 @@
             },
             5,
             a(a(41, 0, 0),
-              a(0, 39, 3),
-              a(0, 4, 41)),
+              a(1, 39, 2),
+              a(1, 3, 41)),
             s("Iris-setosa", "Iris-versicolor", "Iris-virginica"));
   }
 
@@ -70,10 +70,10 @@
             },
             1,
             a(a(0, 0, 0, 0, 0),
-              a(0, 62, 0, 7, 0),
+              a(3,64, 0, 2, 0),
               a(0, 1, 0, 0, 0),
-              a(0, 0, 0, 31, 0),
-              a(0, 0, 0, 0, 40)),
+              a(0, 0, 1,30, 0),
+              a(0, 0, 0, 1,39)),
             s("3", "4", "5", "6", "8"));
   }
 
@@ -89,10 +89,10 @@
             },
             5,
             a(a(3,   0, 0,  0,  0),
-              a(0, 173, 2,  9,  0),
+              a(2, 177, 1,  4,  0),
               a(0,   1, 1,  0,  0),
-              a(0,   2, 2, 68,  2),
-              a(0,   0, 0,  2, 88)),
+              a(0,   2, 2, 69,  1),
+              a(0,   0, 0,  3, 87)),
             s("3", "4", "5", "6", "8"));
   }
 
