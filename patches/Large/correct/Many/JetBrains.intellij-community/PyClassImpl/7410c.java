diff --git a/python/src/com/jetbrains/python/psi/impl/PyClassImpl.java b/python/src/com/jetbrains/python/psi/impl/PyClassImpl.java
index a6cebe6..3c69615 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyClassImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyClassImpl.java
@@ -639,9 +639,9 @@
       myPropertyCache = initializePropertyCache();
     }
     for (Property property : myPropertyCache.values()) {
-      if (property.getGetter().value() == function ||
-          property.getSetter().value() == function ||
-          property.getDeleter().value() == function) {
+      if (property.getGetter().valueOrNull() == function ||
+          property.getSetter().valueOrNull() == function ||
+          property.getDeleter().valueOrNull() == function) {
         return property;
       }
     }
