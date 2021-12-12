diff --git a/sonar-server/src/main/java/org/sonar/server/issue/SetSeverityAction.java b/sonar-server/src/main/java/org/sonar/server/issue/SetSeverityAction.java
index 363d963..b44fa04 100644
--- a/sonar-server/src/main/java/org/sonar/server/issue/SetSeverityAction.java
+++ b/sonar-server/src/main/java/org/sonar/server/issue/SetSeverityAction.java
@@ -50,7 +50,7 @@
 
   @Override
   public boolean execute(Map<String, Object> properties, Context context) {
-    return issueUpdater.setSeverity((DefaultIssue) context.issue(), severity(properties), context.issueChangeContext());
+    return issueUpdater.setManualSeverity((DefaultIssue) context.issue(), severity(properties), context.issueChangeContext());
   }
 
   private String severity(Map<String, Object> properties) {
