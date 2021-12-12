diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/dictionary/StringOffHeapMutableDictionary.java b/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/dictionary/StringOffHeapMutableDictionary.java
index 94bfdbc..54e91ac 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/dictionary/StringOffHeapMutableDictionary.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/realtime/impl/dictionary/StringOffHeapMutableDictionary.java
@@ -49,7 +49,7 @@
 
   @Override
   public Object get(int dictionaryId) {
-    return new String(_byteStore.get(dictionaryId));
+    return new String(_byteStore.get(dictionaryId), UTF_8);
   }
 
   @Override
@@ -71,7 +71,7 @@
   }
 
   private String getInternal(int dictId) {
-    return new String(_byteStore.get(dictId));
+    return new String(_byteStore.get(dictId), UTF_8);
   }
 
   @Override
@@ -127,7 +127,7 @@
     String[] sortedValues = new String[numValues];
 
     for (int i = 0; i < numValues; i++) {
-      sortedValues[i] = new String(getInternal(i));
+      sortedValues[i] = getInternal(i);
     }
 
     Arrays.sort(sortedValues);
