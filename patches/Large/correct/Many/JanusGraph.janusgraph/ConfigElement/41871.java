diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/ConfigElement.java b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/ConfigElement.java
index 2dede8f..2a72d4e 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/ConfigElement.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/configuration/ConfigElement.java
@@ -154,7 +154,7 @@
         if (includeRoot) {
             // Assumes that roots are not umbrellas
             // If roots could be umbrellas, we might have to change the interpretation of umbrellaElements
-            path = (element.isNamespace() ?
+            path = (element.isRoot() ?
                     element.getName() :
                     element.getNamespace().getName()) + SEPARATOR + path;
         }
