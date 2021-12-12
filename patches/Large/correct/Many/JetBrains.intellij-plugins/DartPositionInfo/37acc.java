diff --git a/Dart/src/com/jetbrains/lang/dart/ide/runner/DartPositionInfo.java b/Dart/src/com/jetbrains/lang/dart/ide/runner/DartPositionInfo.java
index bbb6278..6aea90b 100644
--- a/Dart/src/com/jetbrains/lang/dart/ide/runner/DartPositionInfo.java
+++ b/Dart/src/com/jetbrains/lang/dart/ide/runner/DartPositionInfo.java
@@ -83,7 +83,7 @@
     final int pathStartIndexInUrl = type == Type.FILE
                                     ? colonIndexInUrl + 1 + getPathStartIndex(url.substring(colonIndexInUrl + 1))
                                     : colonIndexInUrl + 1;
-    final String path = url.substring(pathStartIndexInUrl, url.length());
+    final String path = url.substring(pathStartIndexInUrl);
 
     final int line = lineAndColumn == null ? -1 : lineAndColumn.first >= 0 ? lineAndColumn.first - 1 : lineAndColumn.first;
     final int column = lineAndColumn == null ? -1 : lineAndColumn.second >= 0 ? lineAndColumn.second - 1 : lineAndColumn.second;
