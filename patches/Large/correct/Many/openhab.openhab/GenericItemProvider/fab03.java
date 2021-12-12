diff --git a/bundles/model/org.openhab.model.item/src/org/openhab/model/item/internal/GenericItemProvider.java b/bundles/model/org.openhab.model.item/src/org/openhab/model/item/internal/GenericItemProvider.java
index 963aa60..2268064 100644
--- a/bundles/model/org.openhab.model.item/src/org/openhab/model/item/internal/GenericItemProvider.java
+++ b/bundles/model/org.openhab.model.item/src/org/openhab/model/item/internal/GenericItemProvider.java
@@ -143,7 +143,7 @@
 	 */
 	@Override
 	public Collection<Item> getItems() {
-		Set<Item> items = new HashSet<Item>();
+		List<Item> items = new ArrayList<Item>();
 		for (String name : modelRepository.getAllModelNamesOfType("items")) {
 			items.addAll(getItemsFromModel(name));
 		}
