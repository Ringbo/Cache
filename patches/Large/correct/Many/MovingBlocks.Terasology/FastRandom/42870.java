diff --git a/src/main/java/org/terasology/utilities/procedural/FastRandom.java b/src/main/java/org/terasology/utilities/procedural/FastRandom.java
index ba88970..6fa29d0 100644
--- a/src/main/java/org/terasology/utilities/procedural/FastRandom.java
+++ b/src/main/java/org/terasology/utilities/procedural/FastRandom.java
@@ -153,7 +153,7 @@
     public String randomCharacterString(int length) {
         char[] randomChars = new char[length];
         for (int i = 0; i < length; i++) {
-            randomChars[i] = VALID_CHARS[randomInt(VALID_CHARS.length)];
+            randomChars[i] = VALID_CHARS[randomIntAbs(VALID_CHARS.length)];
         }
         return new String(randomChars);
     }
