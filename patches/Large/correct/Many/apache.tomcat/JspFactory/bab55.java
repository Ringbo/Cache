diff --git a/java/javax/servlet/jsp/JspFactory.java b/java/javax/servlet/jsp/JspFactory.java
index 6deb49d..248f8c5 100644
--- a/java/javax/servlet/jsp/JspFactory.java
+++ b/java/javax/servlet/jsp/JspFactory.java
@@ -43,7 +43,7 @@
 
 public abstract class JspFactory {
 
-    private static JspFactory deflt = null;
+    private static volatile JspFactory deflt = null;
     
     /**
      * Sole constructor. (For invocation by subclass constructors, 
@@ -62,7 +62,7 @@
      * @param deflt        The default factory implementation
      */
 
-    public static synchronized void setDefaultFactory(JspFactory deflt) {
+    public static void setDefaultFactory(JspFactory deflt) {
         JspFactory.deflt = deflt;
     }
 
@@ -72,7 +72,7 @@
      * @return the default factory for this implementation
      */
 
-    public static synchronized JspFactory getDefaultFactory() {
+    public static JspFactory getDefaultFactory() {
         return deflt;
     }
 
