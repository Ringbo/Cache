diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/DebugChecker.java b/src/test/java/com/puppycrawl/tools/checkstyle/DebugChecker.java
index 0cbb1b1..e90276c 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/DebugChecker.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/DebugChecker.java
@@ -8,7 +8,7 @@
 import com.puppycrawl.tools.checkstyle.api.CheckstyleException;
 
 class DebugChecker extends Checker {
-    public DebugChecker() throws CheckstyleException {
+    public DebugChecker() {
     }
 
     @Override
