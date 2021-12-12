diff --git a/platform-impl/src/com/intellij/openapi/editor/impl/DocumentImpl.java b/platform-impl/src/com/intellij/openapi/editor/impl/DocumentImpl.java
index 16896826..c12e8ca 100644
--- a/platform-impl/src/com/intellij/openapi/editor/impl/DocumentImpl.java
+++ b/platform-impl/src/com/intellij/openapi/editor/impl/DocumentImpl.java
@@ -251,9 +251,12 @@
   }
 
   private static boolean rangeIntersect(int s1, int e1, int s2, int e2) {
-    return s2 < s1 && s1 < e2 || s2 < e1 && e1 < e2
-           || s1 < s2 && s2 < e1 || s1 < e2 && e2 < e1
-           || s1 == s2 && e1 == e2;
+    return s2 <= s1 && s1 < e2
+           || s2 < e1 && e1 <= e2
+           || s1 <= s2 && s2 < e1
+           || s1 < e2 && e2 <= e1
+           || s1==s2 && e1==e2
+           ;
   }
 
   @NotNull
