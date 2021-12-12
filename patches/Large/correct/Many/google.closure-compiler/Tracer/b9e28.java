diff --git a/src/com/google/javascript/jscomp/gwt/super/com/google/javascript/jscomp/Tracer.java b/src/com/google/javascript/jscomp/gwt/super/com/google/javascript/jscomp/Tracer.java
index d9e7ac4..3f8ded8 100644
--- a/src/com/google/javascript/jscomp/gwt/super/com/google/javascript/jscomp/Tracer.java
+++ b/src/com/google/javascript/jscomp/gwt/super/com/google/javascript/jscomp/Tracer.java
@@ -31,7 +31,7 @@
   static void clearCurrentThreadTrace() {}
 
   long stop() {
-    return System.currentTimeMillis() + start;
+    return System.currentTimeMillis() - start;
   }
 }
 
