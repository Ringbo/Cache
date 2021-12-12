diff --git a/client/net/minecraftforge/client/ForgeHooksClient.java b/client/net/minecraftforge/client/ForgeHooksClient.java
index 9cf3cac..ce76cef 100644
--- a/client/net/minecraftforge/client/ForgeHooksClient.java
+++ b/client/net/minecraftforge/client/ForgeHooksClient.java
@@ -298,7 +298,7 @@
 
             if(inColor)
             {
-                int color = Item.itemsList[item.itemID].func_82790_a(item, 0);
+                int color = Item.itemsList[item.itemID].getColorFromItemStack(item, 0);
                 float r = (float)(color >> 16 & 0xff) / 255F;
                 float g = (float)(color >> 8 & 0xff) / 255F;
                 float b = (float)(color & 0xff) / 255F;
@@ -319,7 +319,7 @@
 
             if (inColor)
             {
-                int color = Item.itemsList[item.itemID].func_82790_a(item, 0);
+                int color = Item.itemsList[item.itemID].getColorFromItemStack(item, 0);
                 float r = (float)(color >> 16 & 255) / 255.0F;
                 float g = (float)(color >> 8 & 255) / 255.0F;
                 float b = (float)(color & 255) / 255.0F;
