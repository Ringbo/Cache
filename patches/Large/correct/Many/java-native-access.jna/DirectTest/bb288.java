diff --git a/test/com/sun/jna/DirectTest.java b/test/com/sun/jna/DirectTest.java
index 5f7a5cf..434ae00 100644
--- a/test/com/sun/jna/DirectTest.java
+++ b/test/com/sun/jna/DirectTest.java
@@ -232,7 +232,7 @@
         }
         else {
             b.putLong(0, Structure.FFIType.get(double.class).peer);
-            cif = Native.ffi_prep_cif(0, 1, Structure.FFIType.get(double.class).peer, types);
+            cif = Native.ffi_prep_cif(1, 1, Structure.FFIType.get(double.class).peer, types);
             resp = pb.peer + 8;
             argv = pb.peer + 16;
             double INPUT = 42;
