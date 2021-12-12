diff --git a/subprojects/groovy-json/src/main/java/groovy/json/internal/CharBuf.java b/subprojects/groovy-json/src/main/java/groovy/json/internal/CharBuf.java
index fe9ec32..2b9c78b 100644
--- a/subprojects/groovy-json/src/main/java/groovy/json/internal/CharBuf.java
+++ b/subprojects/groovy-json/src/main/java/groovy/json/internal/CharBuf.java
@@ -410,7 +410,7 @@
 
         final byte[] _charTo = charTo;
         /* We are making a bet that not all chars will be unicode. */
-        int ensureThisMuch = charArray.length * 2 + 2;
+        int ensureThisMuch = charArray.length * 6 + 2;
 
         int sizeNeeded = (ensureThisMuch) + _location;
         if (sizeNeeded > capacity) {
