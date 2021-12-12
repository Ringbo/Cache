diff --git a/controller/src/main/java/org/jboss/as/controller/NewModelControllerImpl.java b/controller/src/main/java/org/jboss/as/controller/NewModelControllerImpl.java
index b2d02c7..8208889 100644
--- a/controller/src/main/java/org/jboss/as/controller/NewModelControllerImpl.java
+++ b/controller/src/main/java/org/jboss/as/controller/NewModelControllerImpl.java
@@ -98,7 +98,7 @@
 
     public ModelNode execute(final ModelNode operation, final OperationMessageHandler handler, final OperationTransactionControl control, final OperationAttachments attachments) {
         final ModelNode headers = operation.has(OPERATION_HEADERS) ? operation.get(OPERATION_HEADERS) : null;
-        final boolean rollbackOnFailure = headers == null || !headers.hasDefined(ROLLBACK_ON_RUNTIME_FAILURE) || operation.get(ROLLBACK_ON_RUNTIME_FAILURE).asBoolean();
+        final boolean rollbackOnFailure = headers == null || !headers.hasDefined(ROLLBACK_ON_RUNTIME_FAILURE) || headers.get(ROLLBACK_ON_RUNTIME_FAILURE).asBoolean();
         final EnumSet<NewOperationContextImpl.ContextFlag> contextFlags = rollbackOnFailure ? EnumSet.of(NewOperationContextImpl.ContextFlag.ROLLBACK_ON_FAIL) : EnumSet.noneOf(NewOperationContextImpl.ContextFlag.class);
         NewOperationContextImpl context = new NewOperationContextImpl(this, controllerType, contextFlags, handler, attachments, modelReference.get(), control, processState, bootingFlag.get());
         ModelNode response = new ModelNode();
