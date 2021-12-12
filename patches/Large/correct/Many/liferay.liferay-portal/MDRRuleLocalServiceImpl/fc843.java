diff --git a/portal-impl/src/com/liferay/portlet/mobiledevicerules/service/impl/MDRRuleLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/mobiledevicerules/service/impl/MDRRuleLocalServiceImpl.java
index 05b6890..4518629e 100644
--- a/portal-impl/src/com/liferay/portlet/mobiledevicerules/service/impl/MDRRuleLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/mobiledevicerules/service/impl/MDRRuleLocalServiceImpl.java
@@ -83,7 +83,7 @@
 
 		return addRule(
 			ruleGroupId, nameMap, descriptionMap, type,
-			typeSettingsProperties.toSortedString(), serviceContext);
+			typeSettingsProperties.toString(), serviceContext);
 	}
 
 	@Override
@@ -208,7 +208,7 @@
 
 		return updateRule(
 			ruleId, nameMap, descriptionMap, type,
-			typeSettingsProperties.toSortedString(), serviceContext);
+			typeSettingsProperties.toString(), serviceContext);
 	}
 
 }
\ No newline at end of file
