diff --git a/hazelcast/src/main/java/com/hazelcast/nio/UTFEncoderDecoder.java b/hazelcast/src/main/java/com/hazelcast/nio/UTFEncoderDecoder.java
index d9a3e2c..e7c5530 100644
--- a/hazelcast/src/main/java/com/hazelcast/nio/UTFEncoderDecoder.java
+++ b/hazelcast/src/main/java/com/hazelcast/nio/UTFEncoderDecoder.java
@@ -152,14 +152,14 @@
             implements StringValueArrayProviderFactory {
 
         private static long stringValueFieldOffset = -1;
-        private static sun.misc.Unsafe UNSAFE;
+        private static sun.misc.Unsafe unsafe;
 
         static {
             if (UnsafeHelper.UNSAFE_AVAILABLE) {
-                UNSAFE = UnsafeHelper.UNSAFE;
+                unsafe = UnsafeHelper.UNSAFE;
                 try {
                     stringValueFieldOffset =
-                            UNSAFE.objectFieldOffset(String.class.getDeclaredField("value"));
+                            unsafe.objectFieldOffset(String.class.getDeclaredField("value"));
                 } catch (Throwable t) {
 
                 }
@@ -168,12 +168,12 @@
 
         @Override
         public StringValueArrayProvider create(String str) {
-            return new UnsafeBasedStringCharProvider(UNSAFE, stringValueFieldOffset, str);
+            return new UnsafeBasedStringCharProvider(unsafe, stringValueFieldOffset, str);
         }
 
         @Override
         public boolean isAvailable() {
-            return UNSAFE != null && stringValueFieldOffset != -1;
+            return unsafe != null && stringValueFieldOffset != -1;
         }
 
     }
