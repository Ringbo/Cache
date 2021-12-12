diff --git a/modules/core/src/main/java/org/apache/ignite/internal/binary/BinaryMetadata.java b/modules/core/src/main/java/org/apache/ignite/internal/binary/BinaryMetadata.java
index a2589bf..d1c79f3 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/binary/BinaryMetadata.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/binary/BinaryMetadata.java
@@ -125,9 +125,9 @@
      * @return Field type name.
      */
     @Nullable public String fieldTypeName(String fieldName) {
-        Integer typeId = fields != null ? fields.get(fieldName).typeId() : null;
+        BinaryFieldMetadata meta = fields != null ? fields.get(fieldName) : null;
 
-        return typeId != null ? BinaryUtils.fieldTypeName(typeId) : null;
+        return meta != null ? BinaryUtils.fieldTypeName(meta.typeId()) : null;
     }
 
     /**
