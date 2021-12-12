diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutSetPrototypeLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutSetPrototypeLocalServiceImpl.java
index 1215f63..5d833c9 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutSetPrototypeLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutSetPrototypeLocalServiceImpl.java
@@ -358,7 +358,7 @@
 			"customJspServletContextName",
 			settingsProperties.getProperty("customJspServletContextName"));
 
-		group.setTypeSettings(typeSettingsProperties.toString());
+		group.setTypeSettings(typeSettingsProperties.toSortedString());
 
 		groupPersistence.update(group);
 
