diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/serialization/SerializableHasSerializationMethodsInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/serialization/SerializableHasSerializationMethodsInspection.java
index 80006ed..624f04b 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/serialization/SerializableHasSerializationMethodsInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/serialization/SerializableHasSerializationMethodsInspection.java
@@ -54,7 +54,8 @@
 
         public void visitClass(PsiClass aClass) {
             // no call to super, so it doesn't drill down
-            if (aClass.isInterface() || aClass.isAnnotationType()) {
+            if (aClass.isInterface() || aClass.isAnnotationType() ||
+                        aClass.isEnum()) {
                 return;
             }
             if (m_ignoreSerializableDueToInheritance) {
