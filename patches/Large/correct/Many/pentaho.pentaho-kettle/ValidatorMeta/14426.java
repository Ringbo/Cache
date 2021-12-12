diff --git a/src/org/pentaho/di/trans/steps/validator/ValidatorMeta.java b/src/org/pentaho/di/trans/steps/validator/ValidatorMeta.java
index 35ed4bb..a8264e5 100644
--- a/src/org/pentaho/di/trans/steps/validator/ValidatorMeta.java
+++ b/src/org/pentaho/di/trans/steps/validator/ValidatorMeta.java
@@ -305,7 +305,7 @@
     
 	@Override
 	public void searchInfoAndTargetSteps(List<StepMeta> steps) {
-		for (StreamInterface stream : getStepIOMeta().getTargetStreams()) {
+		for (StreamInterface stream : getStepIOMeta().getInfoStreams()) {
 			Validation validation = (Validation) stream.getSubject();
 			StepMeta stepMeta = StepMeta.findStep(steps, validation.getSourcingStepName());
 			validation.setSourcingStep(stepMeta);
