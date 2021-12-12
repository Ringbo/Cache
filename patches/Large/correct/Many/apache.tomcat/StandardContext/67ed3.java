diff --git a/java/org/apache/catalina/core/StandardContext.java b/java/org/apache/catalina/core/StandardContext.java
index a4fc64a..8f4543a 100644
--- a/java/org/apache/catalina/core/StandardContext.java
+++ b/java/org/apache/catalina/core/StandardContext.java
@@ -6026,7 +6026,7 @@
             if ((engineName == null) || (engineName.length() < 1))
                 engineName = "_";
 
-            String temp = getName();
+            String temp = getBaseName();
             if (temp.startsWith("/"))
                 temp = temp.substring(1);
             temp = temp.replace('/', '_');
