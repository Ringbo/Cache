diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/std/StdDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/deser/std/StdDeserializer.java
index 9435443..19f05d0 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/std/StdDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/std/StdDeserializer.java
@@ -565,7 +565,7 @@
             }
             switch (text.charAt(0)) {
             case 'I':
-                if (_isNegInf(text)) {
+                if (_isPosInf(text)) {
                     return Float.POSITIVE_INFINITY;
                 }
                 break;
@@ -573,7 +573,7 @@
                 if (_isNaN(text)) { return Float.NaN; }
                 break;
             case '-':
-                if (_isPosInf(text)) {
+                if (_isNegInf(text)) {
                     return Float.NEGATIVE_INFINITY;
                 }
                 break;
