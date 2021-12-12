diff --git a/jetty-start/src/main/java/org/eclipse/jetty/start/Props.java b/jetty-start/src/main/java/org/eclipse/jetty/start/Props.java
index f926d7e..6241509 100644
--- a/jetty-start/src/main/java/org/eclipse/jetty/start/Props.java
+++ b/jetty-start/src/main/java/org/eclipse/jetty/start/Props.java
@@ -155,7 +155,7 @@
         // special case for "$$"
         if (expanded.indexOf("$$") >= 0)
         {
-            return expanded.toString().replace("\\$\\$","\\$");
+            return expanded.toString().replaceAll("\\$\\$","\\$");
         }
 
         return expanded.toString();
