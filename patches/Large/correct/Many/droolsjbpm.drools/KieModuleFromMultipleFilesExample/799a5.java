diff --git a/drools-examples-api/kie-module-from-multiple-files/src/main/java/org/drools/example/api/kiemodulefrommultiplefiles/KieModuleFromMultipleFilesExample.java b/drools-examples-api/kie-module-from-multiple-files/src/main/java/org/drools/example/api/kiemodulefrommultiplefiles/KieModuleFromMultipleFilesExample.java
index 61cda48..a9e7f63 100644
--- a/drools-examples-api/kie-module-from-multiple-files/src/main/java/org/drools/example/api/kiemodulefrommultiplefiles/KieModuleFromMultipleFilesExample.java
+++ b/drools-examples-api/kie-module-from-multiple-files/src/main/java/org/drools/example/api/kiemodulefrommultiplefiles/KieModuleFromMultipleFilesExample.java
@@ -73,7 +73,7 @@
             }
 
             for (String str : targetFolder.list()) {
-                if (str.startsWith(exampleName) && !str.endsWith("-sources.jar") && !str.endsWith("-tests.jar")) {
+                if (str.startsWith(exampleName) && !str.endsWith("-sources.jar") && !str.endsWith("-tests.jar") && !str.endsWith("-javadoc.jar")) {
                     return new File(targetFolder, str);
                 }
             }
