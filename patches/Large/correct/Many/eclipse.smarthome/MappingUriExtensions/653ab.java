diff --git a/bundles/model/org.eclipse.smarthome.model.lsp/src/main/java/org/eclipse/smarthome/model/lsp/internal/MappingUriExtensions.java b/bundles/model/org.eclipse.smarthome.model.lsp/src/main/java/org/eclipse/smarthome/model/lsp/internal/MappingUriExtensions.java
index 77a4d0f..c353b57 100644
--- a/bundles/model/org.eclipse.smarthome.model.lsp/src/main/java/org/eclipse/smarthome/model/lsp/internal/MappingUriExtensions.java
+++ b/bundles/model/org.eclipse.smarthome.model.lsp/src/main/java/org/eclipse/smarthome/model/lsp/internal/MappingUriExtensions.java
@@ -103,7 +103,7 @@
         return URI.createURI(super.toPath(javaNetUri));
     }
 
-    private String removeTrailingSlash(String path) {
+    protected final String removeTrailingSlash(String path) {
         if (path.endsWith("/")) {
             return path.substring(0, path.length() - 1);
         } else {
