diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/changedetection/state/InputPropertiesSerializer.java b/subprojects/core/src/main/java/org/gradle/api/internal/changedetection/state/InputPropertiesSerializer.java
index ec79cbc..6fd363b 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/changedetection/state/InputPropertiesSerializer.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/changedetection/state/InputPropertiesSerializer.java
@@ -56,7 +56,7 @@
             return ImmutableSortedMap.of(decoder.readString(), readSnapshot(decoder));
         }
 
-        ImmutableSortedMap.Builder<String, ValueSnapshot> builder = ImmutableSortedMap.builder();
+        ImmutableSortedMap.Builder<String, ValueSnapshot> builder = ImmutableSortedMap.naturalOrder();
         for (int i = 0; i < size; i++) {
             builder.put(decoder.readString(), readSnapshot(decoder));
         }
