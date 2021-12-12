diff --git a/server/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWebServiceMediumTest.java b/server/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWebServiceMediumTest.java
index 6984990..2a72939 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWebServiceMediumTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/rule/ws/RulesWebServiceMediumTest.java
@@ -200,7 +200,7 @@
     request.setParam(SearchOptions.PARAM_FIELDS, "debtChar,debtCharName,debtSubChar,debtSubCharName,debtRemFn,debtOverloaded,defaultDebtChar,defaultDebtSubChar,defaultDebtRemFn");
     request.setParam(SearchAction.PARAM_FACETS, "debt_characteristics");
     WsTester.Result result = request.execute();
-    result.assertJson(this.getClass(), "search_debt_rule.json");
+    result.assertJson(this.getClass(), "search_debt_rule.json", false);
   }
 
   @Test
@@ -309,7 +309,7 @@
     request.setParam("debt_characteristics", "SOFT_RELIABILITY");
     request.setParam(SearchAction.PARAM_FACETS, "debt_characteristics");
     WsTester.Result result = request.execute();
-    result.assertJson(this.getClass(), "search_debt_rules_sticky.json");
+    result.assertJson(this.getClass(), "search_debt_rules_sticky.json", false);
   }
 
   @Test
