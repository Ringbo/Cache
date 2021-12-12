diff --git a/portal-impl/src/com/liferay/portal/model/impl/LayoutRevisionImpl.java b/portal-impl/src/com/liferay/portal/model/impl/LayoutRevisionImpl.java
index d123083..abfb66c 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/LayoutRevisionImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/LayoutRevisionImpl.java
@@ -188,7 +188,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toString();
+			return _typeSettingsProperties.toSortedString();
 		}
 	}
 
@@ -307,7 +307,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toString());
+		super.setTypeSettings(_typeSettingsProperties.toSortedString());
 	}
 
 	protected Theme getTheme(String device) throws PortalException {
