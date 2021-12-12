diff --git a/src/share/classes/com/sun/btrace/BTraceRuntime.java b/src/share/classes/com/sun/btrace/BTraceRuntime.java
index 81d6874..f81143f 100755
--- a/src/share/classes/com/sun/btrace/BTraceRuntime.java
+++ b/src/share/classes/com/sun/btrace/BTraceRuntime.java
@@ -131,7 +131,7 @@
        private BTraceRuntime rt = null;
 
         boolean set(BTraceRuntime other) {
-            if (rt != null) return false;
+            if (rt != null && other != null) return false;
             rt = other;
             return true;
         }
