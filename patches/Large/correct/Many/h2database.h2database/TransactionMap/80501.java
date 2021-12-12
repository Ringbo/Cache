diff --git a/h2/src/main/org/h2/mvstore/tx/TransactionMap.java b/h2/src/main/org/h2/mvstore/tx/TransactionMap.java
index 1c4e52f..936d94d 100644
--- a/h2/src/main/org/h2/mvstore/tx/TransactionMap.java
+++ b/h2/src/main/org/h2/mvstore/tx/TransactionMap.java
@@ -432,7 +432,7 @@
      *                               at the time when snapshot was taken
      * @return the value
      */
-    private VersionedValue getValue(Page root, Page undoRoot, K key, long maxLog,
+    VersionedValue getValue(Page root, Page undoRoot, K key, long maxLog,
                                     VersionedValue data, BitSet committingTransactions) {
         while (true) {
             if (data == null) {
