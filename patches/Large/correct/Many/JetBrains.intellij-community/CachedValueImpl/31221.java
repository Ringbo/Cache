diff --git a/source/com/intellij/psi/impl/CachedValueImpl.java b/source/com/intellij/psi/impl/CachedValueImpl.java
index 590534a..d9c207a 100644
--- a/source/com/intellij/psi/impl/CachedValueImpl.java
+++ b/source/com/intellij/psi/impl/CachedValueImpl.java
@@ -119,7 +119,7 @@
     List deps = new ArrayList();
     collectDependencies(timeStamps, deps, dependencies);
     if (myTrackValue) {
-      collectDependencies(timeStamps, deps, new Object[]{myValue});
+      collectDependencies(timeStamps, deps, new Object[]{myValue.get()});
     }
 
     myLastPsiTimeStamp = myManager.getModificationTracker().getModificationCount();
@@ -129,7 +129,7 @@
 
   private void collectDependencies(TLongArrayList timeStamps, List resultingDeps, Object[] dependencies) {
     for (Object dependency : dependencies) {
-      if (dependency == null) continue;
+      if (dependency == null || dependency == NULL) continue;
       if (dependency.getClass().isArray()) {
         Object[] objects = (Object[])dependency;
         collectDependencies(timeStamps, resultingDeps, objects);
