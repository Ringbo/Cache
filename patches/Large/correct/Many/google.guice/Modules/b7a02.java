diff --git a/core/src/com/google/inject/util/Modules.java b/core/src/com/google/inject/util/Modules.java
index 70cab05..27eed97 100644
--- a/core/src/com/google/inject/util/Modules.java
+++ b/core/src/com/google/inject/util/Modules.java
@@ -100,7 +100,7 @@
    * Returns a new module that installs all of {@code modules}.
    */
   public static Module combine(Module... modules) {
-    return combine(ImmutableSet.of(modules));
+    return combine(ImmutableSet.copyOf(modules));
   }
 
   /**
