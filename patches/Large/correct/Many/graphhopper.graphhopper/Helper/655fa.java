diff --git a/core/src/main/java/com/graphhopper/util/Helper.java b/core/src/main/java/com/graphhopper/util/Helper.java
index b47030c..13a6083 100644
--- a/core/src/main/java/com/graphhopper/util/Helper.java
+++ b/core/src/main/java/com/graphhopper/util/Helper.java
@@ -494,6 +494,6 @@
 
     public static final double round2( double value )
     {
-        return Math.round(value * 100) / 100;
+        return Math.round(value * 100) / 100d;
     }
 }
