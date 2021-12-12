diff --git a/src/org/pentaho/di/trans/steps/mergerows/MergeRowsMeta.java b/src/org/pentaho/di/trans/steps/mergerows/MergeRowsMeta.java
index 494fecf..73f083d 100644
--- a/src/org/pentaho/di/trans/steps/mergerows/MergeRowsMeta.java
+++ b/src/org/pentaho/di/trans/steps/mergerows/MergeRowsMeta.java
@@ -243,7 +243,7 @@
 
 	@Override
 	public void searchInfoAndTargetSteps(List<StepMeta> steps) {
-		for (StreamInterface stream : getStepIOMeta().getTargetStreams()) {
+		for (StreamInterface stream : getStepIOMeta().getInfoStreams()) {
 			stream.setStepMeta( StepMeta.findStep(steps, (String)stream.getSubject()) );
 		}
 	}
