diff --git a/modules/apps/headless-apio/forms/forms-apio-impl/src/main/java/com/liferay/forms/apio/internal/resource/StructureItemResource.java b/modules/apps/headless-apio/forms/forms-apio-impl/src/main/java/com/liferay/forms/apio/internal/resource/StructureItemResource.java
index de2d7b2..e3d967d 100644
--- a/modules/apps/headless-apio/forms/forms-apio-impl/src/main/java/com/liferay/forms/apio/internal/resource/StructureItemResource.java
+++ b/modules/apps/headless-apio/forms/forms-apio-impl/src/main/java/com/liferay/forms/apio/internal/resource/StructureItemResource.java
@@ -75,7 +75,7 @@
 			DDMStructure::getParentStructureId
 		).addNested(
 			"successPage", this::_getSuccessPage,
-			nestedBuilder -> nestedBuilder.nestedTypes(
+			nestedBuilder -> nestedBuilder.types(
 				"FormSuccessPageSettings"
 			).addBoolean(
 				"isEnabled", DDMFormSuccessPageSettings::isEnabled
