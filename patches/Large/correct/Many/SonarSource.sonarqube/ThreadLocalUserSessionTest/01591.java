diff --git a/server/sonar-server/src/test/java/org/sonar/server/user/ThreadLocalUserSessionTest.java b/server/sonar-server/src/test/java/org/sonar/server/user/ThreadLocalUserSessionTest.java
index 0347c0a..ec152b7 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/user/ThreadLocalUserSessionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/user/ThreadLocalUserSessionTest.java
@@ -42,7 +42,7 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     // clean up for next test
     threadLocalUserSession.remove();
   }
