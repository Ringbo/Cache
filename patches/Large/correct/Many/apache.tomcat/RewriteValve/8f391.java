diff --git a/java/org/apache/catalina/valves/rewrite/RewriteValve.java b/java/org/apache/catalina/valves/rewrite/RewriteValve.java
index 29d6f5c..aa3582b 100644
--- a/java/org/apache/catalina/valves/rewrite/RewriteValve.java
+++ b/java/org/apache/catalina/valves/rewrite/RewriteValve.java
@@ -725,7 +725,7 @@
         } else if (flag.startsWith("qsappend") || flag.startsWith("QSA")) {
             rule.setQsappend(true);
         } else if (flag.startsWith("qsdiscard") || flag.startsWith("QSD")) {
-            rule.setQsappend(true);
+            rule.setQsdiscard(true);
         } else if (flag.startsWith("redirect") || flag.startsWith("R")) {
             rule.setRedirect(true);
             int redirectCode = HttpServletResponse.SC_FOUND;
