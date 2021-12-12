diff --git a/subprojects/platform-base/src/main/java/org/gradle/language/base/internal/model/VariantsMetaData.java b/subprojects/platform-base/src/main/java/org/gradle/language/base/internal/model/VariantsMetaData.java
index 3c71bd5..79a3996 100644
--- a/subprojects/platform-base/src/main/java/org/gradle/language/base/internal/model/VariantsMetaData.java
+++ b/subprojects/platform-base/src/main/java/org/gradle/language/base/internal/model/VariantsMetaData.java
@@ -23,7 +23,7 @@
 
     Set<String> getDimensions();
 
-    Object getValueAsString(String dimension);
+    String getValueAsString(String dimension);
 
     <T extends Named> T getValueAsType(Class<T> clazz, String dimension);
 
