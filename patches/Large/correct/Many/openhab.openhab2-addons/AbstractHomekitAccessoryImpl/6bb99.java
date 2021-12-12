diff --git a/addons/io/org.openhab.io.homekit/src/main/java/org/openhab/io/homekit/internal/accessories/AbstractHomekitAccessoryImpl.java b/addons/io/org.openhab.io.homekit/src/main/java/org/openhab/io/homekit/internal/accessories/AbstractHomekitAccessoryImpl.java
index 1323d8d..6600e2e 100644
--- a/addons/io/org.openhab.io.homekit/src/main/java/org/openhab/io/homekit/internal/accessories/AbstractHomekitAccessoryImpl.java
+++ b/addons/io/org.openhab.io.homekit/src/main/java/org/openhab/io/homekit/internal/accessories/AbstractHomekitAccessoryImpl.java
@@ -47,7 +47,7 @@
             baseItem = ((GroupItem) baseItem).getBaseItem();
         }
         if (expectedItemClass != taggedItem.getItem().getClass()
-                && expectedItemClass.isAssignableFrom(baseItem.getClass())) {
+                && !expectedItemClass.isAssignableFrom(baseItem.getClass())) {
             logger.error("Type " + taggedItem.getItem().getName() + " is a " + baseItem.getClass().getName()
                     + " instead of the expected " + expectedItemClass.getName());
         }
