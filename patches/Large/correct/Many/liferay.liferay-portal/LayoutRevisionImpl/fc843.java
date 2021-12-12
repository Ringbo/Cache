diff --git a/portal-impl/src/com/liferay/portal/model/impl/LayoutRevisionImpl.java b/portal-impl/src/com/liferay/portal/model/impl/LayoutRevisionImpl.java
index abfb66c..d123083 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/LayoutRevisionImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/LayoutRevisionImpl.java
@@ -188,7 +188,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toSortedString();
+			return _typeSettingsProperties.toString();
 		}
 	}
 
@@ -307,7 +307,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toSortedString());
+		super.setTypeSettings(_typeSettingsProperties.toString());
 	}
 
 	protected Theme getTheme(String device) throws PortalException {
