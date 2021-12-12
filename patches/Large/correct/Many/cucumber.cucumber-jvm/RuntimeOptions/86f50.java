diff --git a/core/src/main/java/cucumber/runtime/RuntimeOptions.java b/core/src/main/java/cucumber/runtime/RuntimeOptions.java
index 4e681e9..8f7aa52 100644
--- a/core/src/main/java/cucumber/runtime/RuntimeOptions.java
+++ b/core/src/main/java/cucumber/runtime/RuntimeOptions.java
@@ -47,7 +47,7 @@
         }
     }
 
-    private void parse(ArrayList<String> args) {
+    private void parse(List<String> args) {
         FormatterConverter formatterConverter = new FormatterConverter();
 
         while (!args.isEmpty()) {
