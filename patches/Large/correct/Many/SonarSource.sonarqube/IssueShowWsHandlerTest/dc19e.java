diff --git a/sonar-server/src/test/java/org/sonar/server/issue/ws/IssueShowWsHandlerTest.java b/sonar-server/src/test/java/org/sonar/server/issue/ws/IssueShowWsHandlerTest.java
index d058ecb..98f4aae 100644
--- a/sonar-server/src/test/java/org/sonar/server/issue/ws/IssueShowWsHandlerTest.java
+++ b/sonar-server/src/test/java/org/sonar/server/issue/ws/IssueShowWsHandlerTest.java
@@ -144,13 +144,12 @@
     Issue issue = createStandardIssue()
       .setAssignee("john")
       .setReporter("steven")
-      .setAuthorLogin("henry");
+      .setAuthorLogin("Henry");
     issues.add(issue);
 
     result.addUsers(Lists.<User>newArrayList(
       new DefaultUser().setLogin("john").setName("John"),
-      new DefaultUser().setLogin("steven").setName("Steven"),
-      new DefaultUser().setLogin("henry").setName("Henry")
+      new DefaultUser().setLogin("steven").setName("Steven")
     ));
 
     MockUserSession.set();
