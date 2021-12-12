diff --git a/server/sonar-server/src/main/java/org/sonar/server/issue/ws/SearchResponseFormat.java b/server/sonar-server/src/main/java/org/sonar/server/issue/ws/SearchResponseFormat.java
index fdfcd8e..6c4d5b3 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/issue/ws/SearchResponseFormat.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/issue/ws/SearchResponseFormat.java
@@ -200,7 +200,7 @@
     setNullable(dto.getIssueCloseDate(), issueBuilder::setCloseDate, DateUtils::formatDateTime);
   }
 
-  private String engineNameFrom(RuleKey ruleKey) {
+  private static String engineNameFrom(RuleKey ruleKey) {
     checkState(ruleKey.repository().startsWith(EXTERNAL_RULE_REPO_PREFIX));
     return ruleKey.repository().replace(EXTERNAL_RULE_REPO_PREFIX, "");
   }
