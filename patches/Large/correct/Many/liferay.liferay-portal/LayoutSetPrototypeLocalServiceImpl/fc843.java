diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutSetPrototypeLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutSetPrototypeLocalServiceImpl.java
index 5d833c9..1215f63 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutSetPrototypeLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutSetPrototypeLocalServiceImpl.java
@@ -358,7 +358,7 @@
 			"customJspServletContextName",
 			settingsProperties.getProperty("customJspServletContextName"));
 
-		group.setTypeSettings(typeSettingsProperties.toSortedString());
+		group.setTypeSettings(typeSettingsProperties.toString());
 
 		groupPersistence.update(group);
 
