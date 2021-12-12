diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/DebugChecker.java b/src/test/java/com/puppycrawl/tools/checkstyle/DebugChecker.java
index e90276c..a062b14 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/DebugChecker.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/DebugChecker.java
@@ -8,7 +8,7 @@
 import com.puppycrawl.tools.checkstyle.api.CheckstyleException;
 
 class DebugChecker extends Checker {
-    public DebugChecker() {
+    DebugChecker() {
     }
 
     @Override
