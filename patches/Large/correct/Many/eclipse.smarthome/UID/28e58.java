diff --git a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/UID.java b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/UID.java
index 13511b0..519ce1a 100644
--- a/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/UID.java
+++ b/bundles/core/org.eclipse.smarthome.core.thing/src/main/java/org/eclipse/smarthome/core/thing/UID.java
@@ -26,10 +26,9 @@
     private String[] segments;
 
     /**
-     * Default constructor in package scope only. Will allow to instantiate this
-     * class by reflection. Not intended to be used for normal instantiation.
+     * Constructor must be public, otherwise it can not be called by subclasses from another package.
      */
-    UID() {
+    public UID() {
         this.segments = null;
     }
 
