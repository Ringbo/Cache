diff --git a/core/src/com/google/inject/spi/InterceptorBinding.java b/core/src/com/google/inject/spi/InterceptorBinding.java
index 4d87157..a16e701 100644
--- a/core/src/com/google/inject/spi/InterceptorBinding.java
+++ b/core/src/com/google/inject/spi/InterceptorBinding.java
@@ -56,7 +56,7 @@
     this.source = checkNotNull(source, "source");
     this.classMatcher = checkNotNull(classMatcher, "classMatcher");
     this.methodMatcher = checkNotNull(methodMatcher, "methodMatcher");
-    this.interceptors = ImmutableList.of(interceptors);
+    this.interceptors = ImmutableList.copyOf(interceptors);
   }
 
   public Object getSource() {
