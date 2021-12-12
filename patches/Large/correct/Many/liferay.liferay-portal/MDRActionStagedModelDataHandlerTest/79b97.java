diff --git a/portal-impl/test/integration/com/liferay/portlet/mobiledevicerules/lar/MDRActionStagedModelDataHandlerTest.java b/portal-impl/test/integration/com/liferay/portlet/mobiledevicerules/lar/MDRActionStagedModelDataHandlerTest.java
index d686399..34cd8a7 100644
--- a/portal-impl/test/integration/com/liferay/portlet/mobiledevicerules/lar/MDRActionStagedModelDataHandlerTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/mobiledevicerules/lar/MDRActionStagedModelDataHandlerTest.java
@@ -156,7 +156,7 @@
 
 		MDRRuleGroupInstanceLocalServiceUtil.
 			getMDRRuleGroupInstanceByUuidAndGroupId(
-				ruleGroupInstance.getUuid(), ruleGroupInstance.getGroupId());
+				ruleGroupInstance.getUuid(), group.getGroupId());
 	}
 
 	private Layout _layout;
