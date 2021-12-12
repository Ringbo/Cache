diff --git a/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/test/CompressedOopTest.java b/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/test/CompressedOopTest.java
index c427537..05b27d4 100644
--- a/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/test/CompressedOopTest.java
+++ b/graal/com.oracle.graal.hotspot.test/src/com/oracle/graal/hotspot/test/CompressedOopTest.java
@@ -306,7 +306,7 @@
         return result;
     }
 
-    public static void compareAndSwapTest(Object c1, Object c2, Object c3) {
+    public static void compareAndSwapTest(Object c1, Object c2, Object c3) throws ClassCastException{
         @SuppressWarnings("unchecked")
         AtomicReference<Object> cas = (AtomicReference<Object>) c1;
         cas.compareAndSet(c2, c3);
