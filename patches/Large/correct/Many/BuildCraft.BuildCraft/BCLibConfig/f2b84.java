diff --git a/common/buildcraft/lib/BCLibConfig.java b/common/buildcraft/lib/BCLibConfig.java
index bc3b267..5e583c4 100644
--- a/common/buildcraft/lib/BCLibConfig.java
+++ b/common/buildcraft/lib/BCLibConfig.java
@@ -84,19 +84,19 @@
         }
 
         public int convertTicksToGap(int ticks) {
-            return ticks / ticksInGap;
+            return ticks * ticksInGap;
         }
 
         public long convertTicksToGap(long ticks) {
-            return ticks / ticksInGap;
+            return ticks * ticksInGap;
         }
 
         public float convertTicksToGap(float ticks) {
-            return ticks / ticksInGap;
+            return ticks * ticksInGap;
         }
 
         public double convertTicksToGap(double ticks) {
-            return ticks / ticksInGap;
+            return ticks * ticksInGap;
         }
     }
 
