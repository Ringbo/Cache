diff --git a/sdk/jme3-core/src/com/jme3/gde/core/properties/EmitterShapePropertyEditor.java b/sdk/jme3-core/src/com/jme3/gde/core/properties/EmitterShapePropertyEditor.java
index 509d745..a2ab59a 100644
--- a/sdk/jme3-core/src/com/jme3/gde/core/properties/EmitterShapePropertyEditor.java
+++ b/sdk/jme3-core/src/com/jme3/gde/core/properties/EmitterShapePropertyEditor.java
@@ -92,9 +92,9 @@
                     + ", "
                     + (shape.getMin().x + shape.getLen().x)
                     + ", "
-                    + (shape.getMin().x + shape.getLen().y)
+                    + (shape.getMin().y + shape.getLen().y)
                     + ", "
-                    + (shape.getMin().x + shape.getLen().z)
+                    + (shape.getMin().z + shape.getLen().z)
                     + "]";
         } else if (emitter instanceof EmitterPointShape) {
             EmitterPointShape shape = (EmitterPointShape) emitter;
