diff --git a/tools/validator/src/main/java/org/apache/cxf/tools/validator/internal/WSIBPValidator.java b/tools/validator/src/main/java/org/apache/cxf/tools/validator/internal/WSIBPValidator.java
index e042087..2f3b612 100644
--- a/tools/validator/src/main/java/org/apache/cxf/tools/validator/internal/WSIBPValidator.java
+++ b/tools/validator/src/main/java/org/apache/cxf/tools/validator/internal/WSIBPValidator.java
@@ -351,7 +351,7 @@
                 }
                 if (operation.getOutput() != null && operation.getOutput().getMessage() != null) {
                     Message outMess = operation.getOutput().getMessage();
-                    Set<String> ignorableParts = getIgnorableParts(bop.getBindingInput());
+                    Set<String> ignorableParts = getIgnorableParts(bop.getBindingOutput());
 
                     for (Iterator<?> ite3 = outMess.getParts().values().iterator(); ite3.hasNext();) {
                         Part p = (Part)ite3.next();
