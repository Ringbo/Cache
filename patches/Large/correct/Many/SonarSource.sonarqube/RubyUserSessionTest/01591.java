diff --git a/server/sonar-server/src/test/java/org/sonar/server/user/RubyUserSessionTest.java b/server/sonar-server/src/test/java/org/sonar/server/user/RubyUserSessionTest.java
index ac33f8d..f98256c 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/user/RubyUserSessionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/user/RubyUserSessionTest.java
@@ -47,7 +47,7 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     // clean up for next test
     threadLocalUserSession.remove();
   }
