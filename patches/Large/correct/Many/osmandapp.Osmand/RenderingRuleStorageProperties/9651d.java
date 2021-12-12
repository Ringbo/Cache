diff --git a/DataExtractionOSM/src/net/osmand/render/RenderingRuleStorageProperties.java b/DataExtractionOSM/src/net/osmand/render/RenderingRuleStorageProperties.java
index 449f4aa..7428333 100644
--- a/DataExtractionOSM/src/net/osmand/render/RenderingRuleStorageProperties.java
+++ b/DataExtractionOSM/src/net/osmand/render/RenderingRuleStorageProperties.java
@@ -141,7 +141,7 @@
 		
 		// order - no sense to make it float
 		R_ORDER = registerRuleInternal(RenderingRuleProperty.createOutputIntProperty(ORDER));
-		R_OBJECT_TYPE = registerRuleInternal(RenderingRuleProperty.createInputIntProperty(OBJECT_TYPE));
+		R_OBJECT_TYPE = registerRuleInternal(RenderingRuleProperty.createOutputIntProperty(OBJECT_TYPE));
 		R_SHADOW_LEVEL = registerRuleInternal(RenderingRuleProperty.createOutputIntProperty(SHADOW_LEVEL));
 
 		// text properties
