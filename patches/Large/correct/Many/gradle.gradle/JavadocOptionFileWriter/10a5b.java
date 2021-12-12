diff --git a/subprojects/plugins/src/main/groovy/org/gradle/external/javadoc/internal/JavadocOptionFileWriter.java b/subprojects/plugins/src/main/groovy/org/gradle/external/javadoc/internal/JavadocOptionFileWriter.java
index 36be676..c1225ce 100644
--- a/subprojects/plugins/src/main/groovy/org/gradle/external/javadoc/internal/JavadocOptionFileWriter.java
+++ b/subprojects/plugins/src/main/groovy/org/gradle/external/javadoc/internal/JavadocOptionFileWriter.java
@@ -54,7 +54,7 @@
 
             final Map<String, JavadocOptionFileOption> optionsWithoutLocale = CollectionUtils.filter(options, new Spec<Map.Entry<String, JavadocOptionFileOption>>() {
                 public boolean isSatisfiedBy(Map.Entry<String, JavadocOptionFileOption> element) {
-                    return "locale".equals(element.getKey());
+                    return !"locale".equals(element.getKey());
                 }
             });
             for (final String option : optionsWithoutLocale.keySet()) {
