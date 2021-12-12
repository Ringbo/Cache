diff --git a/server/sonar-server/src/test/java/org/sonar/server/batch/IssuesActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/batch/IssuesActionTest.java
index 746bce1..b3d9f40 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/batch/IssuesActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/batch/IssuesActionTest.java
@@ -202,7 +202,7 @@
     ComponentDto directory = db.components().insertComponent(newDirectory(project, "src/main/java"));
     addPermissionTo(project);
 
-    expectedException.expect(IllegalStateException.class);
+    expectedException.expect(IllegalArgumentException.class);
     expectedException.expectMessage("Component of scope 'DIR' is not allowed");
 
     call(directory.key());
