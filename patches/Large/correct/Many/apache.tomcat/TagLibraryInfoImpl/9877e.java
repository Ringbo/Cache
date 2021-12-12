diff --git a/java/org/apache/jasper/compiler/TagLibraryInfoImpl.java b/java/org/apache/jasper/compiler/TagLibraryInfoImpl.java
index faad838..05372f9 100644
--- a/java/org/apache/jasper/compiler/TagLibraryInfoImpl.java
+++ b/java/org/apache/jasper/compiler/TagLibraryInfoImpl.java
@@ -278,11 +278,11 @@
 
         if (tlibversion == null) {
             err.jspError("jsp.error.tld.mandatory.element.missing",
-                    "tlib-version");
+                    "tlib-version", uri);
         }
         if (jspversion == null) {
             err.jspError("jsp.error.tld.mandatory.element.missing",
-                    "jsp-version");
+                    "jsp-version", uri);
         }
 
         this.tags = new TagInfo[tagVector.size()];
