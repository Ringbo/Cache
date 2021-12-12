diff --git a/client/net/minecraftforge/client/ForgeHooksClient.java b/client/net/minecraftforge/client/ForgeHooksClient.java
index 0e2647e..80aeed0 100644
--- a/client/net/minecraftforge/client/ForgeHooksClient.java
+++ b/client/net/minecraftforge/client/ForgeHooksClient.java
@@ -254,7 +254,7 @@
             int size = entity.item.stackSize;
             int count = (size > 20 ? 4 : (size > 5 ? 3 : (size > 1 ? 2 : 1)));
 
-            for(int j = 0; j < size; j++)
+            for(int j = 0; j < count; j++)
             {
                 GL11.glPushMatrix();
                 if (j > 0)
