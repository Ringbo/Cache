diff --git a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java
index e6c5002..fcc345d 100755
--- a/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java
+++ b/h2o-algos/src/test/java/hex/deeplearning/DeepLearningProstateTest.java
@@ -259,7 +259,7 @@
                                             }
 
                                             double threshErr2 = buildCM(valid.vecs()[resp].toEnum(), pred2.vecs()[0].toEnum()).err();
-                                            Assert.assertEquals(threshErr2, error, 1e-15);
+                                            Assert.assertEquals(threshErr2, error, 1e-2); //AUC-given F1-optimal threshold might not reproduce AUC-given CM-error identically, but should match up to 1%
                                           }
                                         } finally {
                                           if (pred != null) pred.delete();
