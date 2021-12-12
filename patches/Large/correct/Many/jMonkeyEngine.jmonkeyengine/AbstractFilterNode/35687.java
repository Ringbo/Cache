diff --git a/sdk/jme3-core/src/com/jme3/gde/core/filters/AbstractFilterNode.java b/sdk/jme3-core/src/com/jme3/gde/core/filters/AbstractFilterNode.java
index b8d8fc6..7b8be64 100644
--- a/sdk/jme3-core/src/com/jme3/gde/core/filters/AbstractFilterNode.java
+++ b/sdk/jme3-core/src/com/jme3/gde/core/filters/AbstractFilterNode.java
@@ -118,7 +118,7 @@
             return sheet;
         }
         set.put(makeProperty(obj, String.class, "getName", "setName", "Name"));
-        set.put(makeProperty(obj, boolean.class, "setEnabled", "isEnabled", "Enabled"));
+        set.put(makeProperty(obj, boolean.class, "isEnabled", "setEnabled", "Enabled"));
         sheet.put(set);
         return sheet;
 
