diff --git a/server/sonar-server/src/test/java/org/sonar/server/user/ws/GroupsActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/user/ws/GroupsActionTest.java
index a5d414e..c27e6df 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/user/ws/GroupsActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/user/ws/GroupsActionTest.java
@@ -58,7 +58,7 @@
   @Before
   public void setUp() {
     System2 system2 = new System2();
-    UserDao userDao = new UserDao(dbTester.myBatis(), system2);
+    UserDao userDao = new UserDao(system2);
     GroupDao groupDao = new GroupDao(system2);
     UserGroupDao userGroupDao = new UserGroupDao();
     GroupMembershipDao groupMembershipDao = new GroupMembershipDao();
