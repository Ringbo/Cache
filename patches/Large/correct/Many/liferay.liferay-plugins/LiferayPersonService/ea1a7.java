diff --git a/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/service/LiferayPersonService.java b/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/service/LiferayPersonService.java
index 71c951f..ff83ff1 100644
--- a/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/service/LiferayPersonService.java
+++ b/portlets/opensocial-portlet/docroot/WEB-INF/src/com/liferay/opensocial/shindig/service/LiferayPersonService.java
@@ -337,7 +337,9 @@
 		}
 
 		if (fields.contains(Person.Field.UTC_OFFSET.toString())) {
-			person.setUtcOffset(Long.valueOf(user.getTimeZone().getOffset()));
+			person.setUtcOffset(
+				Long.valueOf(
+					user.getTimeZone().getOffset(System.currentTimeMillis())));
 		}
 
 		if (securityToken.getOwnerId().equals(person.getId())) {
