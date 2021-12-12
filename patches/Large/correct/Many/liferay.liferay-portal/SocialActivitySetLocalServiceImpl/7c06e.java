diff --git a/portal-impl/src/com/liferay/portlet/social/service/impl/SocialActivitySetLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/social/service/impl/SocialActivitySetLocalServiceImpl.java
index ecd334b..7434c07 100644
--- a/portal-impl/src/com/liferay/portlet/social/service/impl/SocialActivitySetLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/social/service/impl/SocialActivitySetLocalServiceImpl.java
@@ -143,13 +143,13 @@
 	public int getRelationActivitySetsCount(long userId)
 		throws SystemException {
 
-		return socialActivityFinder.countByRelation(userId);
+		return socialActivitySetFinder.countByRelation(userId);
 	}
 
 	public int getRelationActivitySetsCount(long userId, int type)
 		throws SystemException {
 
-		return socialActivityFinder.countByRelationType(userId, type);
+		return socialActivitySetFinder.countByRelationType(userId, type);
 	}
 
 	public SocialActivitySet getUserActivitySet(
