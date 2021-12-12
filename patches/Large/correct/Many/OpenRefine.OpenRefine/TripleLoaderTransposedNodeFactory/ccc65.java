diff --git a/extensions/freebase/src/com/google/refine/freebase/protograph/transpose/TripleLoaderTransposedNodeFactory.java b/extensions/freebase/src/com/google/refine/freebase/protograph/transpose/TripleLoaderTransposedNodeFactory.java
index 21e5b89..186448a 100644
--- a/extensions/freebase/src/com/google/refine/freebase/protograph/transpose/TripleLoaderTransposedNodeFactory.java
+++ b/extensions/freebase/src/com/google/refine/freebase/protograph/transpose/TripleLoaderTransposedNodeFactory.java
@@ -120,13 +120,13 @@
     }
     protected void ensureFromTypesAsserted(Recon recon, String propertyID) {
         String fromTypeID = schemaHelper.getPropertyFromType(propertyID);
-        if (fromTypeID != null) {
+        if (fromTypeID != null && !"/type/object".equals(fromTypeID)) {
             ensureAllIncludedTypesAsserted(recon, fromTypeID);
         }
     }
     protected void ensureToTypesAsserted(Recon recon, String propertyID) {
         String toTypeID = schemaHelper.getPropertyToType(propertyID);
-        if (toTypeID != null) {
+        if (toTypeID != null && !"/type/object".equals(toTypeID)) {
             ensureAllIncludedTypesAsserted(recon, toTypeID);
         }
     }
