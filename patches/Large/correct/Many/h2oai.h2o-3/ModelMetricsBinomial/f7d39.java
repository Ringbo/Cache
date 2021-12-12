diff --git a/h2o-core/src/main/java/hex/ModelMetricsBinomial.java b/h2o-core/src/main/java/hex/ModelMetricsBinomial.java
index b30bc15..5fbf7f0 100755
--- a/h2o-core/src/main/java/hex/ModelMetricsBinomial.java
+++ b/h2o-core/src/main/java/hex/ModelMetricsBinomial.java
@@ -78,7 +78,7 @@
       }
     }
     public String toString(){
-      return "auc = " + MathUtils.roundToNDigits(auc(),3) + ", logloss = " + _logloss / _count;
+      return "auc = " + MathUtils.roundToNDigits(auc(),3) + ", logloss = " + _logloss / _wsum;
     }
   }
 }
