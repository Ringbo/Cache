diff --git a/portal-impl/src/com/liferay/portal/repository/InitializedDocumentRepository.java b/portal-impl/src/com/liferay/portal/repository/InitializedDocumentRepository.java
index 400d697..182c543 100644
--- a/portal-impl/src/com/liferay/portal/repository/InitializedDocumentRepository.java
+++ b/portal-impl/src/com/liferay/portal/repository/InitializedDocumentRepository.java
@@ -280,8 +280,8 @@
 	}
 
 	@Override
-	public <T extends Capability> boolean isCapabilityProvided(
-		Class<T> capabilityClass) {
+	public <C extends Capability> boolean isCapabilityProvided(
+		Class<C> capabilityClass) {
 
 		checkDocumentRepository();
 
