diff --git a/python/src/com/jetbrains/python/buildout/config/BuildoutCfgParser.java b/python/src/com/jetbrains/python/buildout/config/BuildoutCfgParser.java
index 92063e9..6124ca5 100644
--- a/python/src/com/jetbrains/python/buildout/config/BuildoutCfgParser.java
+++ b/python/src/com/jetbrains/python/buildout/config/BuildoutCfgParser.java
@@ -80,7 +80,7 @@
     private void parseOption() {
       PsiBuilder.Marker option = myBuilder.mark();
       if (is(KEY_CHARACTERS)) {
-        doneAdvance(mark(), KEY_CHARACTERS);
+        doneAdvance(mark(), KEY);
       }
       if (is(KEY_VALUE_SEPARATOR)) {
         advance();
