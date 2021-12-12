diff --git a/src/org/pentaho/di/trans/steps/mergejoin/MergeJoinMeta.java b/src/org/pentaho/di/trans/steps/mergejoin/MergeJoinMeta.java
index 098d36a..83beda8 100644
--- a/src/org/pentaho/di/trans/steps/mergejoin/MergeJoinMeta.java
+++ b/src/org/pentaho/di/trans/steps/mergejoin/MergeJoinMeta.java
@@ -240,7 +240,7 @@
 	
 	@Override
 	public void searchInfoAndTargetSteps(List<StepMeta> steps) {
-		for (StreamInterface stream : getStepIOMeta().getTargetStreams()) {
+		for (StreamInterface stream : getStepIOMeta().getInfoStreams()) {
 			stream.setStepMeta( StepMeta.findStep(steps, (String)stream.getSubject()) );
 		}
 	}
