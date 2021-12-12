diff --git a/src/be/ibridge/kettle/core/Const.java b/src/be/ibridge/kettle/core/Const.java
index 87e53b7..6c9e905 100644
--- a/src/be/ibridge/kettle/core/Const.java
+++ b/src/be/ibridge/kettle/core/Const.java
@@ -472,11 +472,11 @@
      * @return The rounded floating point value
      */
     
-    public static final float round(double f, int places) 
+    public static final double round(double f, int places) 
     { 
         java.math.BigDecimal bdtemp = new java.math.BigDecimal(f); 
         bdtemp = bdtemp.setScale(places, java.math.BigDecimal.ROUND_HALF_EVEN); 
-        return bdtemp.floatValue(); 
+        return bdtemp.doubleValue(); 
     } 
     
     /* OLD code: caused a lot of problems with very small and very large numbers.
