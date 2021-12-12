diff --git a/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/AbstractProfileMojo.java b/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/AbstractProfileMojo.java
index 7d14954..d0c7b0a 100644
--- a/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/AbstractProfileMojo.java
+++ b/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/AbstractProfileMojo.java
@@ -207,7 +207,7 @@
         Set<Map.Entry<Object,Object>> entries = source.entrySet();
         for (Map.Entry<Object, Object> entry : entries) {
             Object key = entry.getKey();
-            Object value = entry.getKey();
+            Object value = entry.getValue();
             if (key != null && value != null) {
                 String keyText = key.toString();
                 String valueText = value.toString();
