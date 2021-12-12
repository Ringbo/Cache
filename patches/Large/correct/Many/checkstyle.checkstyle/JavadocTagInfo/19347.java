diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/api/JavadocTagInfo.java b/src/main/java/com/puppycrawl/tools/checkstyle/api/JavadocTagInfo.java
index 93b2823..5f4f3f0 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/api/JavadocTagInfo.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/api/JavadocTagInfo.java
@@ -566,7 +566,7 @@
     public static JavadocTagInfo fromText(final String text)
     {
         if (text == null) {
-            throw new NullPointerException("the text is null");
+            throw new IllegalArgumentException("the text is null");
         }
 
         final JavadocTagInfo tag = TEXT_TO_TAG.get(text);
@@ -590,7 +590,7 @@
     public static JavadocTagInfo fromName(final String name)
     {
         if (name == null) {
-            throw new NullPointerException("the name is null");
+            throw new IllegalArgumentException("the name is null");
         }
 
         final JavadocTagInfo tag = NAME_TO_TAG.get(name);
