diff --git a/portal-impl/test/integration/com/liferay/portlet/mobiledevicerules/lar/MDRRuleStagedModelDataHandlerTest.java b/portal-impl/test/integration/com/liferay/portlet/mobiledevicerules/lar/MDRRuleStagedModelDataHandlerTest.java
index 4629553..8212afd 100644
--- a/portal-impl/test/integration/com/liferay/portlet/mobiledevicerules/lar/MDRRuleStagedModelDataHandlerTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/mobiledevicerules/lar/MDRRuleStagedModelDataHandlerTest.java
@@ -106,7 +106,7 @@
 		MDRRuleGroup ruleGroup = (MDRRuleGroup)dependentStagedModels.get(0);
 
 		MDRRuleGroupLocalServiceUtil.getMDRRuleGroupByUuidAndGroupId(
-			ruleGroup.getUuid(), ruleGroup.getGroupId());
+			ruleGroup.getUuid(), group.getGroupId());
 	}
 
 }
\ No newline at end of file
