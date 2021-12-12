diff --git a/platform-impl/src/com/intellij/openapi/vfs/impl/VirtualFilePointerManagerImpl.java b/platform-impl/src/com/intellij/openapi/vfs/impl/VirtualFilePointerManagerImpl.java
index 2246c57..1c849e5 100644
--- a/platform-impl/src/com/intellij/openapi/vfs/impl/VirtualFilePointerManagerImpl.java
+++ b/platform-impl/src/com/intellij/openapi/vfs/impl/VirtualFilePointerManagerImpl.java
@@ -106,7 +106,7 @@
   }
 
   @TestOnly
-  public void cleanupForNextTest() {
+  public synchronized void cleanupForNextTest() {
     myUrlToPointerMaps.clear();
     myContainers.clear();
   }
@@ -242,12 +242,12 @@
   }
 
   @Deprecated
-  public VirtualFilePointerContainer createContainer() {
+  public synchronized VirtualFilePointerContainer createContainer() {
     return createContainer(this);
   }
 
   @Deprecated // see createContainer(VirtualFilePointerFactory factory, Disposable parent)
-  public VirtualFilePointerContainer createContainer(final VirtualFilePointerFactory factory) {
+  public synchronized VirtualFilePointerContainer createContainer(final VirtualFilePointerFactory factory) {
     final VirtualFilePointerContainerImpl virtualFilePointerContainer = new VirtualFilePointerContainerImpl(this, this){
       @Override
       protected VirtualFilePointer create(VirtualFile file) {
@@ -268,11 +268,11 @@
   }
 
   @NotNull
-  public VirtualFilePointerContainer createContainer(@NotNull Disposable parent) {
+  public synchronized VirtualFilePointerContainer createContainer(@NotNull Disposable parent) {
     return registerContainer(parent, new VirtualFilePointerContainerImpl(this, parent));
   }
 
-  private VirtualFilePointerContainer registerContainer(Disposable parent, final VirtualFilePointerContainerImpl virtualFilePointerContainer) {
+  private VirtualFilePointerContainer registerContainer(Disposable parent, @NotNull final VirtualFilePointerContainerImpl virtualFilePointerContainer) {
     myContainers.add(virtualFilePointerContainer);
     Disposer.register(parent, new Disposable() {
       public void dispose() {
