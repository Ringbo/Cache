diff --git a/src/web/org/openmrs/web/controller/user/UserFormController.java b/src/web/org/openmrs/web/controller/user/UserFormController.java
index 82e6b04..5a9aa36 100644
--- a/src/web/org/openmrs/web/controller/user/UserFormController.java
+++ b/src/web/org/openmrs/web/controller/user/UserFormController.java
@@ -256,7 +256,7 @@
 				}
 			}
             
-            if (StringUtils.hasLength(secretQuestion) || StringUtils.hasLength(secretAnswer)) {
+            if (StringUtils.hasLength(secretQuestion) && StringUtils.hasLength(secretAnswer)) {
             	us.changeQuestionAnswer(user, secretQuestion, secretAnswer);
             }
             
