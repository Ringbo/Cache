diff --git a/portal-impl/src/com/liferay/portal/staging/StagingImpl.java b/portal-impl/src/com/liferay/portal/staging/StagingImpl.java
index 48a7306..9f7a313 100644
--- a/portal-impl/src/com/liferay/portal/staging/StagingImpl.java
+++ b/portal-impl/src/com/liferay/portal/staging/StagingImpl.java
@@ -405,7 +405,7 @@
 
 			LayoutLocalServiceUtil.updateLayout(
 				layout.getGroupId(), layout.getPrivateLayout(),
-				layout.getLayoutId(), typeSettingsProperties.toSortedString());
+				layout.getLayoutId(), typeSettingsProperties.toString());
 		}
 	}
 
