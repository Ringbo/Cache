diff --git a/bundles/core/org.openhab.core/src/main/java/org/openhab/core/internal/items/ItemRegistryImpl.java b/bundles/core/org.openhab.core/src/main/java/org/openhab/core/internal/items/ItemRegistryImpl.java
index ff0bf09..d1f8242 100644
--- a/bundles/core/org.openhab.core/src/main/java/org/openhab/core/internal/items/ItemRegistryImpl.java
+++ b/bundles/core/org.openhab.core/src/main/java/org/openhab/core/internal/items/ItemRegistryImpl.java
@@ -194,7 +194,7 @@
 			}
 		}
 
-		Collection<Item> items = Collections.synchronizedCollection(new HashSet<Item>());
+		Collection<Item> items = Collections.synchronizedCollection(new ArrayList<Item>());
 		itemMap.put(provider, items);
 
 		for(Item item : provider.getItems()) {
