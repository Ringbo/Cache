diff --git a/engine/src/main/java/org/terasology/logic/inventory/PickupBuilder.java b/engine/src/main/java/org/terasology/logic/inventory/PickupBuilder.java
index 38b1d2c..0cd3cc9 100644
--- a/engine/src/main/java/org/terasology/logic/inventory/PickupBuilder.java
+++ b/engine/src/main/java/org/terasology/logic/inventory/PickupBuilder.java
@@ -56,7 +56,7 @@
                     pickupItem = removedItem;
                 }
             } else {
-                final EntityRef removedItem = CoreRegistry.get(InventoryManager.class).removeItem(owner, EntityRef.NULL, pickupItem, false);
+                final EntityRef removedItem = CoreRegistry.get(InventoryManager.class).removeItem(owner, EntityRef.NULL, pickupItem, false, 1);
                 if (removedItem != null) {
                     pickupItem = removedItem;
                 }
