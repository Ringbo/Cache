diff --git a/bundles/model/org.openhab.model.rule/src/org/openhab/model/rule/internal/engine/RuleEngine.java b/bundles/model/org.openhab.model.rule/src/org/openhab/model/rule/internal/engine/RuleEngine.java
index 42d5874..dec4d1b 100644
--- a/bundles/model/org.openhab.model.rule/src/org/openhab/model/rule/internal/engine/RuleEngine.java
+++ b/bundles/model/org.openhab.model.rule/src/org/openhab/model/rule/internal/engine/RuleEngine.java
@@ -190,7 +190,7 @@
 			
 			// and now the rules, which only want to see state changes
 			if(triggerManager!=null) {
-				Iterable<Rule> rules = triggerManager.getRules(CHANGE, item, newState, oldState);
+				Iterable<Rule> rules = triggerManager.getRules(CHANGE, item, oldState, newState);
 				RuleEvaluationContext context = new RuleEvaluationContext();
 				context.newValue(QualifiedName.create(RuleContextHelper.VAR_PREVIOUS_STATE), oldState);
 				executeRules(rules, context);
