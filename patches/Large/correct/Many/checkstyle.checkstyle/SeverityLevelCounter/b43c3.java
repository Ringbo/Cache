diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/api/SeverityLevelCounter.java b/src/main/java/com/puppycrawl/tools/checkstyle/api/SeverityLevelCounter.java
index 767ef08..07040d3 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/api/SeverityLevelCounter.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/api/SeverityLevelCounter.java
@@ -38,7 +38,7 @@
      */
     public SeverityLevelCounter(SeverityLevel level) {
         if (level == null) {
-            throw new IllegalArgumentException();
+            throw new IllegalArgumentException("'level' cannot be null");
         }
         this.level = level;
     }
