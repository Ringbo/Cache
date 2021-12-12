diff --git a/platform/platform-impl/src/com/intellij/openapi/components/impl/stores/ComponentStoreImpl.java b/platform/platform-impl/src/com/intellij/openapi/components/impl/stores/ComponentStoreImpl.java
index 8b143e6..95e82d2 100644
--- a/platform/platform-impl/src/com/intellij/openapi/components/impl/stores/ComponentStoreImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/components/impl/stores/ComponentStoreImpl.java
@@ -298,7 +298,7 @@
     }
 
     Class<T> stateClass = ComponentSerializationUtil.getStateClass(component.getClass());
-    if (LOG.isDebugEnabled() && getDefaultState(component, name, stateClass) != null) {
+    if (!stateSpec.defaultStateAsResource() && LOG.isDebugEnabled() && getDefaultState(component, name, stateClass) != null) {
       LOG.error(name + " has default state, but not marked to load it");
     }
 
