diff --git a/tightdb-java-test/src/test/java/com/tightdb/JNIViewTest.java b/tightdb-java-test/src/test/java/com/tightdb/JNIViewTest.java
index 5918c74..4a27f38 100644
--- a/tightdb-java-test/src/test/java/com/tightdb/JNIViewTest.java
+++ b/tightdb-java-test/src/test/java/com/tightdb/JNIViewTest.java
@@ -119,7 +119,7 @@
 
         byte[] arr1 = new byte[] {1,2,3};
         table.add(arr1);
-        assertArrayEquals(arr1, table.getBinaryByteArray(0, 0));
+        assertEquals(arr1, table.getBinaryByteArray(0, 0));
 
         TableView view = table.where().findAll();
 
@@ -127,7 +127,7 @@
 
         view.setBinaryByteArray(0, 0, arr2);
 
-        assertArrayEquals(arr2, view.getBinaryByteArray(0, 0));
+        assertEquals(arr2, view.getBinaryByteArray(0, 0));
     }
     
     
