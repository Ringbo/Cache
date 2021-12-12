diff --git a/java/org/apache/catalina/util/Introspection.java b/java/org/apache/catalina/util/Introspection.java
index 4167c28..0e5a1db 100644
--- a/java/org/apache/catalina/util/Introspection.java
+++ b/java/org/apache/catalina/util/Introspection.java
@@ -142,14 +142,14 @@
         try {
             clazz = cl.loadClass(className);
         } catch (ClassNotFoundException e) {
-            log.debug(sm.getString("introspection.classLoadFailed"), e);
+            log.debug(sm.getString("introspection.classLoadFailed", className), e);
         } catch (NoClassDefFoundError e) {
-            log.debug(sm.getString("introspection.classLoadFailed"), e);
+            log.debug(sm.getString("introspection.classLoadFailed", className), e);
         } catch (ClassFormatError e) {
-            log.debug(sm.getString("introspection.classLoadFailed"), e);
+            log.debug(sm.getString("introspection.classLoadFailed", className), e);
         } catch (Throwable t) {
             ExceptionUtils.handleThrowable(t);
-            log.debug(sm.getString("introspection.classLoadFailed"), t);
+            log.debug(sm.getString("introspection.classLoadFailed", className), t);
         }
         return clazz;
     }
