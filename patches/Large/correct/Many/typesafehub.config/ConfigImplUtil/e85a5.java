diff --git a/config/src/main/java/com/typesafe/config/impl/ConfigImplUtil.java b/config/src/main/java/com/typesafe/config/impl/ConfigImplUtil.java
index 5ea6553..fde0341 100644
--- a/config/src/main/java/com/typesafe/config/impl/ConfigImplUtil.java
+++ b/config/src/main/java/com/typesafe/config/impl/ConfigImplUtil.java
@@ -78,8 +78,10 @@
         if (s.length() == 0)
             return renderJsonString(s);
 
+        // if it starts with a hyphen or number, we have to quote
+        // to ensure we end up with a string and not a number
         int first = s.codePointAt(0);
-        if (Character.isDigit(first))
+        if (Character.isDigit(first) || first == '-')
             return renderJsonString(s);
 
         if (s.startsWith("include") || s.startsWith("true") || s.startsWith("false")
@@ -89,7 +91,7 @@
         // only unquote if it's pure alphanumeric
         for (int i = 0; i < s.length(); ++i) {
             char c = s.charAt(i);
-            if (!(Character.isLetter(c) || Character.isDigit(c)))
+            if (!(Character.isLetter(c) || Character.isDigit(c) || c == '-'))
                 return renderJsonString(s);
         }
 
