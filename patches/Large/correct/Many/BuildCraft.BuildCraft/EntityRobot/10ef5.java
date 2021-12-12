diff --git a/common/buildcraft/core/EntityRobot.java b/common/buildcraft/core/EntityRobot.java
index 78cf846..855e01c 100644
--- a/common/buildcraft/core/EntityRobot.java
+++ b/common/buildcraft/core/EntityRobot.java
@@ -207,7 +207,7 @@
 			if (a.slot != null) {
 
 				BptSlot target = a.slot;
-				if (wait <= 0) {
+				if (wait <= 0 && BlockUtil.canChangeBlock(worldObj, target.x, target.y, target.z)) {
 
 					if (!CoreProxy.proxy.isRenderWorld(worldObj)) {
 
