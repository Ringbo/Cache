diff --git a/modules/apps/headless-apio/forms/forms-apio-impl/src/main/java/com/liferay/forms/apio/internal/resource/FormInstanceNestedCollectionResource.java b/modules/apps/headless-apio/forms/forms-apio-impl/src/main/java/com/liferay/forms/apio/internal/resource/FormInstanceNestedCollectionResource.java
index 27b36ec..4024dc1 100644
--- a/modules/apps/headless-apio/forms/forms-apio-impl/src/main/java/com/liferay/forms/apio/internal/resource/FormInstanceNestedCollectionResource.java
+++ b/modules/apps/headless-apio/forms/forms-apio-impl/src/main/java/com/liferay/forms/apio/internal/resource/FormInstanceNestedCollectionResource.java
@@ -118,7 +118,7 @@
 			DDMFormInstance::getStructureId
 		).addNested(
 			"settings", this::_getSettings,
-			nestedBuilder -> nestedBuilder.nestedTypes(
+			nestedBuilder -> nestedBuilder.types(
 				"FormInstanceSettings"
 			).addString(
 				"emailFromAddress", DDMFormInstanceSettings::emailFromAddress
