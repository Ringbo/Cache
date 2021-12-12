diff --git a/dexlib/src/main/java/org/jf/dexlib/HeaderItem.java b/dexlib/src/main/java/org/jf/dexlib/HeaderItem.java
index b395ef1..57e0a13 100644
--- a/dexlib/src/main/java/org/jf/dexlib/HeaderItem.java
+++ b/dexlib/src/main/java/org/jf/dexlib/HeaderItem.java
@@ -68,7 +68,7 @@
         for (int i=0; i<MAGIC_VALUES.length; i++) {
             byte[] magic_value = MAGIC_VALUES[i];
             boolean matched = true;
-            for (int j=0; j<8; i++) {
+            for (int j=0; j<8; j++) {
                 if (magic_value[j] != readMagic[j]) {
                     matched = false;
                     break;
