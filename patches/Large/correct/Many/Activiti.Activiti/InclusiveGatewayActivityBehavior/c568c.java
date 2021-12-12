diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/behavior/InclusiveGatewayActivityBehavior.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/behavior/InclusiveGatewayActivityBehavior.java
index 9423166..a25f7b0 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/behavior/InclusiveGatewayActivityBehavior.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/behavior/InclusiveGatewayActivityBehavior.java
@@ -143,7 +143,7 @@
      // if source has no outputs, it is the end of the process, and its parent process should be checked.	  
 	if (srcActivity.getOutgoingTransitions().size() == 0) {
 		visitedActivities.add(srcActivity);
-		if (srcActivity.getParent() == null)
+		if (srcActivity.getParent() == null || !(srcActivity.getParent() instanceof PvmActivity) )
 			return false;
 		srcActivity = (PvmActivity) srcActivity.getParent();
 	}
