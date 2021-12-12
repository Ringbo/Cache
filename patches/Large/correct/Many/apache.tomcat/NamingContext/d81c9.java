diff --git a/java/org/apache/naming/NamingContext.java b/java/org/apache/naming/NamingContext.java
index 7ca63e2..ec1f1e1 100644
--- a/java/org/apache/naming/NamingContext.java
+++ b/java/org/apache/naming/NamingContext.java
@@ -470,7 +470,7 @@
         
         if (name.size() > 1) {
             if (entry.type == NamingEntry.CONTEXT) {
-                ((Context) entry.value).unbind(name.getSuffix(1));
+                ((Context) entry.value).destroySubcontext(name.getSuffix(1));
             } else {
                 throw new NamingException
                     (sm.getString("namingContext.contextExpected"));
