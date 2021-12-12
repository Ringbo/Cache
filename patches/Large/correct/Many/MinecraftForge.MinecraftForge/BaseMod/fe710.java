diff --git a/fml/client/net/minecraft/src/BaseMod.java b/fml/client/net/minecraft/src/BaseMod.java
index b4f4dd3..09641e9 100644
--- a/fml/client/net/minecraft/src/BaseMod.java
+++ b/fml/client/net/minecraft/src/BaseMod.java
@@ -38,9 +38,9 @@
     {
         Minecraft mc = (Minecraft) minecraftInstance;
         // World and render ticks
-        if ((tickEnd && tick==TickType.WORLD) || (!tickEnd && tick==TickType.RENDER)) {
+        if ((tickEnd && tick==TickType.WORLD) || (tickEnd && tick==TickType.RENDER)) {
             return onTickInGame((Float) data[0], mc);
-        } else if (((tickEnd && tick==TickType.WORLDGUI) || (!tickEnd && tick==TickType.GUI))) {
+        } else if (((tickEnd && tick==TickType.WORLDGUI) || (tickEnd && tick==TickType.GUI))) {
             return onTickInGUI((Float) data[0], mc, (GuiScreen)data[1]);
         }
         return true;
