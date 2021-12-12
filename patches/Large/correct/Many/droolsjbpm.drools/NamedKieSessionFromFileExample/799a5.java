diff --git a/drools-examples-api/named-kiesession-from-file/src/main/java/org/drools/example/api/namedkiesessionfromfile/NamedKieSessionFromFileExample.java b/drools-examples-api/named-kiesession-from-file/src/main/java/org/drools/example/api/namedkiesessionfromfile/NamedKieSessionFromFileExample.java
index 3272e72..0d4fd14 100644
--- a/drools-examples-api/named-kiesession-from-file/src/main/java/org/drools/example/api/namedkiesessionfromfile/NamedKieSessionFromFileExample.java
+++ b/drools-examples-api/named-kiesession-from-file/src/main/java/org/drools/example/api/namedkiesessionfromfile/NamedKieSessionFromFileExample.java
@@ -65,7 +65,7 @@
             }
 
             for (String str : targetFolder.list()) {
-                if (str.startsWith(exampleName) && !str.endsWith("-sources.jar") && !str.endsWith("-tests.jar")) {
+                if (str.startsWith(exampleName) && !str.endsWith("-sources.jar") && !str.endsWith("-tests.jar") && !str.endsWith("-javadoc.jar")) {
                     return new File(targetFolder, str);
                 }
             }
