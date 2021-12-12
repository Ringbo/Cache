diff --git a/java/org/apache/naming/factory/BeanFactory.java b/java/org/apache/naming/factory/BeanFactory.java
index 8df8bb5..e65da1a 100644
--- a/java/org/apache/naming/factory/BeanFactory.java
+++ b/java/org/apache/naming/factory/BeanFactory.java
@@ -149,7 +149,8 @@
                     String propName = ra.getType();
                     
                     if (propName.equals(Constants.FACTORY) ||
-                        propName.equals("scope") || propName.equals("auth")) {
+                        propName.equals("scope") || propName.equals("auth") ||
+                        propName.equals("singleton")) {
                         continue;
                     }
                     
