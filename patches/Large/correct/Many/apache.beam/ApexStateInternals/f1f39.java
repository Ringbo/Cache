diff --git a/runners/apex/src/main/java/org/apache/beam/runners/apex/translation/utils/ApexStateInternals.java b/runners/apex/src/main/java/org/apache/beam/runners/apex/translation/utils/ApexStateInternals.java
index 18ea8e4..e23601d 100644
--- a/runners/apex/src/main/java/org/apache/beam/runners/apex/translation/utils/ApexStateInternals.java
+++ b/runners/apex/src/main/java/org/apache/beam/runners/apex/translation/utils/ApexStateInternals.java
@@ -431,7 +431,7 @@
     /**
      * Serializable state for internals (namespace to state tag to coded value).
      */
-    private Map<Slice, Table<String, String, byte[]>> perKeyState = new HashMap<>();
+    private Map<Slice, HashBasedTable<String, String, byte[]>> perKeyState = new HashMap<>();
     private final Coder<K> keyCoder;
 
     private ApexStateInternalsFactory(Coder<K> keyCoder) {
@@ -451,7 +451,7 @@
       } catch (CoderException e) {
         throw new RuntimeException(e);
       }
-      Table<String, String, byte[]> stateTable = perKeyState.get(keyBytes);
+      HashBasedTable<String, String, byte[]> stateTable = perKeyState.get(keyBytes);
       if (stateTable == null) {
         stateTable = HashBasedTable.create();
         perKeyState.put(keyBytes, stateTable);
