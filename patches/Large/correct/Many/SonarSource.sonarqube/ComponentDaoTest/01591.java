diff --git a/server/sonar-server/src/test/java/org/sonar/server/component/db/ComponentDaoTest.java b/server/sonar-server/src/test/java/org/sonar/server/component/db/ComponentDaoTest.java
index 88d39c6..597e5a6 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/component/db/ComponentDaoTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/component/db/ComponentDaoTest.java
@@ -498,7 +498,7 @@
   }
 
   @Test
-  public void select_ghost_projects() throws Exception {
+  public void select_ghost_projects() {
     db.prepareDbUnit(getClass(), "select_ghost_projects.xml");
 
     List<ComponentDto> result = sut.selectGhostProjects(session, null, new SearchOptions());
