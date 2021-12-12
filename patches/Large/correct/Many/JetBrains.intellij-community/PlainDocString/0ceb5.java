diff --git a/python/src/com/jetbrains/python/documentation/docstrings/PlainDocString.java b/python/src/com/jetbrains/python/documentation/docstrings/PlainDocString.java
index b5c89f3..a94d492 100644
--- a/python/src/com/jetbrains/python/documentation/docstrings/PlainDocString.java
+++ b/python/src/com/jetbrains/python/documentation/docstrings/PlainDocString.java
@@ -37,7 +37,7 @@
     if (!isEmpty(0) && isEmptyOrDoesNotExist(1)) {
       mySummary = getLine(0).trim().toString();
       final int next = consumeEmptyLines(1);
-      if (next != 1) {
+      if (next != 1 && next < getLineCount()) {
         final String remaining = getLine(next).union(getLine(getLineCount() - 1)).toString();
         myDescription = PyIndentUtil.removeCommonIndent(remaining, false);
       }
