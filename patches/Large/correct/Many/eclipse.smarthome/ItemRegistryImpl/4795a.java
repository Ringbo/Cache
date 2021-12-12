diff --git a/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/internal/items/ItemRegistryImpl.java b/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/internal/items/ItemRegistryImpl.java
index 6c40b44..f439702 100644
--- a/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/internal/items/ItemRegistryImpl.java
+++ b/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/internal/items/ItemRegistryImpl.java
@@ -355,7 +355,7 @@
         Collection<Item> items = getItemsByTag(tags);
         for (Item item : items) {
             if (typeFilter.isInstance(item)) {
-                filteredItems.add((T) filteredItems);
+                filteredItems.add((T) item);
             }
         }
         return filteredItems;
