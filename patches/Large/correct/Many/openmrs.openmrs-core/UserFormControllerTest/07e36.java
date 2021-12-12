diff --git a/test/web/org/openmrs/web/controller/user/UserFormControllerTest.java b/test/web/org/openmrs/web/controller/user/UserFormControllerTest.java
index 52f4f54..bef5287 100644
--- a/test/web/org/openmrs/web/controller/user/UserFormControllerTest.java
+++ b/test/web/org/openmrs/web/controller/user/UserFormControllerTest.java
@@ -42,7 +42,7 @@
 	    User user = controller.formBackingObject(request, null);
 	    user.addName(new PersonName("This", "is", "Test"));
 	    user.getPerson().setGender("F");
-	    controller.handleSubmission(request, new MockHttpSession(), new ModelMap(), "Save User", "pass123", "pass123", new String[0], user, new BindException(user, "user"));
+	    controller.handleSubmission(request, new MockHttpSession(), new ModelMap(), "Save User", "pass123", "pass123", new String[0], "true", user, new BindException(user, "user"));
     }
 	
 }
