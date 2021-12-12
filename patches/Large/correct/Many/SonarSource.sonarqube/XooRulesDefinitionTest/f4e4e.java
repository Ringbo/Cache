diff --git a/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/rule/XooRulesDefinitionTest.java b/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/rule/XooRulesDefinitionTest.java
index e298ebb..0eb766b 100644
--- a/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/rule/XooRulesDefinitionTest.java
+++ b/plugins/sonar-xoo-plugin/src/test/java/org/sonar/xoo/rule/XooRulesDefinitionTest.java
@@ -42,7 +42,7 @@
     assertThat(repo).isNotNull();
     assertThat(repo.name()).isEqualTo("Xoo");
     assertThat(repo.language()).isEqualTo("xoo");
-    assertThat(repo.rules()).hasSize(16);
+    assertThat(repo.rules()).hasSize(17);
 
     RulesDefinition.Rule rule = repo.rule(OneIssuePerLineSensor.RULE_KEY);
     assertThat(rule.name()).isNotEmpty();
