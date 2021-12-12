diff --git a/src/com/google/debugging/sourcemap/SourceMapConsumerV3.java b/src/com/google/debugging/sourcemap/SourceMapConsumerV3.java
index d53da5e..ba8dc74 100644
--- a/src/com/google/debugging/sourcemap/SourceMapConsumerV3.java
+++ b/src/com/google/debugging/sourcemap/SourceMapConsumerV3.java
@@ -243,7 +243,7 @@
       this.content = new StringCharIterator(lineMap);
     }
 
-    void build() {
+    void build() throws SourceMapParseException {
       int [] temp = new int[MAX_ENTRY_VALUES];
       ArrayList<Entry> entries = new ArrayList<>();
       while (content.hasNext()) {
@@ -309,7 +309,7 @@
      * @param entryValues The number of entries in the array.
      * @return The entry object.
      */
-    private Entry decodeEntry(int[] vals, int entryValues) {
+    private Entry decodeEntry(int[] vals, int entryValues) throws SourceMapParseException {
       Entry entry;
       switch (entryValues) {
         // The first values, if present are in the following order:
@@ -363,7 +363,7 @@
           return entry;
 
         default:
-          throw new IllegalStateException(
+          throw new SourceMapParseException(
               "Unexpected number of values for entry:" + entryValues);
       }
     }
