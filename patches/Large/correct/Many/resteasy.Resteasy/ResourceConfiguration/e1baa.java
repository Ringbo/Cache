diff --git a/jaxrs/resteasy-spring/src/test/java/org/jboss/resteasy/spring/beanprocessor/ResourceConfiguration.java b/jaxrs/resteasy-spring/src/test/java/org/jboss/resteasy/spring/beanprocessor/ResourceConfiguration.java
index 8c36ba9..491730e 100644
--- a/jaxrs/resteasy-spring/src/test/java/org/jboss/resteasy/spring/beanprocessor/ResourceConfiguration.java
+++ b/jaxrs/resteasy-spring/src/test/java/org/jboss/resteasy/spring/beanprocessor/ResourceConfiguration.java
@@ -21,7 +21,7 @@
    }
 
    @Bean
-   public Counter singletonCounter()
+   Counter singletonCounter()
    {
       return new Counter();
    }
