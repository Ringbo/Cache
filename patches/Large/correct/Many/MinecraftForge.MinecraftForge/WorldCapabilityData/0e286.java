diff --git a/src/main/java/net/minecraftforge/common/util/WorldCapabilityData.java b/src/main/java/net/minecraftforge/common/util/WorldCapabilityData.java
index d0a6716..28aafc9 100644
--- a/src/main/java/net/minecraftforge/common/util/WorldCapabilityData.java
+++ b/src/main/java/net/minecraftforge/common/util/WorldCapabilityData.java
@@ -50,7 +50,7 @@
     public void setCapabilities(WorldProvider provider, INBTSerializable<NBTTagCompound> capabilities)
     {
         this.serializable = capabilities;
-        if (this.capNBT != null)
+        if (this.capNBT != null && serializable != null)
         {
             serializable.deserializeNBT(this.capNBT);
             this.capNBT = null;
