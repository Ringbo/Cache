diff --git a/EDIDE/src/ru/compscicenter/edide/course/TaskFile.java b/EDIDE/src/ru/compscicenter/edide/course/TaskFile.java
index 2f6ff72..b831aa0 100644
--- a/EDIDE/src/ru/compscicenter/edide/course/TaskFile.java
+++ b/EDIDE/src/ru/compscicenter/edide/course/TaskFile.java
@@ -168,7 +168,7 @@
    */
   public void updateLine(int lineChange, int line, int newEndOffsetInLine, int oldEndOffsetInLine) {
     for (TaskWindow w : taskWindows) {
-      if ((w.getLine() == line) && (w.getStart() > oldEndOffsetInLine)) {
+      if ((w.getLine() == line) && (w.getStart() >= oldEndOffsetInLine)) {
         int distance = w.getStart() - oldEndOffsetInLine;
         w.setStart(distance + newEndOffsetInLine);
         w.setLine(line + lineChange);
