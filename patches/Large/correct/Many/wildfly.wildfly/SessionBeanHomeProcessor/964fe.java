diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/SessionBeanHomeProcessor.java b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/SessionBeanHomeProcessor.java
index 1956312..64c1f67 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/SessionBeanHomeProcessor.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/deployment/processors/SessionBeanHomeProcessor.java
@@ -109,7 +109,7 @@
                             }
                         });
                         //add the interceptor
-                        configuration.addClientInterceptor(method, factory, InterceptorOrder.View.COMPONENT_DISPATCHER);
+                        configuration.addViewInterceptor(method, factory, InterceptorOrder.View.COMPONENT_DISPATCHER);
 
                     }
                 }
