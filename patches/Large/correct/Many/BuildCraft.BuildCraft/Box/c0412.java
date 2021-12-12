diff --git a/common/buildcraft/core/Box.java b/common/buildcraft/core/Box.java
index 3688d36..04d82cf 100644
--- a/common/buildcraft/core/Box.java
+++ b/common/buildcraft/core/Box.java
@@ -289,7 +289,7 @@
 	}
 
 	public Box extendToEncompass (Box toBeContained) {
-		if (!toBeContained.initialized) {
+		if (toBeContained == null || !toBeContained.initialized) {
 			return this;
 		}
 
