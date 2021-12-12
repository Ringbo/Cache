diff --git a/sonar-db/src/main/java/org/sonar/db/user/AuthorizationDao.java b/sonar-db/src/main/java/org/sonar/db/user/AuthorizationDao.java
index 4343e58..18f3482 100644
--- a/sonar-db/src/main/java/org/sonar/db/user/AuthorizationDao.java
+++ b/sonar-db/src/main/java/org/sonar/db/user/AuthorizationDao.java
@@ -73,7 +73,7 @@
     }
   }
 
-  private List<String> keepAuthorizedComponentKeys(final DbSession session, final String componentKey, @Nullable final Integer userId, final String role) {
+  private static List<String> keepAuthorizedComponentKeys(final DbSession session, final String componentKey, @Nullable final Integer userId, final String role) {
     if (userId == null) {
       return session.getMapper(AuthorizationMapper.class).keepAuthorizedComponentKeysForAnonymous(role, Sets.newHashSet(componentKey));
     } else {
