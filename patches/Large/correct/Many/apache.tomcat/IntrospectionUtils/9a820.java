diff --git a/java/org/apache/tomcat/util/IntrospectionUtils.java b/java/org/apache/tomcat/util/IntrospectionUtils.java
index 883cd1f..124eaf8 100644
--- a/java/org/apache/tomcat/util/IntrospectionUtils.java
+++ b/java/org/apache/tomcat/util/IntrospectionUtils.java
@@ -216,7 +216,7 @@
         } catch (InvocationTargetException ie) {
             ExceptionUtils.handleThrowable(ie.getCause());
             log.warn("IntrospectionUtils: InvocationTargetException for " +
-                    o.getClass() + " " + name + ")");
+                    o.getClass() + " " + name + ")", ie);
         }
         return null;
     }
