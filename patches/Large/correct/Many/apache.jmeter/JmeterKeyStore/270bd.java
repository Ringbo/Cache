diff --git a/src/core/org/apache/jmeter/util/keystore/JmeterKeyStore.java b/src/core/org/apache/jmeter/util/keystore/JmeterKeyStore.java
index 72360b5..ad7c95d 100644
--- a/src/core/org/apache/jmeter/util/keystore/JmeterKeyStore.java
+++ b/src/core/org/apache/jmeter/util/keystore/JmeterKeyStore.java
@@ -140,7 +140,7 @@
         if (length == 0) { // i.e. is == null
             return null;
         }
-        return this.names[getNextIndex(length)];
+        return this.names[getIndexAndIncrement(length)];
     }
 
     public int getAliasCount() {
@@ -200,13 +200,17 @@
         return -1;
     }
 
-    private int getNextIndex(int length) {
+    /**
+     * Gets current index and increment by rolling if index is equal to length
+     * @param length Number of keys to roll
+     */
+    private int getIndexAndIncrement(int length) {
         synchronized(this) {
-            last_user ++;
+            int result = last_user++;
             if (last_user >= length) {
                 last_user = 0;
             }
-            return last_user;
+            return result;
         }
     }
 
