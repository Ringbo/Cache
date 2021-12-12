diff --git a/java/org/apache/jasper/compiler/TagPluginManager.java b/java/org/apache/jasper/compiler/TagPluginManager.java
index 3d2f205..007230d 100644
--- a/java/org/apache/jasper/compiler/TagPluginManager.java
+++ b/java/org/apache/jasper/compiler/TagPluginManager.java
@@ -85,11 +85,11 @@
         try {
             if (Constants.IS_SECURITY_ENABLED) {
                 PrivilegedSetTccl pa =
-                        new PrivilegedSetTccl(JspDocumentParser.class.getClassLoader());
+                        new PrivilegedSetTccl(TagPluginManager.class.getClassLoader());
                 AccessController.doPrivileged(pa);
             } else {
                 Thread.currentThread().setContextClassLoader(
-                        JspDocumentParser.class.getClassLoader());
+                        TagPluginManager.class.getClassLoader());
             }
 
             parser = new TagPluginParser(ctxt, blockExternal);
