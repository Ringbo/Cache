diff --git a/jnalib/src/com/sun/jna/Function.java b/jnalib/src/com/sun/jna/Function.java
index 44dc5bb..d632b6c 100644
--- a/jnalib/src/com/sun/jna/Function.java
+++ b/jnalib/src/com/sun/jna/Function.java
@@ -374,7 +374,7 @@
             result = invokeObject(callingConvention, args);
             if (result != null
                 && !returnType.isAssignableFrom(result.getClass())) {
-                throw new IllegalArgumentException("Return type " + returnType
+                throw new ClassCastException("Return type " + returnType
                                                    + " does not match result "
                                                    + result.getClass());
             }
