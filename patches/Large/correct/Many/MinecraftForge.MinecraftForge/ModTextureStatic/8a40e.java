diff --git a/fml/client/net/minecraft/src/ModTextureStatic.java b/fml/client/net/minecraft/src/ModTextureStatic.java
index 86e6958..734771e 100644
--- a/fml/client/net/minecraft/src/ModTextureStatic.java
+++ b/fml/client/net/minecraft/src/ModTextureStatic.java
@@ -32,7 +32,7 @@
     private String targetTex = null;
     private int storedSize;
     private BufferedImage overrideData = null;
-    private int needApply = 2;
+    private int needApply = 10;
 
 
     public ModTextureStatic(int icon, int target, BufferedImage image)
@@ -106,7 +106,7 @@
 
     public void update()
     {
-        needApply = 2;
+        needApply = 10;
         for (int idx = 0; idx < pixels.length; idx++)
         {
             int i = idx * 4;
