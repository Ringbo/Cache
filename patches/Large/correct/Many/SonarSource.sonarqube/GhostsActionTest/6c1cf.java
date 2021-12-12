diff --git a/server/sonar-server/src/test/java/org/sonar/server/project/ws/GhostsActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/project/ws/GhostsActionTest.java
index 951b76a..49b8eb6 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/project/ws/GhostsActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/project/ws/GhostsActionTest.java
@@ -198,7 +198,7 @@
     ComponentDto ghostBranchProject = db.components().insertProjectBranch(ghostProject);
     userSessionRule.logIn().addPermission(ADMINISTER, organization);
 
-    TestResponse result = underTest.newRequest()
+    TestResponse result = ws.newRequest()
       .setParam("organization", organization.getKey())
       .execute();
 
