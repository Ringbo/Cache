diff --git a/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java
index be16263..2e6d28a 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/OrganizationLocalServiceImpl.java
@@ -216,7 +216,7 @@
 			privateLayoutSet.setLogo(false);
 			privateLayoutSet.setLogoId(0);
 
-			layoutSetPersistence.update(publicLayoutSet, false);
+			layoutSetPersistence.update(privateLayoutSet, false);
 
 			if (imageLocalService.getImage(logoId) != null) {
 				imageLocalService.deleteImage(logoId);
