diff --git a/catalog/camel-report-maven-plugin/src/main/java/org/apache/camel/maven/ValidateMojo.java b/catalog/camel-report-maven-plugin/src/main/java/org/apache/camel/maven/ValidateMojo.java
index c3fb6c7..39e644d 100644
--- a/catalog/camel-report-maven-plugin/src/main/java/org/apache/camel/maven/ValidateMojo.java
+++ b/catalog/camel-report-maven-plugin/src/main/java/org/apache/camel/maven/ValidateMojo.java
@@ -606,7 +606,7 @@
                 result = catalog.validateLanguagePredicate(null, "simple", detail.getSimple());
             } else {
                 getLog().debug("Validating simple expression: " + detail.getSimple());
-                result = catalog.validateLanguagePredicate(null, "simple", detail.getSimple());
+                result = catalog.validateLanguageExpression(null, "simple", detail.getSimple());
             }
             if (!result.isSuccess()) {
                 simpleErrors++;
