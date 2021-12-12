diff --git a/modules/activiti-rest/src/main/java/org/activiti/rest/api/task/TaskBasedResource.java b/modules/activiti-rest/src/main/java/org/activiti/rest/api/task/TaskBasedResource.java
index 3d5b9fb..ce5aa19 100644
--- a/modules/activiti-rest/src/main/java/org/activiti/rest/api/task/TaskBasedResource.java
+++ b/modules/activiti-rest/src/main/java/org/activiti/rest/api/task/TaskBasedResource.java
@@ -173,13 +173,13 @@
       taskQuery.taskDefinitionKey(request.getTaskDefinitionKey());
     }
     taskQuery.taskDefinitionKeyLike(request.getTaskDefinitionKeyLike());
-    if(request.getTaskDefinitionKey() != null) {
+    if(request.getDueDate() != null) {
       taskQuery.dueDate(request.getDueDate());
     }
-    if(request.getTaskDefinitionKey() != null) {
+    if(request.getDueBefore() != null) {
       taskQuery.dueBefore(request.getDueBefore());
     }
-    if(request.getTaskDefinitionKey() != null) {
+    if(request.getDueAfter() != null) {
       taskQuery.dueAfter(request.getDueAfter());
     }
     
