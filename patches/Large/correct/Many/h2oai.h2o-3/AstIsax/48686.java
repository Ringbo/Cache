diff --git a/h2o-core/src/main/java/water/rapids/ast/prims/timeseries/AstIsax.java b/h2o-core/src/main/java/water/rapids/ast/prims/timeseries/AstIsax.java
index bc466fd..a4eb35b 100644
--- a/h2o-core/src/main/java/water/rapids/ast/prims/timeseries/AstIsax.java
+++ b/h2o-core/src/main/java/water/rapids/ast/prims/timeseries/AstIsax.java
@@ -114,7 +114,7 @@
             return new ValFrame(fr3);
         }
         for(int i = 0; i < numWords; ++i){
-            maxCards[i] = numWords;
+            maxCards[i] = maxCardinality;
         }
         Frame fr3 = new AstIsax.IsaxStringTask(maxCards).doAll(1, Vec.T_STR, fr2)
                 .outputFrame(null, new String[]{"iSax_index"}, null);
