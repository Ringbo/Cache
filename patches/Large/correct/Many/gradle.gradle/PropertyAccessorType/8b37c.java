diff --git a/subprojects/model-core/src/main/java/org/gradle/model/internal/manage/schema/extract/PropertyAccessorType.java b/subprojects/model-core/src/main/java/org/gradle/model/internal/manage/schema/extract/PropertyAccessorType.java
index 14e08e2..edd1572 100644
--- a/subprojects/model-core/src/main/java/org/gradle/model/internal/manage/schema/extract/PropertyAccessorType.java
+++ b/subprojects/model-core/src/main/java/org/gradle/model/internal/manage/schema/extract/PropertyAccessorType.java
@@ -125,7 +125,7 @@
     }
 
     private static boolean hasAtMostOneFirstLowerCaseCharStartingFrom(String methodName, int position) {
-        if (Character.isUpperCase(methodName.charAt(position - 1))) {
+        if (methodName.length() <= position || Character.isUpperCase(methodName.charAt(position - 1))) {
             return true;
         }
         return Character.isUpperCase(methodName.charAt(position));
