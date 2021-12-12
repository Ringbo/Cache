diff --git a/portal-impl/src/com/liferay/portlet/mobiledevicerules/service/impl/MDRActionLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/mobiledevicerules/service/impl/MDRActionLocalServiceImpl.java
index a0e65a8..9049381 100644
--- a/portal-impl/src/com/liferay/portlet/mobiledevicerules/service/impl/MDRActionLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/mobiledevicerules/service/impl/MDRActionLocalServiceImpl.java
@@ -86,7 +86,7 @@
 
 		return addAction(
 			ruleGroupInstanceId, nameMap, descriptionMap, type,
-			typeSettingsProperties.toSortedString(), serviceContext);
+			typeSettingsProperties.toString(), serviceContext);
 	}
 
 	@Override
@@ -194,7 +194,7 @@
 
 		return updateAction(
 			actionId, nameMap, descriptionMap, type,
-			typeSettingsProperties.toSortedString(), serviceContext);
+			typeSettingsProperties.toString(), serviceContext);
 	}
 
 }
\ No newline at end of file
