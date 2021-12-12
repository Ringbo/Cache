diff --git a/jnalib/test/com/sun/jna/examples/win32/Netapi32Test.java b/jnalib/test/com/sun/jna/examples/win32/Netapi32Test.java
index f760af3..73a37e6 100644
--- a/jnalib/test/com/sun/jna/examples/win32/Netapi32Test.java
+++ b/jnalib/test/com/sun/jna/examples/win32/Netapi32Test.java
@@ -35,7 +35,7 @@
     	assertTrue(lpNameBuffer.getValue().getString(0).length() > 0);
     	assertTrue(bufferType.getValue() > 0);
     	assertEquals(W32Errors.ERROR_SUCCESS, Netapi32.INSTANCE.NetApiBufferFree(
-    			lpNameBuffer.getPointer()));
+    			lpNameBuffer.getValue()));
     }
     
 }
