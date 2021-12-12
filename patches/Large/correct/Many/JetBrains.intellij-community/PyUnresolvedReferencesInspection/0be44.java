diff --git a/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java b/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
index b222892..0a9a6ff 100644
--- a/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
+++ b/python/src/com/jetbrains/python/inspections/PyUnresolvedReferencesInspection.java
@@ -328,7 +328,7 @@
           if (qexpr != null) {
             PyType qtype = qexpr.getType(TypeEvalContext.fast());
             if (qtype != null) {
-              if (qtype instanceof PyNoneType) {
+              if (qtype instanceof PyNoneType || qtype instanceof PyTypeReference) {
                 // this almost always means that we don't know the type, so don't show an error in this case
                 return;
               }
