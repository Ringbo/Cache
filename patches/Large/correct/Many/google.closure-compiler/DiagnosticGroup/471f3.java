diff --git a/src/com/google/javascript/jscomp/DiagnosticGroup.java b/src/com/google/javascript/jscomp/DiagnosticGroup.java
index c03fac3..08c12b6 100644
--- a/src/com/google/javascript/jscomp/DiagnosticGroup.java
+++ b/src/com/google/javascript/jscomp/DiagnosticGroup.java
@@ -67,7 +67,7 @@
       Maps.newHashMap();
 
   /** Create a diagnostic group that matches only the given type. */
-  public static DiagnosticGroup forType(DiagnosticType type) {
+  public static synchronized DiagnosticGroup forType(DiagnosticType type) {
     if (!singletons.containsKey(type)) {
       singletons.put(type, new DiagnosticGroup(type));
     }
