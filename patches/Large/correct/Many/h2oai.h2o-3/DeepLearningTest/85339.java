diff --git a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningTest.java b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningTest.java
index eeb08ef..2c3f7e7 100755
--- a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningTest.java
+++ b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningTest.java
@@ -232,7 +232,7 @@
           }
         },
         100,
-        ard(ard(188, 39),
+        ard(ard(189, 38),
             ard(30, 123)),
         s("0", "1"),
         DeepLearningParameters.Activation.Maxout);
@@ -266,7 +266,7 @@
               }
             },
             1,
-            46.26961741541022,
+            46.26952683659,
             DeepLearningParameters.Activation.Rectifier);
 
   }
@@ -282,7 +282,7 @@
           }
         },
         1,
-            43.45703932447497,
+        43.457087913127,
         DeepLearningParameters.Activation.Tanh);
 
   }
@@ -298,7 +298,7 @@
           }
         },
         100,
-            32.80397240113137,
+        32.81408434266,
         DeepLearningParameters.Activation.Maxout);
 
   }
@@ -314,7 +314,7 @@
           }
         },
         5,
-            41.849938471234594,
+        41.8498354737908,
         DeepLearningParameters.Activation.Rectifier);
 
   }
@@ -330,7 +330,7 @@
               }
             },
             50,
-            37.930232892825686,
+            37.93380250522667,
             DeepLearningParameters.Activation.Rectifier);
 
   }
@@ -359,7 +359,7 @@
               }
             },
             10,
-            9.298463401470183E-6,
+            4.975570190016591E-6,
             DeepLearningParameters.Activation.Rectifier);
   }
 
@@ -662,10 +662,10 @@
 
       pred = dl.score(parms.train());
       hex.ModelMetricsBinomial mm = hex.ModelMetricsBinomial.getFromDKV(dl, parms.train());
-      assertEquals(0.7222222222222222, mm.auc_obj()._auc, 1e-8);
+      assertEquals(0.7592592592592592, mm.auc_obj()._auc, 1e-8);
 
       double mse = dl._output._training_metrics.mse();
-      assertEquals(0.3169947529691508, mse, 1e-8);
+      assertEquals(0.314813341867078, mse, 1e-8);
 
       assertTrue(dl.testJavaScoring(tfr, fr2 = dl.score(tfr), 1e-5));
       dl.delete();
@@ -702,10 +702,10 @@
 
       pred = dl.score(parms.train());
       hex.ModelMetricsBinomial mm = hex.ModelMetricsBinomial.getFromDKV(dl, parms.train());
-      assertEquals(0.7222222222222222, mm.auc_obj()._auc, 1e-8);
+      assertEquals(0.7592592592592592, mm.auc_obj()._auc, 1e-8);
 
       double mse = dl._output._training_metrics.mse();
-      assertEquals(0.3169947529691508, mse, 1e-8); //Note: better results than non-shuffled
+      assertEquals(0.3148133418670781, mse, 1e-8); //Note: better results than non-shuffled
 
 //      assertTrue(dl.testJavaScoring(tfr, fr2=dl.score(tfr, 1e-5)); //PUBDEV-1900
       dl.delete();
@@ -744,7 +744,7 @@
       assertEquals(0.7222222222222222, mm.auc_obj()._auc, 1e-8);
 
       double mse = dl._output._training_metrics.mse();
-      assertEquals(0.3171486183300009, mse, 1e-8);
+      assertEquals(0.31643071339946, mse, 1e-8);
 
       assertTrue(dl.testJavaScoring(tfr, fr2 = dl.score(tfr), 1e-5));
       dl.delete();
@@ -784,7 +784,7 @@
       assertEquals(0.7592592592592592, mm.auc_obj()._auc, 1e-8);
 
       double mse = dl._output._training_metrics.mse();
-      assertEquals(0.31070661329904065, mse, 1e-8);
+      assertEquals(0.3116490253190556, mse, 1e-8);
 
 //      Assert.assertTrue(dl.testJavaScoring(tfr,fr2=dl.score(tfr),1e-5)); //PUBDEV-1900
       dl.delete();
