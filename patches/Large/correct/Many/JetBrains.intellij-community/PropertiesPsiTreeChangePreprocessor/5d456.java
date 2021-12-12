diff --git a/plugins/properties/properties-psi-impl/src/com/intellij/lang/properties/psi/impl/PropertiesPsiTreeChangePreprocessor.java b/plugins/properties/properties-psi-impl/src/com/intellij/lang/properties/psi/impl/PropertiesPsiTreeChangePreprocessor.java
index 8f886f9..739f4e0 100644
--- a/plugins/properties/properties-psi-impl/src/com/intellij/lang/properties/psi/impl/PropertiesPsiTreeChangePreprocessor.java
+++ b/plugins/properties/properties-psi-impl/src/com/intellij/lang/properties/psi/impl/PropertiesPsiTreeChangePreprocessor.java
@@ -59,7 +59,7 @@
         if (isCodeBlock(event.getChild())) return;
         break;
       case CHILDREN_CHANGED:
-        if (isCodeBlock(event.getChild())) return;
+        if (isCodeBlock(event.getParent())) return;
       case PROPERTY_CHANGED:
         break;
     }
