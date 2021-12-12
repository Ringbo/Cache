diff --git a/src/com/google/javascript/jscomp/Tracer.java b/src/com/google/javascript/jscomp/Tracer.java
index 6e19504..a3b0d7e 100644
--- a/src/com/google/javascript/jscomp/Tracer.java
+++ b/src/com/google/javascript/jscomp/Tracer.java
@@ -967,7 +967,7 @@
 
   /** Remove any ThreadTrace associated with the current thread */
   static void clearThreadTrace() {
-    traces.set(null);
+    traces.remove();
   }
 
   /**
