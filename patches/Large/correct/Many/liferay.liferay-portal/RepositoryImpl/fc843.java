diff --git a/portal-impl/src/com/liferay/portal/model/impl/RepositoryImpl.java b/portal-impl/src/com/liferay/portal/model/impl/RepositoryImpl.java
index 5f572ee..45483bd 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/RepositoryImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/RepositoryImpl.java
@@ -37,7 +37,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toSortedString();
+			return _typeSettingsProperties.toString();
 		}
 	}
 
@@ -65,7 +65,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toSortedString());
+		super.setTypeSettings(_typeSettingsProperties.toString());
 	}
 
 	private UnicodeProperties _typeSettingsProperties;
