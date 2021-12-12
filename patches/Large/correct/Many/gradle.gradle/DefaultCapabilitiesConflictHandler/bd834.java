diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/conflicts/DefaultCapabilitiesConflictHandler.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/conflicts/DefaultCapabilitiesConflictHandler.java
index ede7af0..344f4cc 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/conflicts/DefaultCapabilitiesConflictHandler.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/conflicts/DefaultCapabilitiesConflictHandler.java
@@ -85,7 +85,7 @@
         String capabilityId = capability.getCapabilityId();
         Set<ComponentState> componentStates = capabilityWithoutVersionToComponents.get(capabilityId);
         if (componentStates == null) {
-            componentStates = Sets.newHashSet();
+            componentStates = Sets.newLinkedHashSet();
             capabilityWithoutVersionToComponents.put(capabilityId, componentStates);
         }
 
