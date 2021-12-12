diff --git a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/behavior/BusinessRuleTaskActivityBehavior.java b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/behavior/BusinessRuleTaskActivityBehavior.java
index d5a578d..9b97c44 100644
--- a/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/behavior/BusinessRuleTaskActivityBehavior.java
+++ b/modules/activiti-engine/src/main/java/org/activiti/engine/impl/bpmn/behavior/BusinessRuleTaskActivityBehavior.java
@@ -63,7 +63,7 @@
         Expression ruleName = itRuleNames.next();
         filter.addSuffic(ruleName.getValue(execution).toString());
       }
-      filter.setAccept(exclude);
+      filter.setAccept(!exclude);
       ksession.fireAllRules(filter);
       
     } else {
