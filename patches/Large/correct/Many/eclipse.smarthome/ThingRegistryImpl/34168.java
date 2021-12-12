diff --git a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingRegistryImpl.java b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingRegistryImpl.java
index ca7d4e3..f74686d 100644
--- a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingRegistryImpl.java
+++ b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/internal/ThingRegistryImpl.java
@@ -77,7 +77,7 @@
 
     @Override
     protected void notifyListenersAboutRemovedElement(Thing element) {
-        super.notifyListenersAboutAddedElement(element);
+        super.notifyListenersAboutRemovedElement(element);
         notifyTrackers(element, ThingTrackerEvent.THING_REMOVED);
     }
 
