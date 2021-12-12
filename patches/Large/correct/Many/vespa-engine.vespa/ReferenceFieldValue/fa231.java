diff --git a/document/src/main/java/com/yahoo/document/datatypes/ReferenceFieldValue.java b/document/src/main/java/com/yahoo/document/datatypes/ReferenceFieldValue.java
index 459681d..1e4079d 100644
--- a/document/src/main/java/com/yahoo/document/datatypes/ReferenceFieldValue.java
+++ b/document/src/main/java/com/yahoo/document/datatypes/ReferenceFieldValue.java
@@ -159,7 +159,7 @@
      * @return reference DocumentId, or null if none has been set
      */
     @Override
-    public Object getWrappedValue() {
+    public DocumentId getWrappedValue() {
         return documentId.orElse(null);
     }
 }
