diff --git a/js/js.inliner/src/org/jetbrains/kotlin/js/inline/JsInliner.java b/js/js.inliner/src/org/jetbrains/kotlin/js/inline/JsInliner.java
index 04e673d..59c7916 100644
--- a/js/js.inliner/src/org/jetbrains/kotlin/js/inline/JsInliner.java
+++ b/js/js.inliner/src/org/jetbrains/kotlin/js/inline/JsInliner.java
@@ -43,7 +43,7 @@
 
 public class JsInliner extends JsVisitorWithContextImpl {
 
-    private final IdentityHashMap<JsName, JsFunction> functions;
+    private final Map<JsName, JsFunction> functions;
     private final Stack<JsInliningContext> inliningContexts = new Stack<JsInliningContext>();
     private final Set<JsFunction> processedFunctions = CollectionUtilsKt.IdentitySet();
     private final Set<JsFunction> inProcessFunctions = CollectionUtilsKt.IdentitySet();
@@ -73,7 +73,7 @@
     }
 
     private JsInliner(
-            @NotNull IdentityHashMap<JsName, JsFunction> functions,
+            @NotNull Map<JsName, JsFunction> functions,
             @NotNull FunctionReader functionReader,
             @NotNull DiagnosticSink trace
     ) {
