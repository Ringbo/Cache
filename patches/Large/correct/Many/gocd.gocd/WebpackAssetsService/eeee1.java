diff --git a/server/src/main/java/com/thoughtworks/go/server/service/WebpackAssetsService.java b/server/src/main/java/com/thoughtworks/go/server/service/WebpackAssetsService.java
index f056b21..0019377 100644
--- a/server/src/main/java/com/thoughtworks/go/server/service/WebpackAssetsService.java
+++ b/server/src/main/java/com/thoughtworks/go/server/service/WebpackAssetsService.java
@@ -77,13 +77,13 @@
     public Set<String> getJSAssetPathsFor(String... assetNames) throws IOException {
         return getAssetPathsFor(assetNames).stream()
                 .filter(assetName -> assetName.endsWith(".js"))
-                .collect(Collectors.toSet());
+                .collect(Collectors.toCollection(LinkedHashSet::new));
     }
 
     public Set<String> getCSSAssetPathsFor(String... assetNames) throws IOException {
         return getAssetPathsFor(assetNames).stream()
                 .filter(assetName -> assetName.endsWith(".css"))
-                .collect(Collectors.toSet());
+                .collect(Collectors.toCollection(LinkedHashSet::new));
     }
 
     private Map getManifest() throws IOException {
