diff --git a/core/src/com/google/inject/internal/InjectorImpl.java b/core/src/com/google/inject/internal/InjectorImpl.java
index 320efb7..40cb77a 100644
--- a/core/src/com/google/inject/internal/InjectorImpl.java
+++ b/core/src/com/google/inject/internal/InjectorImpl.java
@@ -220,7 +220,7 @@
   }
 
   public Injector createChildInjector(Module... modules) {
-    return createChildInjector(ImmutableList.of(modules));
+    return createChildInjector(ImmutableList.copyOf(modules));
   }
 
   /**
