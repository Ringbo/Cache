diff --git a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/EndpointDslMojo.java b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/EndpointDslMojo.java
index fa7d29b..6ded0f2 100644
--- a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/EndpointDslMojo.java
+++ b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/EndpointDslMojo.java
@@ -572,7 +572,7 @@
             }
             JavaClass enumClass = enumClasses.get(enumClassName);
             if (enumClass == null) {
-                enumClass = javaClass.addNestedType().setPublic().setStatic(true)
+                enumClass = javaClass.addNestedType().setPackagePrivate().setStatic(true)
                                 .setName(enumClassName).setEnum(true);
                 enumClass.getJavaDoc().setText("Proxy enum for <code>" + type + "</code> enum.");
                 enumClasses.put(enumClassName, enumClass);
