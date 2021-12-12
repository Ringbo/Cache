diff --git a/src/org/pentaho/di/trans/steps/mappinginput/MappingInputMeta.java b/src/org/pentaho/di/trans/steps/mappinginput/MappingInputMeta.java
index 6cb581d..163b3dc 100644
--- a/src/org/pentaho/di/trans/steps/mappinginput/MappingInputMeta.java
+++ b/src/org/pentaho/di/trans/steps/mappinginput/MappingInputMeta.java
@@ -251,7 +251,7 @@
     	// From the viewpoint of the transformation that executes the mapping, it's important to know what comes out at the exit points.
     	// For that reason we need to re-order etc, based on the input specification...
     	//
-    	if (inputRowMeta!=null) {
+    	if (inputRowMeta!=null && !inputRowMeta.isEmpty()) {
     		// this gets set only in the parent transformation...
     		// It includes all the renames that needed to be done
     		// 
