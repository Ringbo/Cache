diff --git a/java/org/apache/catalina/filters/ExpiresFilter.java b/java/org/apache/catalina/filters/ExpiresFilter.java
index 5d06614..d5674899 100644
--- a/java/org/apache/catalina/filters/ExpiresFilter.java
+++ b/java/org/apache/catalina/filters/ExpiresFilter.java
@@ -1558,7 +1558,8 @@
                                 Integer.valueOf(amount), line));
             }
             DurationUnit durationUnit;
-            if ("years".equalsIgnoreCase(currentToken)) {
+            if ("year".equalsIgnoreCase(currentToken) ||
+                    "years".equalsIgnoreCase(currentToken)) {
                 durationUnit = DurationUnit.YEAR;
             } else if ("month".equalsIgnoreCase(currentToken) ||
                     "months".equalsIgnoreCase(currentToken)) {
