diff --git a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/thing/setup/ThingSetupManagerResource.java b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/thing/setup/ThingSetupManagerResource.java
index cbb4728..37b22e1 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/thing/setup/ThingSetupManagerResource.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/thing/setup/ThingSetupManagerResource.java
@@ -101,7 +101,7 @@
             GroupItem thingGroupItem = thing.getLinkedItem();
             if (thingGroupItem != null) {
                 boolean itemUpdated = false;
-                if (!thingGroupItem.getLabel().equals(label)) {
+                if (thingGroupItem.getLabel()==null || !thingGroupItem.getLabel().equals(label)) {
                     thingGroupItem.setLabel(label);
                     itemUpdated = true;
                 }
