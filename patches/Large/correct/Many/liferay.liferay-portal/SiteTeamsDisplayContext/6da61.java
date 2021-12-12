diff --git a/modules/apps/web-experience/site/site-teams-web/src/main/java/com/liferay/site/teams/web/display/context/SiteTeamsDisplayContext.java b/modules/apps/web-experience/site/site-teams-web/src/main/java/com/liferay/site/teams/web/display/context/SiteTeamsDisplayContext.java
index 3ac57c2..80abedd 100644
--- a/modules/apps/web-experience/site/site-teams-web/src/main/java/com/liferay/site/teams/web/display/context/SiteTeamsDisplayContext.java
+++ b/modules/apps/web-experience/site/site-teams-web/src/main/java/com/liferay/site/teams/web/display/context/SiteTeamsDisplayContext.java
@@ -142,7 +142,7 @@
 			return false;
 		}
 
-		if (Validator.isNull(getKeywords())) {
+		if (Validator.isNotNull(getKeywords())) {
 			return false;
 		}
 
