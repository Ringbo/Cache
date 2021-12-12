diff --git a/json/tests/test/com/jetbrains/jsonSchema/JsonSchemaCrossReferencesTest.java b/json/tests/test/com/jetbrains/jsonSchema/JsonSchemaCrossReferencesTest.java
index b69b4ae..9d4f45e 100644
--- a/json/tests/test/com/jetbrains/jsonSchema/JsonSchemaCrossReferencesTest.java
+++ b/json/tests/test/com/jetbrains/jsonSchema/JsonSchemaCrossReferencesTest.java
@@ -176,7 +176,7 @@
 
     if (delayAfterUpdate) {
       // give time for vfs callbacks to finish
-      Thread.sleep(200);
+      Thread.sleep(400);
     }
 
     doHighlighting();
