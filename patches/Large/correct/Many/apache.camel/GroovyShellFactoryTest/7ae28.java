diff --git a/components/camel-groovy/src/test/java/org/apache/camel/language/groovy/GroovyShellFactoryTest.java b/components/camel-groovy/src/test/java/org/apache/camel/language/groovy/GroovyShellFactoryTest.java
index 8fd6408..6811d52 100644
--- a/components/camel-groovy/src/test/java/org/apache/camel/language/groovy/GroovyShellFactoryTest.java
+++ b/components/camel-groovy/src/test/java/org/apache/camel/language/groovy/GroovyShellFactoryTest.java
@@ -38,7 +38,7 @@
         GroovyShellFactory groovyShellFactory = mock(GroovyShellFactory.class);
         given(groovyShellFactory.createGroovyShell(any(Exchange.class))).willReturn(new GroovyShell());
         SimpleRegistry registry = new SimpleRegistry();
-        registry.put("groovyShellFactory", groovyShellFactory);
+        registry.bind("groovyShellFactory", groovyShellFactory);
         CamelContext camelContext = new DefaultCamelContext(registry);
 
         // When
