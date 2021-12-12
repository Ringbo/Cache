diff --git a/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRActionImpl.java b/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRActionImpl.java
index 5e50b32..936c68d 100644
--- a/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRActionImpl.java
+++ b/portal-impl/src/com/liferay/portlet/mobiledevicerules/model/impl/MDRActionImpl.java
@@ -48,7 +48,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toString());
+		super.setTypeSettings(_typeSettingsProperties.toSortedString());
 	}
 
 	private UnicodeProperties _typeSettingsProperties;
