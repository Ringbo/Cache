diff --git a/python/src/com/jetbrains/python/psi/resolve/VariantsProcessor.java b/python/src/com/jetbrains/python/psi/resolve/VariantsProcessor.java
index a0ce769..26282a2 100644
--- a/python/src/com/jetbrains/python/psi/resolve/VariantsProcessor.java
+++ b/python/src/com/jetbrains/python/psi/resolve/VariantsProcessor.java
@@ -41,7 +41,7 @@
   }
 
   protected static LookupElementBuilder setItemNotice(final LookupElementBuilder item, String notice) {
-    return item.setTailText(notice);
+    return item.setTypeText(notice);
   }
 
   public LookupElement[] getResult() {
@@ -86,7 +86,7 @@
                 final PyFromImportStatement from_import = (PyFromImportStatement)maybe_from_import;
                 PyReferenceExpression src = from_import.getImportSource();
                 if (src != null) {
-                  lookup_item = setItemNotice(lookup_item, " | " + src.getName());
+                  lookup_item = setItemNotice(lookup_item, src.getName());
                 }
               }
             }
