diff --git a/test/com/google/inject/internal/TypeResolverTest.java b/test/com/google/inject/internal/TypeResolverTest.java
index 9bd994e..980bed3 100644
--- a/test/com/google/inject/internal/TypeResolverTest.java
+++ b/test/com/google/inject/internal/TypeResolverTest.java
@@ -153,7 +153,7 @@
   }
 
   public void testRelatedTypeVariables() {
-    TypeResolver resolver = new TypeResolver(arrayListOfString);
+    TypeResolver resolver = new TypeResolver(hasRelatedOfString);
     assertEquals(String.class, resolver.getParameterTypes(echo).get(0));
     assertEquals(String.class, resolver.getReturnType(echo));
   }
