diff --git a/server/sonar-server/src/test/java/org/sonar/server/project/ws/GhostsActionTest.java b/server/sonar-server/src/test/java/org/sonar/server/project/ws/GhostsActionTest.java
index 2c4d369..7e6db7a 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/project/ws/GhostsActionTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/project/ws/GhostsActionTest.java
@@ -68,7 +68,7 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     dbSession.close();
   }
 
