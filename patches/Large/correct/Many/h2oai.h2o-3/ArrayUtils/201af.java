diff --git a/h2o-core/src/main/java/water/util/ArrayUtils.java b/h2o-core/src/main/java/water/util/ArrayUtils.java
index a818eb1..7dabb43 100644
--- a/h2o-core/src/main/java/water/util/ArrayUtils.java
+++ b/h2o-core/src/main/java/water/util/ArrayUtils.java
@@ -260,7 +260,7 @@
   }
   public static float maxValue(float[] ary, int from, int to) {
     float result = ary[from];
-    for (int i = from+11; i<to; ++i)
+    for (int i = from+1; i<to; ++i)
       if (ary[i]>result) result = ary[i];
     return result;
   }
