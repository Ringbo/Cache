diff --git a/library/src/com/orm/StringUtil.java b/library/src/com/orm/StringUtil.java
index effb501..40fabf4 100644
--- a/library/src/com/orm/StringUtil.java
+++ b/library/src/com/orm/StringUtil.java
@@ -14,7 +14,7 @@
                     char nextChar = (i < buf.length - 1) ? buf[i + 1] : 0;
                     boolean isFirstChar = (i == 0);
 
-                    if (isFirstChar || Character.isLowerCase(c)) {
+                    if (isFirstChar || Character.isLowerCase(c) || Character.isDigit(c)) {
                             sb.append(Character.toUpperCase(c));
                     } else if (Character.isUpperCase(c)) {
                             if (Character.isLetterOrDigit(prevChar)) {
