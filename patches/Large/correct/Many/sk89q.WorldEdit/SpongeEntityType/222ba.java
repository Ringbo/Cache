diff --git a/worldedit-sponge/src/main/java/com/sk89q/worldedit/sponge/SpongeEntityType.java b/worldedit-sponge/src/main/java/com/sk89q/worldedit/sponge/SpongeEntityType.java
index afd2393..d3d73cf 100644
--- a/worldedit-sponge/src/main/java/com/sk89q/worldedit/sponge/SpongeEntityType.java
+++ b/worldedit-sponge/src/main/java/com/sk89q/worldedit/sponge/SpongeEntityType.java
@@ -132,7 +132,7 @@
 
     @Override
     public boolean isTagged() {
-        return entity.get(Keys.DISPLAY_NAME).orElse(Text.EMPTY).isEmpty();
+        return !entity.get(Keys.DISPLAY_NAME).orElse(Text.EMPTY).isEmpty();
    }
 
     @Override
