diff --git a/python/src/com/jetbrains/python/inspections/PyExceptionInheritInspection.java b/python/src/com/jetbrains/python/inspections/PyExceptionInheritInspection.java
index 71bb911..7afd723 100644
--- a/python/src/com/jetbrains/python/inspections/PyExceptionInheritInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyExceptionInheritInspection.java
@@ -48,7 +48,7 @@
           if (psiElement instanceof PyClass) {
             PyClass aClass = (PyClass) psiElement;
             for (PyClassRef pyClass : aClass.iterateAncestors()) {
-              if ("Exception".equals(pyClass.getClassName())) {
+              if ("Exception".equals(pyClass.getQualifiedName())) {
                 return;
               }
             }
