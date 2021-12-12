diff --git a/java/org/apache/catalina/startup/ContextConfig.java b/java/org/apache/catalina/startup/ContextConfig.java
index e2bbff2..80b81f3 100644
--- a/java/org/apache/catalina/startup/ContextConfig.java
+++ b/java/org/apache/catalina/startup/ContextConfig.java
@@ -2130,7 +2130,7 @@
         }
 
         if ((javaClass.getAccessFlags() &
-                org.apache.tomcat.util.bcel.Const.ACC_ANNOTATION) > 0) {
+                org.apache.tomcat.util.bcel.Const.ACC_ANNOTATION) != 0) {
             // Skip annotations.
             return;
         }
