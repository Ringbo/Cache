diff --git a/plugins/google-app-engine/source/com/intellij/appengine/facet/AppEngineAccountDialog.java b/plugins/google-app-engine/source/com/intellij/appengine/facet/AppEngineAccountDialog.java
index 203f0c5..ce11695 100644
--- a/plugins/google-app-engine/source/com/intellij/appengine/facet/AppEngineAccountDialog.java
+++ b/plugins/google-app-engine/source/com/intellij/appengine/facet/AppEngineAccountDialog.java
@@ -64,7 +64,7 @@
       PasswordSafe.getInstance().storePassword(project, AppEngineAccountDialog.class, getPasswordKey(email), password);
     }
     catch (PasswordSafeException e) {
-      LOG.error(e);
+      LOG.info(e);
     }
   }
 
@@ -82,7 +82,7 @@
       return PasswordSafe.getInstance().getPassword(project, AppEngineAccountDialog.class, getPasswordKey(email));
     }
     catch (PasswordSafeException e) {
-      LOG.error(e);
+      LOG.info(e);
       return null;
     }
   }
