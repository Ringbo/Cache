diff --git a/modules/apps/document-library/document-library-uad-test/src/testIntegration/java/com/liferay/document/library/uad/anonymizer/test/DLFileEntryUADAnonymizerTest.java b/modules/apps/document-library/document-library-uad-test/src/testIntegration/java/com/liferay/document/library/uad/anonymizer/test/DLFileEntryUADAnonymizerTest.java
index be01a744..dd38079d 100644
--- a/modules/apps/document-library/document-library-uad-test/src/testIntegration/java/com/liferay/document/library/uad/anonymizer/test/DLFileEntryUADAnonymizerTest.java
+++ b/modules/apps/document-library/document-library-uad-test/src/testIntegration/java/com/liferay/document/library/uad/anonymizer/test/DLFileEntryUADAnonymizerTest.java
@@ -88,7 +88,7 @@
 			WorkflowConstants.STATUS_ANY);
 
 		Assert.assertEquals(
-			dlFileVersions.toString(), 3, dlFileVersions.size());
+			dlFileVersions.toString(), 4, dlFileVersions.size());
 
 		uadAnonymizer.autoAnonymize(
 			dlFileEntry, user.getUserId(), anonymousUser);
