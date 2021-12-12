diff --git a/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/internal/items/ItemRegistryImpl.java b/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/internal/items/ItemRegistryImpl.java
index 5b9e61e..282a168 100644
--- a/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/internal/items/ItemRegistryImpl.java
+++ b/bundles/core/org.eclipse.smarthome.core/src/main/java/org/eclipse/smarthome/core/internal/items/ItemRegistryImpl.java
@@ -71,7 +71,7 @@
 	public Item getItem(String name) throws ItemNotFoundException {
 		for(Collection<Item> items : itemMap.values()) {
 			for(Item item : items) {
-				if(item.getName().matches(name)) {
+				if(item.getName().equals(name)) {
 					return item;
 				}
 			}
