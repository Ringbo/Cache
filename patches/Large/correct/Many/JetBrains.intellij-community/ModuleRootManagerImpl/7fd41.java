diff --git a/platform/lang-impl/src/com/intellij/openapi/roots/impl/ModuleRootManagerImpl.java b/platform/lang-impl/src/com/intellij/openapi/roots/impl/ModuleRootManagerImpl.java
index a14ae6d..9ff0d04 100644
--- a/platform/lang-impl/src/com/intellij/openapi/roots/impl/ModuleRootManagerImpl.java
+++ b/platform/lang-impl/src/com/intellij/openapi/roots/impl/ModuleRootManagerImpl.java
@@ -143,7 +143,7 @@
   @NotNull
   public ModifiableRootModel getModifiableModel(final RootConfigurationAccessor accessor) {
     ApplicationManager.getApplication().assertReadAccessAllowed();
-    final RootModelImpl model = new RootModelImpl(myRootModel, this, true, accessor, null, myFilePointerManager, myProjectRootManager) {
+    final RootModelImpl model = new RootModelImpl(myRootModel, this, true, accessor, myFilePointerManager, myProjectRootManager) {
       @Override
       public void dispose() {
         super.dispose();
