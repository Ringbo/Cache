diff --git a/moco-core/src/main/java/com/github/dreamhead/moco/Moco.java b/moco-core/src/main/java/com/github/dreamhead/moco/Moco.java
index 37af40b..96391aa 100644
--- a/moco-core/src/main/java/com/github/dreamhead/moco/Moco.java
+++ b/moco-core/src/main/java/com/github/dreamhead/moco/Moco.java
@@ -312,7 +312,7 @@
     }
 
     public static Resource uri(final String uri) {
-        return uriResource(checkNotNull(uri, "URI should not be null"));
+        return uriResource(checkNotNullOrEmpty(uri, "URI should not be null"));
     }
 
     public static Resource method(final String httpMethod) {
