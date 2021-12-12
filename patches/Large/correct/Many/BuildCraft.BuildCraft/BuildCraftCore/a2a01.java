diff --git a/common/buildcraft/BuildCraftCore.java b/common/buildcraft/BuildCraftCore.java
index 74b99f8..c3c316e 100644
--- a/common/buildcraft/BuildCraftCore.java
+++ b/common/buildcraft/BuildCraftCore.java
@@ -537,7 +537,7 @@
 		
 		actionControl = new IActionExternal[IControllable.Mode.values().length];
 		for (IControllable.Mode mode : IControllable.Mode.values()) {
-			if (mode != IControllable.Mode.Unknown) {
+			if (mode != IControllable.Mode.Unknown && mode != IControllable.Mode.Mode) {
 				actionControl[mode.ordinal()] = new ActionMachineControl(mode);
 			}
 		}
