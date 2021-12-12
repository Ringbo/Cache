diff --git a/sonar-batch/src/main/java/org/sonar/batch/issue/DefaultIssueCallback.java b/sonar-batch/src/main/java/org/sonar/batch/issue/DefaultIssueCallback.java
index 05caaec..8f7342e 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/issue/DefaultIssueCallback.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/issue/DefaultIssueCallback.java
@@ -81,7 +81,7 @@
       newIssue.setMessage(issue.getMessage());
       newIssue.setNew(issue.isNew());
       newIssue.setResolution(issue.resolution());
-      newIssue.setRuleKey(issue.getRuleKey().rule());
+      newIssue.setRuleKey(issue.getRuleKey().toString());
       newIssue.setRuleName(getRuleName(issue.getRuleKey()));
       newIssue.setSeverity(issue.severity());
       newIssue.setStatus(issue.status());
