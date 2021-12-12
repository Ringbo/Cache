diff --git a/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java b/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
index 41bdbaf..caaea77 100644
--- a/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
@@ -211,7 +211,7 @@
             }
             for (PyFunction method : containedClass.getMethods()) {
               Property property = method.getProperty();
-              if (property != null) {
+              if (property != null && method.getName().equals(refex.getText())) {
                 actions.add(new UnresolvedReferenceAddSelfQuickFix(refex));
               }
             }
