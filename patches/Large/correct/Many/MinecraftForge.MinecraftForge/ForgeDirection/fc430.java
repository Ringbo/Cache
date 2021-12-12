diff --git a/common/net/minecraftforge/common/ForgeDirection.java b/common/net/minecraftforge/common/ForgeDirection.java
index 3a2219a..16516bb 100644
--- a/common/net/minecraftforge/common/ForgeDirection.java
+++ b/common/net/minecraftforge/common/ForgeDirection.java
@@ -40,7 +40,7 @@
     
     public static ForgeDirection getOrientation(int id)
     {
-        if (id < ForgeDirection.values().length)
+        if (id > 0 && id < ForgeDirection.values().length)
         {
             return ForgeDirection.values()[id];
         }
