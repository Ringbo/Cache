diff --git a/fml/common/cpw/mods/fml/common/LoadController.java b/fml/common/cpw/mods/fml/common/LoadController.java
index c9f1cb9..6a8d5ba 100644
--- a/fml/common/cpw/mods/fml/common/LoadController.java
+++ b/fml/common/cpw/mods/fml/common/LoadController.java
@@ -62,7 +62,7 @@
             if (isActive)
             {
                 Level level = Logger.getLogger(mod.getModId()).getLevel();
-                FMLLog.log(mod.getModId(), Level.FINE, "Mod Logging channel %s configured at %s level.", level == null ? "default" : level);
+                FMLLog.log(mod.getModId(), Level.FINE, "Mod Logging channel %s configured at %s level.", mod.getModId(), level == null ? "default" : level);
                 FMLLog.log(mod.getModId(), Level.INFO, "Activating mod %s", mod.getModId());
                 activeModList.add(mod);
                 modStates.put(mod.getModId(), ModState.UNLOADED);
