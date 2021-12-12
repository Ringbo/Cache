diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer.java
index a87dff7..fcfba10 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/std/StackTraceElementDeserializer.java
@@ -50,7 +50,8 @@
                     moduleName = p.getText();
                 } else if ("moduleVersion".equals(propName)) {
                     moduleVersion = p.getText();
-                } else if ("declaringClass".equals(propName)) {
+                } else if ("declaringClass".equals(propName)
+                        || "format".equals(propName)) {
                     // 01-Nov-2017: [databind#1794] Not sure if we should but... let's prune it for now
                     ;
                 } else {
