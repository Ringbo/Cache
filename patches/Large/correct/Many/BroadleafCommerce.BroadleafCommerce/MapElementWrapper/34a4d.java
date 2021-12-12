diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/MapElementWrapper.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/MapElementWrapper.java
index 0984667..3b0d4c6 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/MapElementWrapper.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/MapElementWrapper.java
@@ -36,7 +36,7 @@
     protected String key;
 
     @XmlElement
-    protected Object value;
+    protected String value;
 
     public String getKey() {
         return key;
@@ -46,11 +46,11 @@
         this.key = key;
     }
 
-    public Object getValue() {
+    public String getValue() {
         return value;
     }
 
-    public void setValue(Object value) {
+    public void setValue(String value) {
         this.value = value;
     }
 }
