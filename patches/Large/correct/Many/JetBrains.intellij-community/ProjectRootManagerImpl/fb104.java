diff --git a/source/com/intellij/openapi/roots/impl/ProjectRootManagerImpl.java b/source/com/intellij/openapi/roots/impl/ProjectRootManagerImpl.java
index 418911b..47eaebc 100644
--- a/source/com/intellij/openapi/roots/impl/ProjectRootManagerImpl.java
+++ b/source/com/intellij/openapi/roots/impl/ProjectRootManagerImpl.java
@@ -848,7 +848,7 @@
 
     private RootSetChangedMulticaster(RootProvider provider) {
       myProvider = provider;
-      provider.addRootSetChangedListener(this, myProject);
+      provider.addRootSetChangedListener(this);
       myRegisteredRootProviderListeners.put(myProvider, this);
     }
 
