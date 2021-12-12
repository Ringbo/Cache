diff --git a/src/main/java/com/sk89q/worldedit/math/transform/Transforms.java b/src/main/java/com/sk89q/worldedit/math/transform/Transforms.java
index 35f8a3d..cfb6356 100644
--- a/src/main/java/com/sk89q/worldedit/math/transform/Transforms.java
+++ b/src/main/java/com/sk89q/worldedit/math/transform/Transforms.java
@@ -43,7 +43,7 @@
     public static Location transform(Location location, Transform transform) {
         checkNotNull(location);
         checkNotNull(transform);
-        return new Location(location.getWorld(), transform.apply(location.toVector()), location.getDirection());
+        return new Location(location.getExtent(), transform.apply(location.toVector()), location.getDirection());
     }
 
 }
