diff --git a/guava/src/com/google/common/collect/ImmutableMap.java b/guava/src/com/google/common/collect/ImmutableMap.java
index 52f5477..8a8c771 100644
--- a/guava/src/com/google/common/collect/ImmutableMap.java
+++ b/guava/src/com/google/common/collect/ImmutableMap.java
@@ -301,7 +301,7 @@
   }
 
   private static <K extends Enum<K>, V> ImmutableMap<K, V> copyOfEnumMap(
-      Map<K, ? extends V> original) {
+      EnumMap<K, ? extends V> original) {
     EnumMap<K, V> copy = new EnumMap<K, V>(original);
     for (Map.Entry<?, ?> entry : copy.entrySet()) {
       checkEntryNotNull(entry.getKey(), entry.getValue());
