diff --git a/controller/src/main/java/org/jboss/as/controller/NewModelControllerImpl.java b/controller/src/main/java/org/jboss/as/controller/NewModelControllerImpl.java
index 71b3f5f..b22e9e9 100644
--- a/controller/src/main/java/org/jboss/as/controller/NewModelControllerImpl.java
+++ b/controller/src/main/java/org/jboss/as/controller/NewModelControllerImpl.java
@@ -87,9 +87,9 @@
         NewOperationContextImpl context = new NewOperationContextImpl(this, controllerType, EnumSet.of(NewOperationContextImpl.ContextFlag.ROLLBACK_ON_FAIL), handler, modelReference.get(), control, bootingFlag.getAndSet(false));
         ModelNode response = new ModelNode();
         if (prepareStep != null) {
-            context.addStep(prepareStep, NewOperationContext.Stage.MODEL);
+            context.addStep(response, operation, prepareStep, NewOperationContext.Stage.MODEL);
         }
-        context.addStep(new NewStepHandler() {
+        context.addStep(response, operation, new NewStepHandler() {
             public void execute(final NewOperationContext context, final ModelNode operation) {
                 if (context.completeStep() == NewOperationContext.ResultAction.KEEP && context.isModelAffected()) {
                     // TODO store the model here
