diff --git a/platform/projectModel-impl/src/com/intellij/openapi/projectRoots/impl/SimpleProjectRoot.java b/platform/projectModel-impl/src/com/intellij/openapi/projectRoots/impl/SimpleProjectRoot.java
index 8505202..6b7826e 100644
--- a/platform/projectModel-impl/src/com/intellij/openapi/projectRoots/impl/SimpleProjectRoot.java
+++ b/platform/projectModel-impl/src/com/intellij/openapi/projectRoots/impl/SimpleProjectRoot.java
@@ -41,7 +41,7 @@
   private boolean myInitialized = false;
   @NonNls private static final String ATTRIBUTE_URL = "url";
 
-  SimpleProjectRoot(@NotNull VirtualFile file) {
+  public SimpleProjectRoot(@NotNull VirtualFile file) {
     myFile = file;
     myUrl = myFile.getUrl();
   }
