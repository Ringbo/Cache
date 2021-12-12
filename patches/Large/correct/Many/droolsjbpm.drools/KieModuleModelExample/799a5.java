diff --git a/drools-examples-api/kiemodulemodel-example/src/main/java/org/drools/example/api/kiemodulemodel/KieModuleModelExample.java b/drools-examples-api/kiemodulemodel-example/src/main/java/org/drools/example/api/kiemodulemodel/KieModuleModelExample.java
index 73fcc09..141d0ee 100644
--- a/drools-examples-api/kiemodulemodel-example/src/main/java/org/drools/example/api/kiemodulemodel/KieModuleModelExample.java
+++ b/drools-examples-api/kiemodulemodel-example/src/main/java/org/drools/example/api/kiemodulemodel/KieModuleModelExample.java
@@ -110,7 +110,7 @@
             }
 
             for (String str : targetFolder.list()) {
-                if (str.startsWith(exampleName) && !str.endsWith("-sources.jar") && !str.endsWith("-tests.jar")) {
+                if (str.startsWith(exampleName) && !str.endsWith("-sources.jar") && !str.endsWith("-tests.jar") && !str.endsWith("-javadoc.jar")) {
                     return new File(targetFolder, str);
                 }
             }
