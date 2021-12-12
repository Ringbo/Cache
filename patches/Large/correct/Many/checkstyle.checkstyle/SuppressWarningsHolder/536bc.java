diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java
index da90b2f..cf423bb 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/SuppressWarningsHolder.java
@@ -52,8 +52,8 @@
      * Optional prefix for warning suppressions that are only intended to be
      * recognized by checkstyle. For instance, to suppress {@code
      * FallThroughCheck} only in checkstyle (and not in javac), use the
-     * suppression {@code "checkstyle:fallthrough"}. To suppress the warning in
-     * both tools, just use {@code "fallthrough"}.
+     * suppression {@code "checkstyle:fallthrough"} or {@code "checkstyle:FallThrough"}.
+     * To suppress the warning in both tools, just use {@code "fallthrough"}.
      */
     public static final String CHECKSTYLE_PREFIX = "checkstyle:";
 
@@ -163,7 +163,7 @@
                         .getLastColumn() >= column;
             final boolean nameMatches =
                 ALL_WARNING_MATCHING_ID.equals(entry.getCheckName())
-                    || entry.getCheckName().equals(checkAlias);
+                    || entry.getCheckName().equalsIgnoreCase(checkAlias);
             if (afterStart && beforeEnd && nameMatches) {
                 return true;
             }
