diff --git a/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/permission/MSBFragmentEntryPermission.java b/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/permission/MSBFragmentEntryPermission.java
index 234e4dd..6a14048 100644
--- a/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/permission/MSBFragmentEntryPermission.java
+++ b/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/permission/MSBFragmentEntryPermission.java
@@ -58,7 +58,7 @@
 		if (!contains(permissionChecker, msbFragmentEntry, actionId)) {
 			throw new PrincipalException.MustHavePermission(
 				permissionChecker, MSBFragmentEntry.class.getName(),
-				msbFragmentEntry.getFragmentEntryId(), actionId);
+				msbFragmentEntry.getMsbFragmentEntryId(), actionId);
 		}
 	}
 
@@ -90,7 +90,7 @@
 			permissionChecker.getPermissionChecksMap();
 
 		PermissionCacheKey permissionCacheKey = new PermissionCacheKey(
-			msbFragmentEntry.getFragmentEntryId(), actionId);
+			msbFragmentEntry.getMsbFragmentEntryId(), actionId);
 
 		Boolean contains = (Boolean)permissionChecksMap.get(permissionCacheKey);
 
