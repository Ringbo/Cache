diff --git a/jnalib/src/com/sun/jna/CallbackReference.java b/jnalib/src/com/sun/jna/CallbackReference.java
index 4f79221..a37376f 100644
--- a/jnalib/src/com/sun/jna/CallbackReference.java
+++ b/jnalib/src/com/sun/jna/CallbackReference.java
@@ -154,7 +154,7 @@
         if (m.getParameterTypes().length > Function.MAX_NARGS) {
             String msg = "Method signature exceeds the maximum "
                 + "parameter count: " + m;
-            throw new IllegalArgumentException(msg);
+            throw new UnsupportedOperationException(msg);
         }
         return m;
     }
