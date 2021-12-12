diff --git a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/PackageDataFormatMojo.java b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/PackageDataFormatMojo.java
index 7df7a6b..06106ae 100644
--- a/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/PackageDataFormatMojo.java
+++ b/tooling/maven/camel-package-maven-plugin/src/main/java/org/apache/camel/maven/packaging/PackageDataFormatMojo.java
@@ -191,7 +191,7 @@
                                 // override description for camel-core, as otherwise its too generic
                                 if ("camel-core".equals(project.getArtifactId())) {
                                     if (row.containsKey("description")) {
-                                        dataFormatModel.setLabel(row.get("description"));
+                                        dataFormatModel.setDescription(row.get("description"));
                                     }
                                 }
                             }
