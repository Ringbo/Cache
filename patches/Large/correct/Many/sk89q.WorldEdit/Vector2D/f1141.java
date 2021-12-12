diff --git a/src/main/java/com/sk89q/worldedit/Vector2D.java b/src/main/java/com/sk89q/worldedit/Vector2D.java
index c2c69bc..099c24d 100644
--- a/src/main/java/com/sk89q/worldedit/Vector2D.java
+++ b/src/main/java/com/sk89q/worldedit/Vector2D.java
@@ -165,7 +165,7 @@
         if (!(obj instanceof Vector2D)) {
             return false;
         }
-        Vector other = (Vector) obj;
+        Vector2D other = (Vector2D) obj;
         return other.x == this.x && other.z == this.z;
 
     }
