diff --git a/platform/core-api/src/com/intellij/psi/impl/ElementBase.java b/platform/core-api/src/com/intellij/psi/impl/ElementBase.java
index d7a98aa..10f1c8f 100644
--- a/platform/core-api/src/com/intellij/psi/impl/ElementBase.java
+++ b/platform/core-api/src/com/intellij/psi/impl/ElementBase.java
@@ -235,7 +235,7 @@
         layersFromProviders.add(layerIcon);
       }
     }
-    if (flags != 0) {
+    if (flags != 0 || !layersFromProviders.isEmpty()) {
       List<Icon> iconLayers = new SmartList<Icon>();
       for(IconLayer l: ourIconLayers) {
         if ((flags & l.flagMask) != 0) {
