diff --git a/python/src/com/jetbrains/python/psi/PyResolveUtil.java b/python/src/com/jetbrains/python/psi/PyResolveUtil.java
index 67bd536..b88b793 100644
--- a/python/src/com/jetbrains/python/psi/PyResolveUtil.java
+++ b/python/src/com/jetbrains/python/psi/PyResolveUtil.java
@@ -487,7 +487,7 @@
         PyReferenceExpression expr = (PyReferenceExpression)element;
         String referencedName = expr.getReferencedName();
         if (referencedName != null && !myVariants.containsKey(referencedName)) {
-          final LookupItem lookup_item = (LookupItem)LookupElementFactory.getInstance().createLookupElement(element, referencedName);
+          final LookupItem lookup_item = (LookupItem)LookupElementFactory.getInstance().createLookupElement(referencedName);
           setupItem(lookup_item);
           myVariants.put(referencedName, lookup_item);
         }
