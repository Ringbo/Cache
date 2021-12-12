diff --git a/h2/src/main/org/h2/command/Parser.java b/h2/src/main/org/h2/command/Parser.java
index 7dd2f8b..c8b7b46 100644
--- a/h2/src/main/org/h2/command/Parser.java
+++ b/h2/src/main/org/h2/command/Parser.java
@@ -1674,7 +1674,7 @@
                     read("RR");
                 }
                 command.setForUpdate(true);
-            } else if (readIf("READ")) {
+            } else if (readIf("READ") || readIf("FETCH")) {
                 read("ONLY");
                 if (readIf("WITH")) {
                     read("RS");
