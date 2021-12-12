diff --git a/fml/client/cpw/mods/fml/client/FMLClientHandler.java b/fml/client/cpw/mods/fml/client/FMLClientHandler.java
index 6515fac..d0ed0af 100644
--- a/fml/client/cpw/mods/fml/client/FMLClientHandler.java
+++ b/fml/client/cpw/mods/fml/client/FMLClientHandler.java
@@ -239,7 +239,7 @@
     {
         if (client.field_6324_e != null) {
             // For the client world ticks and game ticks are the same
-            FMLCommonHandler.instance().tickStart(EnumSet.of(TickType.WORLD,TickType.GAME,TickType.WORLDGUI), 0.0f, client.field_6324_e, client.field_6313_p);
+            FMLCommonHandler.instance().tickStart(EnumSet.of(TickType.WORLD,TickType.GAME,TickType.WORLDGUI), 0.0f, client.field_6313_p, client.field_6324_e);
         }
     }
 
@@ -250,7 +250,7 @@
     {
         if (client.field_6324_e != null) {
             // For the client world ticks and game ticks are the same
-            FMLCommonHandler.instance().tickEnd(EnumSet.of(TickType.WORLD,TickType.GAME,TickType.WORLDGUI), 0.0f, client.field_6324_e, client.field_6313_p);
+            FMLCommonHandler.instance().tickEnd(EnumSet.of(TickType.WORLD,TickType.GAME,TickType.WORLDGUI), 0.0f, client.field_6313_p, client.field_6324_e);
         }
         for (IKeyHandler entry : keyHandlers)
         {
