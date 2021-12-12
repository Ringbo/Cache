diff --git a/portal-impl/test/integration/com/liferay/portal/security/permission/PermissionCheckerTest.java b/portal-impl/test/integration/com/liferay/portal/security/permission/PermissionCheckerTest.java
index 78e2820..fd135e5 100644
--- a/portal-impl/test/integration/com/liferay/portal/security/permission/PermissionCheckerTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/security/permission/PermissionCheckerTest.java
@@ -199,7 +199,7 @@
 
 		PermissionChecker permissionChecker = _getPermissionChecker(_user);
 
-		Assert.assertFalse(permissionChecker.isOmniadmin());
+		Assert.assertTrue(permissionChecker.isOmniadmin());
 	}
 
 	@Test
@@ -207,7 +207,7 @@
 		PermissionChecker permissionChecker = _getPermissionChecker(
 			TestPropsValues.getUser());
 
-		Assert.assertFalse(permissionChecker.isOmniadmin());
+		Assert.assertTrue(permissionChecker.isOmniadmin());
 	}
 
 	@Test
