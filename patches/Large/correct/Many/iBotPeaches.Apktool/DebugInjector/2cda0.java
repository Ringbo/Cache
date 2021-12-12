diff --git a/src/brut/androlib/src/DebugInjector.java b/src/brut/androlib/src/DebugInjector.java
index 1aa3089..e667e0e 100644
--- a/src/brut/androlib/src/DebugInjector.java
+++ b/src/brut/androlib/src/DebugInjector.java
@@ -40,7 +40,10 @@
 
     private void inject() throws AndrolibException {
         String definition = nextAndAppend();
-        if (definition.contains(" abstract ")) {
+        if (
+            definition.contains(" abstract ") ||
+            definition.contains(" native ")
+        ) {
             nextAndAppend();
             return;
         }
