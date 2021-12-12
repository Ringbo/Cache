diff --git a/ninja-core/src/main/java/ninja/NinjaDefault.java b/ninja-core/src/main/java/ninja/NinjaDefault.java
index 1b3fa6e..6229fc8 100644
--- a/ninja-core/src/main/java/ninja/NinjaDefault.java
+++ b/ninja-core/src/main/java/ninja/NinjaDefault.java
@@ -176,7 +176,6 @@
         
     }
     
-    // TO-BE-EVENTUALLY-ADDED-TO-NINJA-DEFAULT-IF-FOLKS-LIKE-THIS
     public Result getRenderingExceptionResult(Context context, RenderingException exception) {
         
         if (isDiagnosticsEnabled()) {
@@ -356,7 +355,7 @@
             DiagnosticError diagnosticError =
                 DiagnosticErrorBuilder.build403ForbiddenDiagnosticError();
             
-            return Results.unauthorized().render(diagnosticError);
+            return Results.forbidden().render(diagnosticError);
             
         }
         
