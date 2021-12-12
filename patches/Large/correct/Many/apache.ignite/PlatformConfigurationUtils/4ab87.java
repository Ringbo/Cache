diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/platform/utils/PlatformConfigurationUtils.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/platform/utils/PlatformConfigurationUtils.java
index 5f73f79..7fb25c8 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/platform/utils/PlatformConfigurationUtils.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/platform/utils/PlatformConfigurationUtils.java
@@ -1101,10 +1101,10 @@
 
         SwapSpaceSpi swap = cfg.getSwapSpaceSpi();
 
-        if (swap instanceof FileSwapSpaceSpiMBean) {
+        if (swap instanceof FileSwapSpaceSpi) {
             w.writeByte(SWAP_TYP_FILE);
 
-            FileSwapSpaceSpiMBean fileSwap = (FileSwapSpaceSpiMBean)swap;
+            FileSwapSpaceSpi fileSwap = (FileSwapSpaceSpi)swap;
 
             w.writeString(fileSwap.getBaseDirectory());
             w.writeFloat(fileSwap.getMaximumSparsity());
