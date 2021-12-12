diff --git a/src/test/groovy/lang/IntRangeTest.java b/src/test/groovy/lang/IntRangeTest.java
index 69d40b4..eeff7d4 100644
--- a/src/test/groovy/lang/IntRangeTest.java
+++ b/src/test/groovy/lang/IntRangeTest.java
@@ -57,11 +57,11 @@
 
     public void testSize() {
         IntRange r = createRange(0, 10);
-        assertEquals("Size of " + r, 10, r.size());
+        assertEquals("Size of " + r, 11, r.size());
         r = createRange(0, 1);
-        assertEquals("Size of " + r, 1, r.size());
+        assertEquals("Size of " + r, 2, r.size());
         r = createRange(0, 0);
-        assertEquals("Size of " + r, 0, r.size());
+        assertEquals("Size of " + r, 1, r.size());
     }
 
     public void testProperties() {
@@ -72,7 +72,7 @@
 
     public void testGet() {
         IntRange r = createRange(10, 20);
-        for (int i = 0; i < 10; i++) {
+        for (int i = 0; i <= 10; i++) {
             Integer value = (Integer) r.get(i);
             assertEquals("Item at index: " + i, i + 10, value.intValue());
         }
@@ -89,7 +89,7 @@
             // worked
         }
         try {
-            r.get(10);
+            r.get(11);
             fail("Should have thrown IndexOut");
         }
         catch (IndexOutOfBoundsException e) {
@@ -105,7 +105,7 @@
         assertTrue("contains 10", r.contains(new Integer(10)));
         assertTrue("contains 19", r.contains(new Integer(19)));
         assertFalse("contains 9", r.contains(new Integer(9)));
-        assertFalse("contains 20", r.contains(new Integer(20)));
+        assertFalse("contains 21", r.contains(new Integer(20)));
         assertFalse("contains 100", r.contains(new Integer(100)));
         assertFalse("contains -1", r.contains(new Integer(-1)));
     }
@@ -120,7 +120,7 @@
         IntRange sr = (IntRange) s;
 
         assertEquals("from", 12, sr.getFromInt());
-        assertEquals("to", 14, sr.getToInt());
+        assertEquals("to", 13, sr.getToInt());
         assertEquals("size", 2, sr.size());
     }
 
