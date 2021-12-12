diff --git a/src/test/groovy/bugs/SeansBug.java b/src/test/groovy/bugs/SeansBug.java
index cc9c89a..44f30a9 100644
--- a/src/test/groovy/bugs/SeansBug.java
+++ b/src/test/groovy/bugs/SeansBug.java
@@ -51,7 +51,7 @@
      * Converts the array of lines of text into one string with newlines
      */
     protected String asCode(String[] lines) {
-        StringBuffer buffer = new StringBuffer();
+        StringBuilder buffer = new StringBuilder();
         for (int i = 0; i < lines.length; i++) {
             buffer.append(lines[i]);
             buffer.append("\n");
