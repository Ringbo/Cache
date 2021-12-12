diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/serialization/SerializableHasSerialVersionUIDFieldInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/serialization/SerializableHasSerialVersionUIDFieldInspection.java
index 04ba60b..ba3c225 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/serialization/SerializableHasSerialVersionUIDFieldInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/serialization/SerializableHasSerialVersionUIDFieldInspection.java
@@ -53,7 +53,7 @@
         public void visitClass(PsiClass aClass) {
             // no call to super, so it doesn't drill down
 
-            if (aClass.isInterface() || aClass.isAnnotationType()) {
+            if (aClass.isInterface() || aClass.isAnnotationType()|| aClass.isEnum()) {
                 return;
             }
             final PsiField[] fields = aClass.getFields();
