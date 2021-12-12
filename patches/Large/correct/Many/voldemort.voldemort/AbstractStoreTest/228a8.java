diff --git a/test/unit/voldemort/store/AbstractStoreTest.java b/test/unit/voldemort/store/AbstractStoreTest.java
index 3587ed4..05a6914 100644
--- a/test/unit/voldemort/store/AbstractStoreTest.java
+++ b/test/unit/voldemort/store/AbstractStoreTest.java
@@ -73,7 +73,7 @@
     }
 
     protected void assertEquals(String message, Versioned<V> v1, Versioned<V> v2) {
-        assertEquals(v1, v2);
+        assertEquals(message, v1, v2);
     }
 
     protected void assertEquals(Versioned<V> v1, Versioned<V> v2) {
