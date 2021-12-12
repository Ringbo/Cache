diff --git a/src/main/java/net/minecraftforge/fluids/capability/CapabilityFluidHandler.java b/src/main/java/net/minecraftforge/fluids/capability/CapabilityFluidHandler.java
index 90e17f6..c03a95e 100644
--- a/src/main/java/net/minecraftforge/fluids/capability/CapabilityFluidHandler.java
+++ b/src/main/java/net/minecraftforge/fluids/capability/CapabilityFluidHandler.java
@@ -71,7 +71,7 @@
         @Override
 		public void readNBT(Capability<T> capability, T instance, EnumFacing side, NBTBase nbt)
 		{
-			if (!(instance instanceof IFluidTank))
+			if (!(instance instanceof FluidTank))
 				throw new RuntimeException("IFluidHandler instance is not instance of FluidTank");
 			NBTTagCompound tags = (NBTTagCompound) nbt;
 			FluidTank tank = (FluidTank) instance;
