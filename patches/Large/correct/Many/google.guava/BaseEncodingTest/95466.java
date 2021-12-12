diff --git a/guava-gwt/test-super/com/google/common/io/super/com/google/common/io/BaseEncodingTest.java b/guava-gwt/test-super/com/google/common/io/super/com/google/common/io/BaseEncodingTest.java
index 9278e70..cbfa51f 100644
--- a/guava-gwt/test-super/com/google/common/io/super/com/google/common/io/BaseEncodingTest.java
+++ b/guava-gwt/test-super/com/google/common/io/super/com/google/common/io/BaseEncodingTest.java
@@ -37,7 +37,7 @@
  */
 @GwtCompatible(emulated = true)
 public class BaseEncodingTest extends TestCase {
-  public void assertEquals(byte[] expected, byte[] actual) {
+  public static void assertEquals(byte[] expected, byte[] actual) {
     assertEquals(expected.length, actual.length);
     for (int i = 0; i < expected.length; i++) {
       assertEquals(expected[i], actual[i]);
@@ -237,16 +237,18 @@
   }
 
   public void testBase16UpperCaseIsNoOp() {
-    assertSame(base16().upperCase(), base16().upperCase());
+    assertSame(base16(), base16().upperCase());
   }
 
-  private void testEncodingWithCasing(BaseEncoding encoding, String decoded, String encoded) {
+  private static void testEncodingWithCasing(
+      BaseEncoding encoding, String decoded, String encoded) {
     testEncodingWithSeparators(encoding, decoded, encoded);
     testEncodingWithSeparators(encoding.upperCase(), decoded, Ascii.toUpperCase(encoded));
     testEncodingWithSeparators(encoding.lowerCase(), decoded, Ascii.toLowerCase(encoded));
   }
 
-  private void testEncodingWithSeparators(BaseEncoding encoding, String decoded, String encoded) {
+  private static void testEncodingWithSeparators(
+      BaseEncoding encoding, String decoded, String encoded) {
     testEncoding(encoding, decoded, encoded);
 
     // test separators work
@@ -258,14 +260,15 @@
     }
   }
 
-  private void testEncoding(BaseEncoding encoding, String decoded, String encoded) {
+  private static void testEncoding(BaseEncoding encoding, String decoded, String encoded) {
     testEncodes(encoding, decoded, encoded);
     testDecodes(encoding, encoded, decoded);
   }
 
-  private void testEncodes(BaseEncoding encoding, String decoded, String encoded) {
+  private static void testEncodes(BaseEncoding encoding, String decoded, String encoded) {
     byte[] bytes;
     try {
+      // GWT does not support String.getBytes(Charset)
       bytes = decoded.getBytes("UTF-8");
     } catch (UnsupportedEncodingException e) {
       throw new AssertionError();
@@ -273,9 +276,10 @@
     assertEquals(encoded, encoding.encode(bytes));
   }
 
-  private void testDecodes(BaseEncoding encoding, String encoded, String decoded) {
+  private static void testDecodes(BaseEncoding encoding, String encoded, String decoded) {
     byte[] bytes;
     try {
+      // GWT does not support String.getBytes(Charset)
       bytes = decoded.getBytes("UTF-8");
     } catch (UnsupportedEncodingException e) {
       throw new AssertionError();
@@ -283,7 +287,7 @@
     assertEquals(bytes, encoding.decode(encoded));
   }
 
-  private void assertFailsToDecode(BaseEncoding encoding, String cannotDecode) {
+  private static void assertFailsToDecode(BaseEncoding encoding, String cannotDecode) {
     try {
       encoding.decode(cannotDecode);
       fail("Expected IllegalArgumentException");
