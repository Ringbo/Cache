diff --git a/modules/apps/web-experience/export-import/export-import-test/src/testIntegration/java/com/liferay/exportimport/internal/content/processor/test/DefaultExportImportContentProcessorTest.java b/modules/apps/web-experience/export-import/export-import-test/src/testIntegration/java/com/liferay/exportimport/internal/content/processor/test/DefaultExportImportContentProcessorTest.java
index 896a08b..3c15739 100644
--- a/modules/apps/web-experience/export-import/export-import-test/src/testIntegration/java/com/liferay/exportimport/internal/content/processor/test/DefaultExportImportContentProcessorTest.java
+++ b/modules/apps/web-experience/export-import/export-import-test/src/testIntegration/java/com/liferay/exportimport/internal/content/processor/test/DefaultExportImportContentProcessorTest.java
@@ -352,7 +352,7 @@
 
 		Assert.assertFalse(
 			content.contains(VirtualLayoutConstants.CANONICAL_URL_SEPARATOR));
-		Assert.assertFalse(
+		Assert.assertTrue(
 			content.contains(GroupConstants.CONTROL_PANEL_FRIENDLY_URL));
 		Assert.assertFalse(
 			content.contains(PropsValues.CONTROL_PANEL_LAYOUT_FRIENDLY_URL));
@@ -409,7 +409,7 @@
 
 		Assert.assertFalse(
 			content.contains(VirtualLayoutConstants.CANONICAL_URL_SEPARATOR));
-		Assert.assertFalse(
+		Assert.assertTrue(
 			content.contains(GroupConstants.CONTROL_PANEL_FRIENDLY_URL));
 		Assert.assertFalse(
 			content.contains(PropsValues.CONTROL_PANEL_LAYOUT_FRIENDLY_URL));
