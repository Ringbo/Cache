diff --git a/core/src/com/google/inject/spi/ProvisionListenerBinding.java b/core/src/com/google/inject/spi/ProvisionListenerBinding.java
index 301d670..479e9f5 100644
--- a/core/src/com/google/inject/spi/ProvisionListenerBinding.java
+++ b/core/src/com/google/inject/spi/ProvisionListenerBinding.java
@@ -41,7 +41,7 @@
       ProvisionListener[] listeners) {
     this.source = source;
     this.keyMatcher = typeMatcher;
-    this.listeners = ImmutableList.of(listeners);
+    this.listeners = ImmutableList.copyOf(listeners);
   }
 
   /** Returns the registered listeners. */
