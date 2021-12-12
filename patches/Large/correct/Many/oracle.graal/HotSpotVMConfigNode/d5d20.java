diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/HotSpotVMConfigNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/HotSpotVMConfigNode.java
index 5da2f8f..1e2c799 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/HotSpotVMConfigNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/HotSpotVMConfigNode.java
@@ -152,7 +152,7 @@
             } else if (markId == crcTableAddressMark(config)) {
                 return ConstantNode.forLong(config.crcTableAddress);
             } else if (markId == logOfHeapRegionGrainBytesMark(config)) {
-                return ConstantNode.forLong(config.logOfHRGrainBytes);
+                return ConstantNode.forInt(config.logOfHRGrainBytes);
             } else if (markId == inlineContiguousAllocationSupportedMark(config)) {
                 return ConstantNode.forBoolean(config.inlineContiguousAllocationSupported);
             } else {
