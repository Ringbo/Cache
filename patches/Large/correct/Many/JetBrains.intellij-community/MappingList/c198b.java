diff --git a/platform/script-debugger/backend/src/org/jetbrains/debugger/sourcemap/MappingList.java b/platform/script-debugger/backend/src/org/jetbrains/debugger/sourcemap/MappingList.java
index 5d5aa81..0381985 100644
--- a/platform/script-debugger/backend/src/org/jetbrains/debugger/sourcemap/MappingList.java
+++ b/platform/script-debugger/backend/src/org/jetbrains/debugger/sourcemap/MappingList.java
@@ -68,7 +68,8 @@
         }
         else {
           MappingEntry nextMapping = getNextOnTheSameLine(middle, false);
-          if (nextMapping == null) {
+          // https://code.google.com/p/google-web-toolkit/issues/detail?id=9103
+          if (nextMapping == null || column > getColumn(nextMapping)) {
             return middle;
           }
           else {
