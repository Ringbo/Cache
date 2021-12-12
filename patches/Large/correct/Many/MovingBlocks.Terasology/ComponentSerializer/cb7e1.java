diff --git a/engine/src/main/java/org/terasology/persistence/serializers/ComponentSerializer.java b/engine/src/main/java/org/terasology/persistence/serializers/ComponentSerializer.java
index 212ea11..80e49d0 100644
--- a/engine/src/main/java/org/terasology/persistence/serializers/ComponentSerializer.java
+++ b/engine/src/main/java/org/terasology/persistence/serializers/ComponentSerializer.java
@@ -196,7 +196,7 @@
             }
             if (fieldInfo != null) {
                 dataMap.put(fieldInfo, new ProtobufPersistedData(field.getValue()));
-            } else if (field.hasNameIndex()) {
+            } else if (field.hasName()) {
                 logger.warn("Cannot deserialize unknown field '{}' onto '{}'", field.getName(), componentMetadata.getUri());
             }
         }
