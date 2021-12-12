diff --git a/client/net/minecraftforge/client/MinecraftForgeClient.java b/client/net/minecraftforge/client/MinecraftForgeClient.java
index 21deada..31de16e 100644
--- a/client/net/minecraftforge/client/MinecraftForgeClient.java
+++ b/client/net/minecraftforge/client/MinecraftForgeClient.java
@@ -52,7 +52,7 @@
         return null;
     }
 
-    public int getRenderPass()
+    public static int getRenderPass()
     {
         return ForgeHooksClient.renderPass;
     }
