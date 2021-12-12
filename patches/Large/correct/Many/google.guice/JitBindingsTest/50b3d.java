diff --git a/core/test/com/google/inject/JitBindingsTest.java b/core/test/com/google/inject/JitBindingsTest.java
index cd9a964..10ecb33 100644
--- a/core/test/com/google/inject/JitBindingsTest.java
+++ b/core/test/com/google/inject/JitBindingsTest.java
@@ -323,7 +323,12 @@
     });
     ensureWorks(child, Foo.class, Bar.class);
     ensureFails(child, ALLOW_BINDING, FooImpl.class);
-    ensureInChild(parent, FooImpl.class, FooBar.class, Foo.class);
+    ensureInChild(parent, FooImpl.class, Foo.class);
+    // TODO(sameb): FooBar may or may not be in a child injector, depending on if GC has run.
+    // We should fix failed child injectors to remove their contents from the parent blacklist
+    // immediately, rather than waiting on GC to do it.
+    // FooBar was succesfully inserted into the child injector (and parent blacklist), but then
+    // JIT bindings it depended on failed, making the child injector invalid.
     
     Injector grandchild = child.createChildInjector(new AbstractModule() {
       @Override
