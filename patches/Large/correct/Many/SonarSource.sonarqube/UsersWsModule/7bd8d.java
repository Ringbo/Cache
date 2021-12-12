diff --git a/server/sonar-server/src/main/java/org/sonar/server/user/ws/UsersWsModule.java b/server/sonar-server/src/main/java/org/sonar/server/user/ws/UsersWsModule.java
index 2b8e05d..a568fb8 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/user/ws/UsersWsModule.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/user/ws/UsersWsModule.java
@@ -35,7 +35,7 @@
       SearchAction.class,
       GroupsAction.class,
       IdentityProvidersAction.class,
-      FavoritesWs.class,
+      FavouritesWs.class,
       UserPropertiesWs.class,
       UserJsonWriter.class);
   }
