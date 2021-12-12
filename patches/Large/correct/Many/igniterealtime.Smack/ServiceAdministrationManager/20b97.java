diff --git a/smack-extensions/src/main/java/org/jivesoftware/smackx/admin/ServiceAdministrationManager.java b/smack-extensions/src/main/java/org/jivesoftware/smackx/admin/ServiceAdministrationManager.java
index 369ea7c..b88b9fd 100644
--- a/smack-extensions/src/main/java/org/jivesoftware/smackx/admin/ServiceAdministrationManager.java
+++ b/smack-extensions/src/main/java/org/jivesoftware/smackx/admin/ServiceAdministrationManager.java
@@ -85,7 +85,7 @@
         FormField passwordVerifyField = answerForm.getField("password-verify");
         passwordVerifyField.addValue(password);
 
-        command.next(answerForm);
+        command.execute(answerForm);
         assert (command.isCompleted());
     }
 
@@ -113,7 +113,7 @@
         FormField accountJids = answerForm.getField("accountjids");
         accountJids.addValues(JidUtil.toStringList(jidsToDelete));
 
-        command.next(answerForm);
+        command.execute(answerForm);
         assert (command.isCompleted());
     }
 }
