diff --git a/cas-server-core-util/src/main/java/org/jasig/cas/util/DefaultRandomStringGenerator.java b/cas-server-core-util/src/main/java/org/jasig/cas/util/DefaultRandomStringGenerator.java
index b440bddc..2c92377 100644
--- a/cas-server-core-util/src/main/java/org/jasig/cas/util/DefaultRandomStringGenerator.java
+++ b/cas-server-core-util/src/main/java/org/jasig/cas/util/DefaultRandomStringGenerator.java
@@ -74,7 +74,7 @@
      * @param random the random
      * @return the string
      */
-    private String convertBytesToString(final byte[] random) {
+    private static String convertBytesToString(final byte[] random) {
         final char[] output = new char[random.length];
         for (int i = 0; i < random.length; i++) {
             final int index = Math.abs(random[i] % PRINTABLE_CHARACTERS.length);
