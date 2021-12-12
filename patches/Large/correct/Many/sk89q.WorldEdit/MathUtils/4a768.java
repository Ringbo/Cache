diff --git a/worldedit-core/src/main/java/com/sk89q/worldedit/math/MathUtils.java b/worldedit-core/src/main/java/com/sk89q/worldedit/math/MathUtils.java
index 80f310a..743b6e5 100644
--- a/worldedit-core/src/main/java/com/sk89q/worldedit/math/MathUtils.java
+++ b/worldedit-core/src/main/java/com/sk89q/worldedit/math/MathUtils.java
@@ -78,7 +78,7 @@
 
     /**
      * Returns the sine of an angle given in degrees. This is better than just
-     * {@code Math.cos(Math.toRadians(degrees))} because it provides a more
+     * {@code Math.sin(Math.toRadians(degrees))} because it provides a more
      * accurate result for angles divisible by 90 degrees.
      *
      * @param degrees the angle
@@ -102,7 +102,7 @@
                 return -1.0;
             }
         }
-        return Math.cos(Math.toRadians(degrees));
+        return Math.sin(Math.toRadians(degrees));
     }
 
 }
