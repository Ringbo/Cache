diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/xhtmlim/XHTMLText.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/xhtmlim/XHTMLText.java
index a02345c..6a65f64 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/xhtmlim/XHTMLText.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/xhtmlim/XHTMLText.java
@@ -120,7 +120,7 @@
      * 
      */
     public XHTMLText appendBrTag() {
-        text.closeElement(BR);
+        text.emptyElement(BR);
         return this;
     }
 
