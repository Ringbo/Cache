diff --git a/platform/platform-impl/src/com/intellij/openapi/components/impl/stores/XmlElementStorage.java b/platform/platform-impl/src/com/intellij/openapi/components/impl/stores/XmlElementStorage.java
index 1d8bf64..ccb0b6f 100644
--- a/platform/platform-impl/src/com/intellij/openapi/components/impl/stores/XmlElementStorage.java
+++ b/platform/platform-impl/src/com/intellij/openapi/components/impl/stores/XmlElementStorage.java
@@ -156,7 +156,7 @@
       }
 
       //noinspection deprecation
-      if (wasLoaded && !(myStreamProvider instanceof OldStreamProviderAdapter || myStreamProvider instanceof CurrentUserHolder)) {
+      if (wasLoaded && !myStreamProvider.isVersioningRequired() && !(myStreamProvider instanceof OldStreamProviderAdapter || myStreamProvider instanceof CurrentUserHolder)) {
         // we don't use local data if stream provider has one (to preserve backward compatibility, we don't use this logic for old stream providers)
         return result;
       }
@@ -576,7 +576,7 @@
     myLoadedData = storageData;
   }
 
-  private void filterOutOfDate(Element element) {
+  private void filterOutOfDate(@NotNull Element element) {
     if (myRemoteVersionProvider == null) {
       return;
     }
