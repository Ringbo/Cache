diff --git a/xml/impl/src/com/intellij/application/options/CodeStyleHtmlPanel.java b/xml/impl/src/com/intellij/application/options/CodeStyleHtmlPanel.java
index 63d4c96..2f27a28 100644
--- a/xml/impl/src/com/intellij/application/options/CodeStyleHtmlPanel.java
+++ b/xml/impl/src/com/intellij/application/options/CodeStyleHtmlPanel.java
@@ -139,7 +139,7 @@
       }
 
       private ArrayList<String> createCollectionOn(final String data) {
-        if (data == null) {
+        if (data == null || data.trim().isEmpty()) {
           return new ArrayList<String>();
         }
         return new ArrayList<String>(Arrays.asList(data.split(",")));
