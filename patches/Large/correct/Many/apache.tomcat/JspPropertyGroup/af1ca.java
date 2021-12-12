diff --git a/java/org/apache/tomcat/util/descriptor/web/JspPropertyGroup.java b/java/org/apache/tomcat/util/descriptor/web/JspPropertyGroup.java
index 2e27438..479af9f 100644
--- a/java/org/apache/tomcat/util/descriptor/web/JspPropertyGroup.java
+++ b/java/org/apache/tomcat/util/descriptor/web/JspPropertyGroup.java
@@ -85,11 +85,11 @@
     }
     public String getDefaultContentType() { return this.defaultContentType; }
 
-    private Integer buffer = null;
+    private String buffer = null;
     public void setBuffer(String buffer) {
-        this.buffer = Integer.valueOf(buffer);
+        this.buffer = buffer;
     }
-    public Integer getBuffer() { return this.buffer; }
+    public String getBuffer() { return this.buffer; }
 
     private Boolean errorOnUndeclaredNamespace = null;
     public void setErrorOnUndeclaredNamespace(
