diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/listener/ListenerUtil.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/listener/ListenerUtil.java
index f4c45d9..50efe8a 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/listener/ListenerUtil.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/listener/ListenerUtil.java
@@ -106,7 +106,7 @@
     if (TransactionDependentExecutionListener.ON_TRANSACTION_RESULT_COMMITTED.equals(activitiListener.getOnTransactionResult())) {
       executionListenerContextCloseListener.addClosedExecutionListener(executionListener, execution, executionVariablesToUse, customPropertiesMapToUse);
     } else if (TransactionDependentExecutionListener.ON_TRANSACTION_RESULT_ROLLED_BACK.equals(activitiListener.getOnTransactionResult())) {
-      executionListenerContextCloseListener.addClosedExecutionListener(executionListener, execution, executionVariablesToUse, customPropertiesMapToUse);
+      executionListenerContextCloseListener.addCloseFailedExecutionListener(executionListener, execution, executionVariablesToUse, customPropertiesMapToUse);
     }
   }
 
