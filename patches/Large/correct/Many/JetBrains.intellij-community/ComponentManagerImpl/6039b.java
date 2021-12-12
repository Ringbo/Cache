diff --git a/platform/core-impl/src/com/intellij/openapi/components/impl/ComponentManagerImpl.java b/platform/core-impl/src/com/intellij/openapi/components/impl/ComponentManagerImpl.java
index c26dd1c..ef99dd9 100644
--- a/platform/core-impl/src/com/intellij/openapi/components/impl/ComponentManagerImpl.java
+++ b/platform/core-impl/src/com/intellij/openapi/components/impl/ComponentManagerImpl.java
@@ -160,7 +160,7 @@
     //}
 
     synchronized (this) {
-      if (!myComponentsRegistry.containsInterface(interfaceClass)) {
+      if (myComponentsRegistry == null || !myComponentsRegistry.containsInterface(interfaceClass)) {
         return null;
       }
 
