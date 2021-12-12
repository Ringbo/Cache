diff --git a/portal-kernel/src/com/liferay/social/kernel/util/SocialActivityDescriptor.java b/portal-kernel/src/com/liferay/social/kernel/util/SocialActivityDescriptor.java
index b394f11..ce9a934 100644
--- a/portal-kernel/src/com/liferay/social/kernel/util/SocialActivityDescriptor.java
+++ b/portal-kernel/src/com/liferay/social/kernel/util/SocialActivityDescriptor.java
@@ -48,7 +48,7 @@
 
 		if (_activity != null) {
 			return SocialActivityInterpreterLocalServiceUtil.interpret(
-				selector, _activitySet, serviceContext);
+				selector, _activity, serviceContext);
 		}
 
 		return SocialActivityInterpreterLocalServiceUtil.interpret(
