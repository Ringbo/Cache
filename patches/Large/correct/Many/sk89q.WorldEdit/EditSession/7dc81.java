diff --git a/src/main/java/com/sk89q/worldedit/EditSession.java b/src/main/java/com/sk89q/worldedit/EditSession.java
index 69302e1..9ee6341 100644
--- a/src/main/java/com/sk89q/worldedit/EditSession.java
+++ b/src/main/java/com/sk89q/worldedit/EditSession.java
@@ -1170,8 +1170,7 @@
         BlockReplace replace = new BlockReplace(this, Patterns.wrap(pattern));
         RegionOffset offset = new RegionOffset(new Vector(0, 1, 0), replace);
         GroundFunction ground = new GroundFunction(this, offset);
-        LayerVisitor visitor = new LayerVisitor(
-                this, asFlatRegion(region), minimumBlockY(region), maximumBlockY(region), ground);
+        LayerVisitor visitor = new LayerVisitor(asFlatRegion(region), minimumBlockY(region), maximumBlockY(region), ground);
         OperationHelper.completeLegacy(visitor);
         return ground.getAffected();
     }
@@ -1189,8 +1188,7 @@
 
         Naturalizer naturalizer = new Naturalizer(this);
         FlatRegion flatRegion = Regions.asFlatRegion(region);
-        LayerVisitor visitor = new LayerVisitor(
-                this, flatRegion, minimumBlockY(region), maximumBlockY(region), naturalizer);
+        LayerVisitor visitor = new LayerVisitor(flatRegion, minimumBlockY(region), maximumBlockY(region), naturalizer);
         OperationHelper.completeLegacy(visitor);
         return naturalizer.getAffected();
     }
@@ -1935,8 +1933,7 @@
         double density = 0.02;
 
         GroundFunction ground = new GroundFunction(this, generator);
-        LayerVisitor visitor = new LayerVisitor(
-                this, region, minimumBlockY(region), maximumBlockY(region), ground);
+        LayerVisitor visitor = new LayerVisitor(region, minimumBlockY(region), maximumBlockY(region), ground);
         visitor.setMask(new NoiseFilter2D(new RandomNoise(), density));
         OperationHelper.completeLegacy(visitor);
         return ground.getAffected();
