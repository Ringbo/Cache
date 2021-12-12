diff --git a/core/src/main/java/com/graphhopper/routing/util/MotorcycleFlagEncoder.java b/core/src/main/java/com/graphhopper/routing/util/MotorcycleFlagEncoder.java
index 3d16694..99cbc46 100644
--- a/core/src/main/java/com/graphhopper/routing/util/MotorcycleFlagEncoder.java
+++ b/core/src/main/java/com/graphhopper/routing/util/MotorcycleFlagEncoder.java
@@ -128,7 +128,7 @@
         shift += reverseSpeedEncoder.getBits();
 
         priorityWayEncoder = new EncodedValue("PreferWay", shift, 3, 1, 3, 7);
-        shift += reverseSpeedEncoder.getBits();
+        shift += priorityWayEncoder.getBits();
 
         return shift;
     }
