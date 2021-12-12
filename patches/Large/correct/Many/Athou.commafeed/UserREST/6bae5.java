diff --git a/src/main/java/com/commafeed/frontend/rest/resources/UserREST.java b/src/main/java/com/commafeed/frontend/rest/resources/UserREST.java
index 394b0fb..f1629aa 100644
--- a/src/main/java/com/commafeed/frontend/rest/resources/UserREST.java
+++ b/src/main/java/com/commafeed/frontend/rest/resources/UserREST.java
@@ -117,7 +117,7 @@
 		s.setSocialButtons(settings.isSocialButtons());
 		s.setLanguage(settings.getLanguage());
 		userSettingsDAO.saveOrUpdate(s);
-		return Response.ok(Status.OK).build();
+		return Response.ok().build();
 
 	}
 
