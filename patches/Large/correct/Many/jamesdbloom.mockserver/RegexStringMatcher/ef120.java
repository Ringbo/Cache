diff --git a/mockserver-core/src/main/java/org/mockserver/matchers/RegexStringMatcher.java b/mockserver-core/src/main/java/org/mockserver/matchers/RegexStringMatcher.java
index a78c40c..bb66f6b 100644
--- a/mockserver-core/src/main/java/org/mockserver/matchers/RegexStringMatcher.java
+++ b/mockserver-core/src/main/java/org/mockserver/matchers/RegexStringMatcher.java
@@ -29,7 +29,7 @@
                     result = true;
                 }
             } catch (PatternSyntaxException pse) {
-                logger.error("Error while matching regex [" + matcher + "] for string [" + matched + "] " + pse.getMessage());
+                logger.trace("Error while matching regex [" + matcher + "] for string [" + matched + "] " + pse.getMessage());
             }
             // match as regex - matched -> matcher
             try {
@@ -37,7 +37,7 @@
                     result = true;
                 }
             } catch (PatternSyntaxException pse) {
-                logger.error("Error while matching regex [" + matched + "] for string [" + matcher + "] " + pse.getMessage());
+                logger.trace("Error while matching regex [" + matched + "] for string [" + matcher + "] " + pse.getMessage());
             }
             // case insensitive comparison is mainly to improve matching in web containers like Tomcat that convert header names to lower case
             if (ignoreCase) {
@@ -47,7 +47,7 @@
                         result = true;
                     }
                 } catch (PatternSyntaxException pse) {
-                    logger.error("Error while matching regex [" + matcher.toLowerCase() + "] for string [" + matched.toLowerCase() + "] " + pse.getMessage());
+                    logger.trace("Error while matching regex [" + matcher.toLowerCase() + "] for string [" + matched.toLowerCase() + "] " + pse.getMessage());
                 }
                 // match as regex - matched -> matcher
                 try {
@@ -55,7 +55,7 @@
                         result = true;
                     }
                 } catch (PatternSyntaxException pse) {
-                    logger.error("Error while matching regex [" + matched.toLowerCase() + "] for string [" + matcher.toLowerCase() + "] " + pse.getMessage());
+                    logger.trace("Error while matching regex [" + matched.toLowerCase() + "] for string [" + matcher.toLowerCase() + "] " + pse.getMessage());
                 }
             }
         }
