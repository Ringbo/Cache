diff --git a/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/permission/MSBFragmentCollectionPermission.java b/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/permission/MSBFragmentCollectionPermission.java
index 91a704f..de8bfe5 100644
--- a/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/permission/MSBFragmentCollectionPermission.java
+++ b/modules/apps/web-experience/modern-site-building/modern-site-building-fragment-service/src/main/java/com/liferay/modern/site/building/fragment/service/permission/MSBFragmentCollectionPermission.java
@@ -59,7 +59,7 @@
 		if (!contains(permissionChecker, msbFragmentCollection, actionId)) {
 			throw new PrincipalException.MustHavePermission(
 				permissionChecker, MSBFragmentCollection.class.getName(),
-				msbFragmentCollection.getFragmentCollectionId(), actionId);
+				msbFragmentCollection.getMsbFragmentCollectionId(), actionId);
 		}
 	}
 
@@ -91,7 +91,7 @@
 			permissionChecker.getPermissionChecksMap();
 
 		PermissionCacheKey permissionCacheKey = new PermissionCacheKey(
-			msbFragmentCollection.getFragmentCollectionId(), actionId);
+			msbFragmentCollection.getMsbFragmentCollectionId(), actionId);
 
 		Boolean contains = (Boolean)permissionChecksMap.get(permissionCacheKey);
 
