diff --git a/src/main/java/net/minecraftforge/fluids/FluidContainerRegistry.java b/src/main/java/net/minecraftforge/fluids/FluidContainerRegistry.java
index 33c47f2..552d6ee 100644
--- a/src/main/java/net/minecraftforge/fluids/FluidContainerRegistry.java
+++ b/src/main/java/net/minecraftforge/fluids/FluidContainerRegistry.java
@@ -51,7 +51,7 @@
             code = 31*code + container.getItem().hashCode();
             code = 31*code + container.getItemDamage();
             if (stack != null)
-                code = 31*code + stack.hashCode();
+                code = 31*code + stack.getFluidID();
             return code;
         }
         @Override
