diff --git a/components/camel-reactive-streams/src/test/java/org/apache/camel/component/reactive/streams/CamelReactiveStreamsTest.java b/components/camel-reactive-streams/src/test/java/org/apache/camel/component/reactive/streams/CamelReactiveStreamsTest.java
index 418dc54..073b1a2 100644
--- a/components/camel-reactive-streams/src/test/java/org/apache/camel/component/reactive/streams/CamelReactiveStreamsTest.java
+++ b/components/camel-reactive-streams/src/test/java/org/apache/camel/component/reactive/streams/CamelReactiveStreamsTest.java
@@ -62,7 +62,7 @@
         ReactiveStreamsComponent component = new ReactiveStreamsComponent();
 
         SimpleRegistry registry = new SimpleRegistry();
-        registry.put("dummy", new ReactiveStreamsTestService("from-registry"));
+        registry.bind("dummy", new ReactiveStreamsTestService("from-registry"));
 
         DefaultCamelContext context = new DefaultCamelContext(registry);
         context.addComponent(ReactiveStreamsConstants.SCHEME, component);
