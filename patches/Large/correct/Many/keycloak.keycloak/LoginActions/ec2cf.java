diff --git a/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/auth/page/login/LoginActions.java b/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/auth/page/login/LoginActions.java
index 4b3d2b0..484072c 100644
--- a/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/auth/page/login/LoginActions.java
+++ b/testsuite/integration-arquillian/tests/base/src/main/java/org/keycloak/testsuite/auth/page/login/LoginActions.java
@@ -40,11 +40,11 @@
     @FindBy(css = "div[id='kc-form-options'] span a")
     private WebElement backToLoginForm;
 
-    @FindBy(xpath = "//span[@class='kc-feedback-text' and text()]")
+    @FindBy(xpath = "//span[@class='kc-feedback-text' and string-length(text())>1]")
     private WebElement feedbackText;
     
     public String getFeedbackText() {
-        waitUntilElement(feedbackText, "Feedback message should be present").is().present();
+        waitUntilElement(feedbackText, "Feedback message should be present").is().visible();
         return feedbackText.getText();
     }
     
