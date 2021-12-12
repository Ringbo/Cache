diff --git a/test/com/sun/jna/NativeTest.java b/test/com/sun/jna/NativeTest.java
index bb8c5fe..8345d0a 100644
--- a/test/com/sun/jna/NativeTest.java
+++ b/test/com/sun/jna/NativeTest.java
@@ -61,7 +61,7 @@
                 Method m = Native.class.getMethod("loadLibrary", paramTypes);
                 Class<?> returnType = m.getReturnType();
                 signature.append(Native.getSignature(returnType));
-                assertSame("Mismatched return type for signature=" + signature, Object.class, returnType);
+                assertSame("Mismatched return type for signature=" + signature, Library.class, returnType);
 //                System.out.println("===>" + m.getName() + ": " + signature);
             } catch(NoSuchMethodError err) {
                 fail("No method for signature=" + signature);
