diff --git a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/issue/ignore/IgnoreIssuesConfiguration.java b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/issue/ignore/IgnoreIssuesConfiguration.java
index b7e8092..d1ac261 100644
--- a/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/issue/ignore/IgnoreIssuesConfiguration.java
+++ b/plugins/sonar-core-plugin/src/main/java/org/sonar/plugins/core/issue/ignore/IgnoreIssuesConfiguration.java
@@ -57,7 +57,7 @@
     // static configuration declaration only
   }
 
-  static final int LARGE_SIZE = 20;
+  static final int LARGE_SIZE = 40;
   static final int SMALL_SIZE = 10;
 
   public static List<PropertyDefinition> getPropertyDefinitions() {
@@ -65,8 +65,8 @@
       PropertyDefinition.builder(PATTERNS_MULTICRITERIA_KEY)
         .category(CoreProperties.CATEGORY_EXCLUSIONS)
         .subCategory(SUB_CATEGORY_IGNORE_ISSUES)
-        .name("File Path Pattern")
-        .description("Patterns used to identify which violations to switch off.<br/>" +
+        .name("Multi-criteria exclusion patterns")
+        .description("Patterns used to identify which issues are ignored.<br/>" +
           CONFIG_DOCUMENTATION_LINK)
         .onQualifiers(Qualifiers.PROJECT)
         .index(3)
@@ -94,7 +94,7 @@
         .category(CoreProperties.CATEGORY_EXCLUSIONS)
         .subCategory(SUB_CATEGORY_IGNORE_ISSUES)
         .name("Block exclusion patterns")
-        .description("Patterns used to identify blocks in which violations are switched off.<br/>" +
+        .description("Patterns used to identify blocks in which issues are ignored.<br/>" +
           CONFIG_DOCUMENTATION_LINK)
         .onQualifiers(Qualifiers.PROJECT)
         .index(2)
@@ -116,14 +116,14 @@
         .category(CoreProperties.CATEGORY_EXCLUSIONS)
         .subCategory(SUB_CATEGORY_IGNORE_ISSUES)
         .name("File exclusion patterns")
-        .description("Patterns used to identify files in which violations are switched off.<br/>" +
+        .description("Patterns used to identify files in which issues are ignored.<br/>" +
           CONFIG_DOCUMENTATION_LINK)
         .onQualifiers(Qualifiers.PROJECT)
         .index(1)
         .fields(
           PropertyFieldDefinition.build(FILE_REGEXP)
             .name("Regular expression")
-            .description("If this regular expression is found in a file, then following lines are ignored.")
+            .description("If this regular expression is found in a file, then the whole file is ignored.")
             .type(PropertyType.STRING)
             .indicativeSize(LARGE_SIZE)
             .build())
