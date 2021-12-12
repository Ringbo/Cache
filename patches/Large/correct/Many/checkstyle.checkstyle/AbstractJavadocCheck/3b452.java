diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractJavadocCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractJavadocCheck.java
index d2429dc..bd45bc7 100755
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractJavadocCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/AbstractJavadocCheck.java
@@ -646,7 +646,7 @@
          * @param messageKey message key
          * @param messageArguments message arguments
          */
-        public ParseErrorMessage(int lineNumber, String messageKey, Object ... messageArguments) {
+        ParseErrorMessage(int lineNumber, String messageKey, Object ... messageArguments) {
             this.lineNumber = lineNumber;
             this.messageKey = messageKey;
             this.messageArguments = messageArguments.clone();
