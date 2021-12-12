diff --git a/fml/common/cpw/mods/fml/common/LoadController.java b/fml/common/cpw/mods/fml/common/LoadController.java
index 533e247..88576d4 100644
--- a/fml/common/cpw/mods/fml/common/LoadController.java
+++ b/fml/common/cpw/mods/fml/common/LoadController.java
@@ -147,7 +147,7 @@
             {
                 builder.put(mc, mc.getMod());
             }
-            if (mc.getMod()==null)
+            if (mc.getMod()==null && !mc.isImmutable())
             {
                 FMLLog.severe("There is a severe problem with %s - it appears not to have constructed correctly", mc.getModId());
                 if (state != LoaderState.CONSTRUCTING)
