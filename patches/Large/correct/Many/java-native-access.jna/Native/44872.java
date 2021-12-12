diff --git a/jnalib/src/com/sun/jna/Native.java b/jnalib/src/com/sun/jna/Native.java
index 602003e..6619910 100644
--- a/jnalib/src/com/sun/jna/Native.java
+++ b/jnalib/src/com/sun/jna/Native.java
@@ -793,7 +793,7 @@
             }
             String msg = 
                 "Library '" + libName + "' was not found by class loader " + cl;
-            throw new IllegalArgumentException(msg);
+            throw new UnsatisfiedLinkError(msg);
         }
         catch (Exception e) {
             return null;
