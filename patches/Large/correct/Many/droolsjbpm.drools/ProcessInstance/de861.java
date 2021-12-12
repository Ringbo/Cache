diff --git a/drools-core/src/main/java/org/drools/ruleflow/common/instance/impl/ProcessInstance.java b/drools-core/src/main/java/org/drools/ruleflow/common/instance/impl/ProcessInstance.java
index 6eb6ce8..dd7b5fd 100644
--- a/drools-core/src/main/java/org/drools/ruleflow/common/instance/impl/ProcessInstance.java
+++ b/drools-core/src/main/java/org/drools/ruleflow/common/instance/impl/ProcessInstance.java
@@ -54,7 +54,7 @@
     }
     
     public String toString() {
-    	StringBuilder b = new StringBuilder("ProcessInstance ");
+    	StringBuffer b = new StringBuffer("ProcessInstance ");
     	b.append(getId());
     	b.append(" [processId=");
     	b.append(process.getId());
