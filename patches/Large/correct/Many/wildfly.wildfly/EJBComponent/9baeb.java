diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/component/EJBComponent.java b/ejb3/src/main/java/org/jboss/as/ejb3/component/EJBComponent.java
index 638730a..74f6c3c 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/component/EJBComponent.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/component/EJBComponent.java
@@ -285,7 +285,7 @@
         try {
             return jndiContext.lookup(namespaceStrippedJndiName);
         } catch (NamingException ne) {
-            throw new RuntimeException("Could not lookup jndi name: " + namespaceStrippedJndiName + " in context: " + jndiContext, ne);
+            throw new IllegalArgumentException("Could not lookup jndi name: " + namespaceStrippedJndiName + " in context: " + jndiContext, ne);
         }
     }
 
