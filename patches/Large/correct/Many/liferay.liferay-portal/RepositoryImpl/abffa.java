diff --git a/portal-impl/src/com/liferay/portal/model/impl/RepositoryImpl.java b/portal-impl/src/com/liferay/portal/model/impl/RepositoryImpl.java
index 45483bd..5f572ee 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/RepositoryImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/RepositoryImpl.java
@@ -37,7 +37,7 @@
 			return super.getTypeSettings();
 		}
 		else {
-			return _typeSettingsProperties.toString();
+			return _typeSettingsProperties.toSortedString();
 		}
 	}
 
@@ -65,7 +65,7 @@
 
 		_typeSettingsProperties = typeSettingsProperties;
 
-		super.setTypeSettings(_typeSettingsProperties.toString());
+		super.setTypeSettings(_typeSettingsProperties.toSortedString());
 	}
 
 	private UnicodeProperties _typeSettingsProperties;
