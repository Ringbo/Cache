diff --git a/h2/src/main/org/h2/command/Parser.java b/h2/src/main/org/h2/command/Parser.java
index 1b66c8b..9f9d3b5 100644
--- a/h2/src/main/org/h2/command/Parser.java
+++ b/h2/src/main/org/h2/command/Parser.java
@@ -3561,7 +3561,7 @@
         } else {
             readIf("NULL");
         }
-        if (readIf("AUTO_INCREMENT")) {
+        if (readIf("AUTO_INCREMENT") || readIf("BIGSERIAL") || readIf("SERIAL")) {
             parseAutoIncrement(column);
             if (readIf("NOT")) {
                 read("NULL");
