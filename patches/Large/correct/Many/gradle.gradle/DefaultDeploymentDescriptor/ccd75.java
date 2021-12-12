diff --git a/subprojects/ear/src/main/groovy/org/gradle/plugins/ear/descriptor/internal/DefaultDeploymentDescriptor.java b/subprojects/ear/src/main/groovy/org/gradle/plugins/ear/descriptor/internal/DefaultDeploymentDescriptor.java
index bcfc826..8ac7225 100644
--- a/subprojects/ear/src/main/groovy/org/gradle/plugins/ear/descriptor/internal/DefaultDeploymentDescriptor.java
+++ b/subprojects/ear/src/main/groovy/org/gradle/plugins/ear/descriptor/internal/DefaultDeploymentDescriptor.java
@@ -369,7 +369,7 @@
             root.setSystemId("http://java.sun.com/dtd/application_1_3.dtd");
         } else if (version.equals("1.4")) {
             root.attributes().put("xsi:schemaLocation", "http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/application_1_4.xsd");
-        } else if (version.equals("5") || version.equals("6")) {
+        } else if (version.equals("5") || version.equals("6") || version.equals("7")) {
             root.attributes().put("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/application_" + version + ".xsd");
         }
         if (applicationName != null) {
