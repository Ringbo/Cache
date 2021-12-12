diff --git a/portal-impl/test/integration/com/liferay/portal/lar/BaseStagedModelDataHandlerTestCase.java b/portal-impl/test/integration/com/liferay/portal/lar/BaseStagedModelDataHandlerTestCase.java
index 85da188..4af0f79 100644
--- a/portal-impl/test/integration/com/liferay/portal/lar/BaseStagedModelDataHandlerTestCase.java
+++ b/portal-impl/test/integration/com/liferay/portal/lar/BaseStagedModelDataHandlerTestCase.java
@@ -310,7 +310,7 @@
 			assetEntry.getClassName(), assetEntry.getClassPK(),
 			new long[] {
 				assetCategory.getCategoryId(),
-				companAssetCategory.getCategoryId()
+				companyAssetCategory.getCategoryId()
 			},
 			new String[] {assetTag.getName()});
 
