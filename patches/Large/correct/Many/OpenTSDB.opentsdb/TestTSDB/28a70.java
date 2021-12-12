diff --git a/test/core/TestTSDB.java b/test/core/TestTSDB.java
index 68ba755..97daa6c 100644
--- a/test/core/TestTSDB.java
+++ b/test/core/TestTSDB.java
@@ -345,9 +345,9 @@
     tsdb.addPoint("sys.cpu.user", 1356998400, 42, tags).joinUninterruptibly();
     final byte[] row = new byte[] { 0, 0, 1, 0x50, (byte) 0xE2, 0x27, 0, 
         0, 0, 1, 0, 0, 1};
-    final byte[] value = storage.getColumn(row, new byte[] { 0, 7 });
+    final byte[] value = storage.getColumn(row, new byte[] { 0, 0 });
     assertNotNull(value);
-    assertEquals(42, Bytes.getLong(value));
+    assertEquals(42, value[0]);
   }
   
   @Test
@@ -361,9 +361,9 @@
     }
     final byte[] row = new byte[] { 0, 0, 1, 0x50, (byte) 0xE2, 0x27, 0, 
         0, 0, 1, 0, 0, 1};
-    final byte[] value = storage.getColumn(row, new byte[] { 0, 7 });
+    final byte[] value = storage.getColumn(row, new byte[] { 0, 0 });
     assertNotNull(value);
-    assertEquals(1, Bytes.getLong(value));
+    assertEquals(1, value[0]);
     assertEquals(50, storage.numColumns(row));
   }
   
@@ -376,9 +376,9 @@
     final byte[] row = new byte[] { 0, 0, 1, 0x50, (byte) 0xE2, 0x27, 0, 
         0, 0, 1, 0, 0, 1};
     final byte[] value = storage.getColumn(row, new byte[] { (byte) 0xE0, 
-        (byte) 0xF7 });
+        (byte) 0xF0 });
     assertNotNull(value);
-    assertEquals(42, Bytes.getLong(value));
+    assertEquals(42, value[0]);
   }
   
   @Test
@@ -390,9 +390,9 @@
     tsdb.addPoint("sys.cpu.user", 1356998400, 24, tags).joinUninterruptibly();
     final byte[] row = new byte[] { 0, 0, 1, 0x50, (byte) 0xE2, 0x27, 0, 
         0, 0, 1, 0, 0, 1};
-    final byte[] value = storage.getColumn(row, new byte[] { 0, 7 });
+    final byte[] value = storage.getColumn(row, new byte[] { 0, 0 });
     assertNotNull(value);
-    assertEquals(24, Bytes.getLong(value));
+    assertEquals(24, value[0]);
   }
   
   @Test (expected = NoSuchUniqueName.class)
@@ -491,10 +491,10 @@
     tsdb.addPoint("sys.cpu.user", 1356998400, 42.5F, tags).joinUninterruptibly();
     final byte[] row = new byte[] { 0, 0, 1, 0x50, (byte) 0xE2, 0x27, 0, 
         0, 0, 1, 0, 0, 1};
-    byte[] value = storage.getColumn(row, new byte[] { 0, 7 });
+    byte[] value = storage.getColumn(row, new byte[] { 0, 0 });
     assertEquals(2, storage.numColumns(row));
     assertNotNull(value);
-    assertEquals(42, Bytes.getLong(value));
+    assertEquals(42, value[0]);
     value = storage.getColumn(row, new byte[] { 0, 11 });
     assertNotNull(value);
     // should have 7 digits of precision
