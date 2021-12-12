diff --git a/common/buildcraft/energy/generation/OilGenerator.java b/common/buildcraft/energy/generation/OilGenerator.java
index 7f5986d..648e266 100644
--- a/common/buildcraft/energy/generation/OilGenerator.java
+++ b/common/buildcraft/energy/generation/OilGenerator.java
@@ -29,7 +29,7 @@
     INSTANCE;
 
     /** Random number, used to differentiate generators */
-    private static final long MAGIC_GEN_NUMBER = 0xD0_46_B4_E4_0C_7D_07_CFl;
+    private static final long MAGIC_GEN_NUMBER = 0xD0_46_B4_E4_0C_7D_07_CFL;
 
     /** The distance that oil generation will be checked to see if their structures overlap with the currently
      * generating chunk. This should be large enough that all oil generation can fit inside this radius. If this number
