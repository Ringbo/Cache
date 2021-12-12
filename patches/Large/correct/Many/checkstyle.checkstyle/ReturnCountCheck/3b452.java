diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/ReturnCountCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/ReturnCountCheck.java
index 802fefc..60b75e9 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/ReturnCountCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/ReturnCountCheck.java
@@ -187,7 +187,7 @@
          * Creates new method context.
          * @param checking should we check this method or not.
          */
-        public Context(boolean checking) {
+        Context(boolean checking) {
             this.checking = checking;
             count = 0;
         }
