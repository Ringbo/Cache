diff --git a/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntFileImpl.java b/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntFileImpl.java
index dfe59a2..e81137f 100644
--- a/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntFileImpl.java
+++ b/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntFileImpl.java
@@ -803,7 +803,7 @@
       return AntInstrospector.getInstance(c);
     }
     catch (Throwable e) {
-      LOG.error(e);// can't be
+      LOG.info(e);
     }
     return null;
   }
