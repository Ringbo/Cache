diff --git a/bundles/core/org.openhab.core/src/main/java/org/openhab/core/internal/items/ItemRegistryImpl.java b/bundles/core/org.openhab.core/src/main/java/org/openhab/core/internal/items/ItemRegistryImpl.java
index 8ccade9..ea17163 100644
--- a/bundles/core/org.openhab.core/src/main/java/org/openhab/core/internal/items/ItemRegistryImpl.java
+++ b/bundles/core/org.openhab.core/src/main/java/org/openhab/core/internal/items/ItemRegistryImpl.java
@@ -72,7 +72,7 @@
 	public Item getItem(String name) throws ItemNotFoundException {
 		for(Collection<Item> items : itemMap.values()) {
 			for(Item item : items) {
-				if(item.getName().matches(name)) {
+				if(item.getName().equals(name)) {
 					return item;
 				}
 			}
