diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/AnkiFont.java b/AnkiDroid/src/main/java/com/ichi2/anki/AnkiFont.java
index 6a1c554..ffcd081 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/AnkiFont.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/AnkiFont.java
@@ -110,21 +110,21 @@
 
     public String getDeclaration() {
         StringBuilder sb = new StringBuilder("@font-face {");
-        sb.append(getCSS()).append(" src: url(\"file://").append(mPath).append("\");}");
+        sb.append(getCSS(false)).append(" src: url(\"file://").append(mPath).append("\");}");
         return sb.toString();
     }
 
 
-    public String getCSS() {
+    public String getCSS(boolean override) {
         StringBuilder sb = new StringBuilder("font-family: \"").append(mFamily);
-        if (mIsOverride) {
+        if (override) {
             sb.append("\" !important;");
         } else {
             sb.append("\";");
         }
         for (String attr : mAttributes) {
             sb.append(" ").append(attr);
-            if (mIsOverride) {
+            if (override) {
                 if (sb.charAt(sb.length() - 1) == ';') {
                     sb.deleteCharAt(sb.length() - 1);
                     sb.append(" !important;");
