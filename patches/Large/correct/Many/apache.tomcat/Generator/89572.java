diff --git a/java/org/apache/jasper/compiler/Generator.java b/java/org/apache/jasper/compiler/Generator.java
index 59f99a7..3180fd4 100644
--- a/java/org/apache/jasper/compiler/Generator.java
+++ b/java/org/apache/jasper/compiler/Generator.java
@@ -300,7 +300,7 @@
                 if (hasEmptyBody) {
                     poolName = poolName + "_nobody";
                 }
-                return JspUtil.makeXmlJavaIdentifier(poolName);
+                return JspUtil.makeJavaIdentifier(poolName);
             }
         }
 
@@ -2714,7 +2714,7 @@
                     varName = varName + "0";
                 }
             }
-            return JspUtil.makeXmlJavaIdentifier(varName);
+            return JspUtil.makeJavaIdentifier(varName);
         }
 
         private String evaluateAttribute(TagHandlerInfo handlerInfo,
