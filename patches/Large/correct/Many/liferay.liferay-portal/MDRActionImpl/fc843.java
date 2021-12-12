diff --git a/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRActionImpl.java b/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRActionImpl.java
index 936c68d..5e50b32 100644
--- a/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRActionImpl.java
+++ b/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRActionImpl.java
@@ -48,7 +48,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toSortedString());
+		super.setTypeSettings(_typeSettingsProperties.toString());
 	}
 
 	private UnicodeProperties _typeSettingsProperties;
