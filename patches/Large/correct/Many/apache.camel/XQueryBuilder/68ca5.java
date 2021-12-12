diff --git a/components/camel-saxon/src/main/java/org/apache/camel/component/xquery/XQueryBuilder.java b/components/camel-saxon/src/main/java/org/apache/camel/component/xquery/XQueryBuilder.java
index ab7df82..e081695 100644
--- a/components/camel-saxon/src/main/java/org/apache/camel/component/xquery/XQueryBuilder.java
+++ b/components/camel-saxon/src/main/java/org/apache/camel/component/xquery/XQueryBuilder.java
@@ -241,7 +241,7 @@
         };
     }
 
-    public static XQueryBuilder xquery(File file, String characterSet) throws FileNotFoundException {
+    public static XQueryBuilder xquery(File file, String characterSet) throws IOException {
         return xquery(IOConverter.toInputStream(file), characterSet);
     }
 
@@ -249,7 +249,7 @@
         return xquery(IOConverter.toInputStream(url), characterSet);
     }
 
-    public static XQueryBuilder xquery(File file) throws FileNotFoundException {
+    public static XQueryBuilder xquery(File file) throws IOException {
         return xquery(IOConverter.toInputStream(file), ObjectHelper.getDefaultCharacterSet());
     }
 
