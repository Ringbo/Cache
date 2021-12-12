diff --git a/drools-examples-api/default-kiesession-from-file/src/test/java/org/drools/example/api/defaultkiesessionfromfile/DefaultKieSessionFromByteArrayExampleTest.java b/drools-examples-api/default-kiesession-from-file/src/test/java/org/drools/example/api/defaultkiesessionfromfile/DefaultKieSessionFromByteArrayExampleTest.java
index 64dbd97..c75a8be 100644
--- a/drools-examples-api/default-kiesession-from-file/src/test/java/org/drools/example/api/defaultkiesessionfromfile/DefaultKieSessionFromByteArrayExampleTest.java
+++ b/drools-examples-api/default-kiesession-from-file/src/test/java/org/drools/example/api/defaultkiesessionfromfile/DefaultKieSessionFromByteArrayExampleTest.java
@@ -104,7 +104,7 @@
             }
 
             for (String str : targetFolder.list()) {
-                if (str.startsWith(exampleName) && !str.endsWith("-sources.jar") && !str.endsWith("-tests.jar")) {
+                if (str.startsWith(exampleName) && !str.endsWith("-sources.jar") && !str.endsWith("-tests.jar") && !str.endsWith("-javadoc.jar")) {
                     return new File(targetFolder, str);
                 }
             }
