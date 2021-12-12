diff --git a/plugins/ant/src/com/intellij/lang/ant/psi/impl/ReflectedProject.java b/plugins/ant/src/com/intellij/lang/ant/psi/impl/ReflectedProject.java
index 5f03867..ec82c9a 100644
--- a/plugins/ant/src/com/intellij/lang/ant/psi/impl/ReflectedProject.java
+++ b/plugins/ant/src/com/intellij/lang/ant/psi/impl/ReflectedProject.java
@@ -131,7 +131,7 @@
         myProject = null;
       }
     }
-    catch (Exception e) {
+    catch (Throwable e) {
       LOG.info(e);
       myProject = null;
     }
