diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/ws/ActivityWsActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/ws/ActivityWsActionTest.java
index 2c5d42a..ac3374e 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/ws/ActivityWsActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/ws/ActivityWsActionTest.java
@@ -158,7 +158,7 @@
 
   @Test
   public void get_project_activity() {
-    userSession.addProjectUuidPermissions(UserRole.ADMIN, "PROJECT_1");
+    userSession.addComponentUuidPermission(UserRole.ADMIN, "PROJECT_1", "PROJECT_1");
     insert("T1", "PROJECT_1", CeActivityDto.Status.SUCCESS);
     insert("T2", "PROJECT_2", CeActivityDto.Status.FAILED);
 
