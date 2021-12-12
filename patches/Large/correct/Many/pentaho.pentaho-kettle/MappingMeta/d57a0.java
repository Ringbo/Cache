diff --git a/src/org/pentaho/di/trans/steps/mapping/MappingMeta.java b/src/org/pentaho/di/trans/steps/mapping/MappingMeta.java
index 05b28b0..527833a 100644
--- a/src/org/pentaho/di/trans/steps/mapping/MappingMeta.java
+++ b/src/org/pentaho/di/trans/steps/mapping/MappingMeta.java
@@ -164,7 +164,7 @@
 				Node outputConnector = XMLHandler.getSubNodeByNr(outputNode, "connector", i); //$NON-NLS-1$
 				String outputField = XMLHandler.getTagValue(outputConnector, "field"); //$NON-NLS-1$
 				String outputMapping = XMLHandler.getTagValue(outputConnector, "mapping"); //$NON-NLS-1$
-				outputMappingDefinition.getValueRenames().add( new MappingValueRename(outputField, outputMapping) );
+				outputMappingDefinition.getValueRenames().add( new MappingValueRename(outputMapping, outputField) );
 			}
 	        
 	        // Don't forget to add these to the input and output mapping definitions...
