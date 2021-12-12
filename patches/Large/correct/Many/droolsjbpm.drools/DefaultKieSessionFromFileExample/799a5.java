diff --git a/drools-examples-api/default-kiesession-from-file/src/main/java/org/drools/example/api/defaultkiesessionfromfile/DefaultKieSessionFromFileExample.java b/drools-examples-api/default-kiesession-from-file/src/main/java/org/drools/example/api/defaultkiesessionfromfile/DefaultKieSessionFromFileExample.java
index c2d4490..5b705d3 100644
--- a/drools-examples-api/default-kiesession-from-file/src/main/java/org/drools/example/api/defaultkiesessionfromfile/DefaultKieSessionFromFileExample.java
+++ b/drools-examples-api/default-kiesession-from-file/src/main/java/org/drools/example/api/defaultkiesessionfromfile/DefaultKieSessionFromFileExample.java
@@ -65,7 +65,7 @@
             }
 
             for (String str : targetFolder.list()) {
-                if (str.startsWith(exampleName) && !str.endsWith("-sources.jar") && !str.endsWith("-tests.jar")) {
+                if (str.startsWith(exampleName) && !str.endsWith("-sources.jar") && !str.endsWith("-tests.jar") && !str.endsWith("-javadoc.jar")) {
                     return new File(targetFolder, str);
                 }
             }
