diff --git a/bundles/ui/org.openhab.ui/src/main/java/org/openhab/ui/internal/items/ItemUIRegistryImpl.java b/bundles/ui/org.openhab.ui/src/main/java/org/openhab/ui/internal/items/ItemUIRegistryImpl.java
index 190cb8f..fd8bc4e 100644
--- a/bundles/ui/org.openhab.ui/src/main/java/org/openhab/ui/internal/items/ItemUIRegistryImpl.java
+++ b/bundles/ui/org.openhab.ui/src/main/java/org/openhab/ui/internal/items/ItemUIRegistryImpl.java
@@ -225,7 +225,7 @@
 		try {
 			item = getItem(itemName);
 		} catch (ItemNotFoundException e) {
-			logger.error("Cannot retrieve item {} for widget {}", itemName, w.eClass().getInstanceTypeName());
+			logger.debug("Cannot retrieve item {} for widget {}", itemName, w.eClass().getInstanceTypeName());
 		}
 		return formatLabel(item, itemName, label);
 	}
