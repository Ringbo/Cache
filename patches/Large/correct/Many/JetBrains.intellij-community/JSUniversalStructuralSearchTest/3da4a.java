diff --git a/plugins/structuralsearch/testSource/com/intellij/structuralsearch/JSUniversalStructuralSearchTest.java b/plugins/structuralsearch/testSource/com/intellij/structuralsearch/JSUniversalStructuralSearchTest.java
index 4df1083..978f92f 100644
--- a/plugins/structuralsearch/testSource/com/intellij/structuralsearch/JSUniversalStructuralSearchTest.java
+++ b/plugins/structuralsearch/testSource/com/intellij/structuralsearch/JSUniversalStructuralSearchTest.java
@@ -181,7 +181,7 @@
 
 
   public void testLoop() {
-    JSRootConfiguration.getInstance(getProject()).storeLanguageLevel(JSLanguageLevel.JS_1_7);
+    JSRootConfiguration.getInstance(getProject()).storeLanguageLevelAndUpdateCaches(JSLanguageLevel.JS_1_7);
     try {
       final JSLanguageDialect dialect = JSLanguageLevel.JS_1_7.getDialect();
       String s = "for (var i = 0; i < n ; i++) {\n" +
@@ -224,7 +224,7 @@
                 "}", 0, 0, dialect);
     }
     finally {
-      JSRootConfiguration.getInstance(getProject()).unsetLanguageLevel();
+      JSRootConfiguration.getInstance(getProject()).storeLanguageLevelAndUpdateCaches(null);
     }
   }
 
