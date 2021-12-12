diff --git a/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java b/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java
index e4a1da8..25f50c0 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/LayoutImpl.java
@@ -495,7 +495,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toString();
+			return _typeSettingsProperties.toSortedString();
 		}
 	}
 
@@ -808,7 +808,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toString());
+		super.setTypeSettings(_typeSettingsProperties.toSortedString());
 	}
 
 	protected Theme getTheme(String device) throws PortalException {
