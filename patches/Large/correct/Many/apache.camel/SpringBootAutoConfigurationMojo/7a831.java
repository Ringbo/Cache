diff --git a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java
index 7230dfe..0980afc 100644
--- a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java
+++ b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/SpringBootAutoConfigurationMojo.java
@@ -1054,7 +1054,7 @@
                 prop.getField().getJavaDoc().setFullText(option.getDescription());
             }
             if (!Strings.isBlank(option.getDefaultValue())) {
-                if ("java.lang.String".equals(option.getType())) {
+                if ("java.lang.String".equals(option.getJavaType())) {
                     prop.getField().setStringInitializer(option.getDefaultValue());
                 } else if ("long".equals(option.getJavaType()) || "java.lang.Long".equals(option.getJavaType())) {
                     // the value should be a Long number
@@ -1149,7 +1149,7 @@
                 prop.getField().getJavaDoc().setFullText(option.getDescription());
             }
             if (!Strings.isBlank(option.getDefaultValue())) {
-                if ("java.lang.String".equals(option.getType())) {
+                if ("java.lang.String".equals(option.getJavaType())) {
                     prop.getField().setStringInitializer(option.getDefaultValue());
                 } else if ("long".equals(option.getJavaType()) || "java.lang.Long".equals(option.getJavaType())) {
                     // the value should be a Long number
