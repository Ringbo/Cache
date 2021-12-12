diff --git a/extensions/binding/org.eclipse.smarthome.binding.bosesoundtouch/src/main/java/org/eclipse/smarthome/binding/bosesoundtouch/internal/ContentItem.java b/extensions/binding/org.eclipse.smarthome.binding.bosesoundtouch/src/main/java/org/eclipse/smarthome/binding/bosesoundtouch/internal/ContentItem.java
index dc4de47..2b4ec3a 100644
--- a/extensions/binding/org.eclipse.smarthome.binding.bosesoundtouch/src/main/java/org/eclipse/smarthome/binding/bosesoundtouch/internal/ContentItem.java
+++ b/extensions/binding/org.eclipse.smarthome.binding.bosesoundtouch/src/main/java/org/eclipse/smarthome/binding/bosesoundtouch/internal/ContentItem.java
@@ -34,7 +34,7 @@
     private String itemName;
     private int presetID;
     @Expose
-    private Map<String, String> additionalAttributes;
+    private final Map<String, String> additionalAttributes;
 
     /**
      * Creates a new instance of this class
@@ -71,7 +71,7 @@
         if (getOperationMode() == OperationModeType.STANDBY) {
             return true;
         }
-        if (itemName.equals("") || source.equals("")) {
+        if (itemName == null || source == null || itemName.isEmpty() || source.isEmpty()) {
             return false;
         } else {
             return true;
