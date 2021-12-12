diff --git a/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileProjectOperations.java b/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileProjectOperations.java
index 40ec8d6..ae809fd 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileProjectOperations.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileProjectOperations.java
@@ -55,7 +55,7 @@
     }
   }
 
-  void addProject(String profileKey, String projectUuid, UserSession userSession, DbSession session) {
+  private void addProject(String profileKey, String projectUuid, UserSession userSession, DbSession session) {
     ComponentDto project = db.componentDao().selectOrFailByUuid(session, projectUuid);
     checkPermission(userSession, project.key());
     QualityProfileDto qualityProfile = findNotNull(profileKey, session);
@@ -89,7 +89,7 @@
     }
   }
 
-  public void removeProject(String language, long projectId, UserSession userSession) {
+  void removeProject(String language, long projectId, UserSession userSession) {
     DbSession session = db.openSession(false);
     try {
       ComponentDto project = db.componentDao().selectOrFailById(session, projectId);
@@ -105,7 +105,7 @@
     }
   }
 
-  public void removeAllProjects(String profileKey, UserSession userSession) {
+  void removeAllProjects(String profileKey, UserSession userSession) {
     checkPermission(userSession);
     DbSession session = db.openSession(false);
     try {
