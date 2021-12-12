diff --git a/plugins/tasks/tasks-core/jira/src/com/intellij/tasks/jira/JiraRepository.java b/plugins/tasks/tasks-core/jira/src/com/intellij/tasks/jira/JiraRepository.java
index da0595c..d94e81d 100644
--- a/plugins/tasks/tasks-core/jira/src/com/intellij/tasks/jira/JiraRepository.java
+++ b/plugins/tasks/tasks-core/jira/src/com/intellij/tasks/jira/JiraRepository.java
@@ -128,7 +128,8 @@
     }
     catch (Exception e) {
       // probably JIRA version prior 4.2
-      if (method.getStatusCode() == HttpStatus.SC_NOT_FOUND) {
+      // without isRequestSent() getStatusCode() might throw NPE, if connection was refused
+      if (method.isRequestSent() && method.getStatusCode() == HttpStatus.SC_NOT_FOUND) {
         return new JiraSoapApi(this);
       }
       else {
