diff --git a/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/PreconditionRules.java b/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/PreconditionRules.java
index b6f68a1..fb7a052 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/PreconditionRules.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/PreconditionRules.java
@@ -28,10 +28,10 @@
 
     public static Rule<ExchangeNode> checkRulesAreFiredBeforeAddExchangesRule()
     {
-        return checkPlanDoNotMatch(exchange(), "Expected rules to be fired before 'AddExchanges' optimizer");
+        return checkNoPlanNodeMatches(exchange(), "Expected rules to be fired before 'AddExchanges' optimizer");
     }
 
-    public static <T extends PlanNode> Rule<T> checkPlanDoNotMatch(Pattern<T> pattern, String message)
+    private static <T extends PlanNode> Rule<T> checkNoPlanNodeMatches(Pattern<T> pattern, String message)
     {
         return new CheckNoPlanNodeMatchesRule<>(pattern, message);
     }
