diff --git a/portal-impl/src/com/liferay/portal/repository/capabilities/BaseCapabilityRepository.java b/portal-impl/src/com/liferay/portal/repository/capabilities/BaseCapabilityRepository.java
index b63f65d..3b60b8d 100644
--- a/portal-impl/src/com/liferay/portal/repository/capabilities/BaseCapabilityRepository.java
+++ b/portal-impl/src/com/liferay/portal/repository/capabilities/BaseCapabilityRepository.java
@@ -50,7 +50,7 @@
 	}
 
 	@Override
-	public <T extends Capability> T getCapability(Class<T> capabilityClass) {
+	public <S extends Capability> S getCapability(Class<S> capabilityClass) {
 		if (_exportedCapabilityClasses.contains(capabilityClass)) {
 			return getInternalCapability(capabilityClass);
 		}
@@ -62,14 +62,14 @@
 	}
 
 	@Override
-	public <T extends Capability> boolean isCapabilityProvided(
-		Class<T> capabilityClass) {
+	public <S extends Capability> boolean isCapabilityProvided(
+		Class<S> capabilityClass) {
 
 		return _exportedCapabilityClasses.contains(capabilityClass);
 	}
 
-	protected <T extends Capability> T getInternalCapability(
-		Class<T> capabilityClass) {
+	protected <S extends Capability> S getInternalCapability(
+		Class<S> capabilityClass) {
 
 		Capability capability = _supportedCapabilitiesMap.get(capabilityClass);
 
@@ -80,7 +80,7 @@
 					capabilityClass.getName(), getRepositoryId()));
 		}
 
-		return (T)capability;
+		return (S)capability;
 	}
 
 	protected T getRepository() {
