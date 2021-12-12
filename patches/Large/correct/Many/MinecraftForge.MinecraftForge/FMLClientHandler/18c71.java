diff --git a/fml/src/main/java/cpw/mods/fml/client/FMLClientHandler.java b/fml/src/main/java/cpw/mods/fml/client/FMLClientHandler.java
index 217ca15..cab9210 100644
--- a/fml/src/main/java/cpw/mods/fml/client/FMLClientHandler.java
+++ b/fml/src/main/java/cpw/mods/fml/client/FMLClientHandler.java
@@ -841,7 +841,7 @@
         boolean gotIt = false;
         try
         {
-            gotIt = playClientBlock.await(1,TimeUnit.SECONDS);
+            gotIt = playClientBlock.await(5,TimeUnit.SECONDS);
         } catch (InterruptedException e)
         {
         }
