diff --git a/subprojects/logging/src/main/java/org/gradle/internal/logging/format/PrettyPrefixedLogHeaderFormatter.java b/subprojects/logging/src/main/java/org/gradle/internal/logging/format/PrettyPrefixedLogHeaderFormatter.java
index 540dcdd..1e2c532d 100644
--- a/subprojects/logging/src/main/java/org/gradle/internal/logging/format/PrettyPrefixedLogHeaderFormatter.java
+++ b/subprojects/logging/src/main/java/org/gradle/internal/logging/format/PrettyPrefixedLogHeaderFormatter.java
@@ -29,7 +29,7 @@
         final String message = header != null ? header : description;
         if (message != null) {
             // Visually indicate group by adding surrounding lines
-            return Lists.newArrayList(eol(), header(message, failed), status(status, failed), eol());
+            return Lists.newArrayList(header(message, failed), status(status, failed), eol());
         } else {
             return Collections.emptyList();
         }
