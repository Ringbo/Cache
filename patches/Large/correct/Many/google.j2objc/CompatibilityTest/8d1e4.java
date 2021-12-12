diff --git a/protobuf/tests/CompatibilityTest.java b/protobuf/tests/CompatibilityTest.java
index 7a6844c..59f7019 100644
--- a/protobuf/tests/CompatibilityTest.java
+++ b/protobuf/tests/CompatibilityTest.java
@@ -1314,11 +1314,11 @@
   }
 
   public void testByteStringSubstring() throws Exception {
-    ByteString bs1 = ByteString.copyFrom("abcdefghijklmnop".getBytes());
+    ByteString bs1 = ByteString.copyFrom("abcdefghijklmnop".getBytes("UTF-8"));
     ByteString bs2 = bs1.substring(1, 15);
-    assertEquals("bcdefghijklmno", new String(bs2.toByteArray()));
+    assertEquals("bcdefghijklmno", new String(bs2.toByteArray(), "UTF-8"));
     ByteString bs3 = bs1.substring(12);
-    assertEquals("mnop", new String(bs3.toByteArray()));
+    assertEquals("mnop", new String(bs3.toByteArray(), "UTF-8"));
     ByteString bs4 = bs1.substring(11, 11);
     assertTrue(bs4.isEmpty());
     expectSubstringIndexOutOfBounds(bs1, -1, 1);
