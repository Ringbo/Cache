diff --git a/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/runtime/TaskInvolvementTest.java b/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/runtime/TaskInvolvementTest.java
index 4de3611..f71b5a3 100644
--- a/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/runtime/TaskInvolvementTest.java
+++ b/modules/activiti-engine/src/test/java/org/activiti/engine/test/api/runtime/TaskInvolvementTest.java
@@ -26,7 +26,7 @@
             assertEquals(1, taskService.createTaskQuery()
                     .or()
                     .taskInvolvedUser("involvedUser")
-                    .taskInvolvedGroups(groups)
+                    .taskInvolvedGroupsIn(groups)
                     .endOr()
                     .count());
 
