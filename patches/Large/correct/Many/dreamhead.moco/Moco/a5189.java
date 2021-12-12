diff --git a/moco-core/src/main/java/com/github/dreamhead/moco/Moco.java b/moco-core/src/main/java/com/github/dreamhead/moco/Moco.java
index 96391aa..79f04a7 100644
--- a/moco-core/src/main/java/com/github/dreamhead/moco/Moco.java
+++ b/moco-core/src/main/java/com/github/dreamhead/moco/Moco.java
@@ -364,7 +364,7 @@
     }
 
     public static RequestMatcher xml(final String resource) {
-        return xml(text(checkNotNull(resource, "Resource should not be null")));
+        return xml(text(checkNotNullOrEmpty(resource, "Resource should not be null")));
     }
 
     public static RequestMatcher xml(final Resource resource) {
@@ -373,7 +373,7 @@
     }
 
     public static RequestMatcher json(final String jsonText) {
-        return json(text(checkNotNull(jsonText, "Json should not be null")));
+        return json(text(checkNotNullOrEmpty(jsonText, "Json should not be null")));
     }
 
     public static RequestMatcher json(final Object pojo) {
