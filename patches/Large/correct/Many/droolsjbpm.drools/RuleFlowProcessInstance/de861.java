diff --git a/drools-core/src/main/java/org/drools/ruleflow/instance/impl/RuleFlowProcessInstance.java b/drools-core/src/main/java/org/drools/ruleflow/instance/impl/RuleFlowProcessInstance.java
index 3066bbc..b8bfb38 100644
--- a/drools-core/src/main/java/org/drools/ruleflow/instance/impl/RuleFlowProcessInstance.java
+++ b/drools-core/src/main/java/org/drools/ruleflow/instance/impl/RuleFlowProcessInstance.java
@@ -128,7 +128,7 @@
 	}
 	
 	public String toString() {
-    	StringBuilder sb = new StringBuilder("RuleFlowProcessInstance");
+    	StringBuffer sb = new StringBuffer("RuleFlowProcessInstance");
     	sb.append(getId());
     	sb.append(" [processId=");
     	sb.append(getProcess().getId());
