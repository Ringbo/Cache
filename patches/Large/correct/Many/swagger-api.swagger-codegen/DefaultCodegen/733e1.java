diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java
index efc0aa3..89cf238 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java
@@ -584,7 +584,7 @@
                 }
             }
             // interfaces (intermediate models)
-            if (allDefinitions != null) {
+            if (allDefinitions != null && composed.getInterfaces() != null) {
                 for (RefModel _interface : composed.getInterfaces()) {
                     final String interfaceRef = toModelName(_interface.getSimpleRef());
                     final Model interfaceModel = allDefinitions.get(interfaceRef);
