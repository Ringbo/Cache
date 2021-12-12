diff --git a/common/buildcraft/factory/PumpDimensionList.java b/common/buildcraft/factory/PumpDimensionList.java
index ac27005..3863f23 100644
--- a/common/buildcraft/factory/PumpDimensionList.java
+++ b/common/buildcraft/factory/PumpDimensionList.java
@@ -51,7 +51,7 @@
 				e.dimID = Integer.parseInt(dimIDString);
 			}
 
-			e.fluidName = entryString.substring(i + 1).toLowerCase(Locale.ENGLISH);
+			e.fluidName = secondString.substring(i + 1).toLowerCase(Locale.ENGLISH);
 
 			if (e.fluidName.equals("*")) {
 				e.matchAnyFluid = true;
