diff --git a/java/org/apache/tomcat/util/modeler/ManagedBean.java b/java/org/apache/tomcat/util/modeler/ManagedBean.java
index 04a6daa..575c152 100644
--- a/java/org/apache/tomcat/util/modeler/ManagedBean.java
+++ b/java/org/apache/tomcat/util/modeler/ManagedBean.java
@@ -542,7 +542,7 @@
             Object object = null;
             NoSuchMethodException exception = null;
             try {
-                object = this;
+                object = bean;
                 m = object.getClass().getMethod(setMethod, signature);
             } catch (NoSuchMethodException e) {
                 exception = e;;
@@ -601,7 +601,7 @@
             Object object = null;
             Exception exception = null;
             try {
-                object = this;
+                object = bean;
                 method = object.getClass().getMethod(aname, types);
             } catch (NoSuchMethodException e) {
                 exception = e;
