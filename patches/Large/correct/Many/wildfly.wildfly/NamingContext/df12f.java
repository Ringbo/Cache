diff --git a/naming/src/main/java/org/jboss/as/naming/NamingContext.java b/naming/src/main/java/org/jboss/as/naming/NamingContext.java
index d9c18c2..d773b59 100644
--- a/naming/src/main/java/org/jboss/as/naming/NamingContext.java
+++ b/naming/src/main/java/org/jboss/as/naming/NamingContext.java
@@ -389,7 +389,7 @@
 
     /** {@inheritDoc} */
     public Object lookupLink(String name) throws NamingException {
-        return lookup(parseName(name));
+        return lookupLink(parseName(name));
     }
 
     /** {@inheritDoc} */
