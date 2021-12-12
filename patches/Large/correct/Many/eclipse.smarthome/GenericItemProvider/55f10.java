diff --git a/bundles/model/org.eclipse.smarthome.model.item/src/org/eclipse/smarthome/model/item/internal/GenericItemProvider.java b/bundles/model/org.eclipse.smarthome.model.item/src/org/eclipse/smarthome/model/item/internal/GenericItemProvider.java
index 70af1d7..a0e4668 100644
--- a/bundles/model/org.eclipse.smarthome.model.item/src/org/eclipse/smarthome/model/item/internal/GenericItemProvider.java
+++ b/bundles/model/org.eclipse.smarthome.model.item/src/org/eclipse/smarthome/model/item/internal/GenericItemProvider.java
@@ -350,7 +350,7 @@
             switch (type) {
                 case ADDED:
                     processBindingConfigsFromModel(modelName);
-                    Collection<Item> allNewItems = getAll();
+                    Collection<Item> allNewItems = getItemsFromModel(modelName);
                     itemsMap.put(modelName, allNewItems);
                     for (Item item : allNewItems) {
                         notifyListenersAboutAddedElement(item);
