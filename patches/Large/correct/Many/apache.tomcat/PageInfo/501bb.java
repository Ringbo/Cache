diff --git a/java/org/apache/jasper/compiler/PageInfo.java b/java/org/apache/jasper/compiler/PageInfo.java
index 801099e..3d78db1 100644
--- a/java/org/apache/jasper/compiler/PageInfo.java
+++ b/java/org/apache/jasper/compiler/PageInfo.java
@@ -657,7 +657,7 @@
                 err.jspError(n, "jsp.error.tag.invalid.trimdirectivewhitespaces");
         }
 
-        deferredSyntaxAllowedAsLiteralValue = value;
+        trimDirectiveWhitespacesValue = value;
     }
 
     public void setELIgnored(boolean s) {
