diff --git a/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java b/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java
index 25f50c0..e4a1da8 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java
@@ -495,7 +495,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toSortedString();
+			return _typeSettingsProperties.toString();
 		}
 	}
 
@@ -808,7 +808,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toSortedString());
+		super.setTypeSettings(_typeSettingsProperties.toString());
 	}
 
 	protected Theme getTheme(String device) throws PortalException {
