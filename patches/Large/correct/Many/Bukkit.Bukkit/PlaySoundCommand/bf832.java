diff --git a/src/main/java/org/bukkit/command/defaults/PlaySoundCommand.java b/src/main/java/org/bukkit/command/defaults/PlaySoundCommand.java
index 3dfb048..0cb5ca2 100644
--- a/src/main/java/org/bukkit/command/defaults/PlaySoundCommand.java
+++ b/src/main/java/org/bukkit/command/defaults/PlaySoundCommand.java
@@ -74,10 +74,10 @@
             final double delta = Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ) / 2.0D;
 
             if (delta > 0.0D) {
-                soundLocation.add(deltaX / delta, deltaY / delta, deltaZ / delta);
+                location.add(deltaX / delta, deltaY / delta, deltaZ / delta);
             }
 
-            player.playSound(soundLocation, soundArg, (float) minimumVolume, (float) pitch);
+            player.playSound(location, soundArg, (float) minimumVolume, (float) pitch);
         } else {
             player.playSound(soundLocation, soundArg, (float) volume, (float) pitch);
         }
