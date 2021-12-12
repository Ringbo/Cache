diff --git a/server/sonar-server/src/test/java/org/sonar/server/user/DoPrivilegedTest.java b/server/sonar-server/src/test/java/org/sonar/server/user/DoPrivilegedTest.java
index 1c15f02..fc30049 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/user/DoPrivilegedTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/user/DoPrivilegedTest.java
@@ -34,7 +34,7 @@
   private MockUserSession session = new MockUserSession(LOGIN);
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     threadLocalUserSession.set(session);
   }
 
