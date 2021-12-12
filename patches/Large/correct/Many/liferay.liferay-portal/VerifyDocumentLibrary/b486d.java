diff --git a/portal-impl/src/com/liferay/portal/verify/VerifyDocumentLibrary.java b/portal-impl/src/com/liferay/portal/verify/VerifyDocumentLibrary.java
index f74fc61..6882802 100644
--- a/portal-impl/src/com/liferay/portal/verify/VerifyDocumentLibrary.java
+++ b/portal-impl/src/com/liferay/portal/verify/VerifyDocumentLibrary.java
@@ -120,7 +120,7 @@
 
 		if (_log.isDebugEnabled()) {
 			_log.debug(
-				"Deleting " + noStructuresDLFileEntryMetadatas.size() +
+				"Deleting " + mismatchedCompanyIdDLFileEntryMetadatas.size() +
 					" file entry metadatas with mismatched company IDs");
 		}
 
