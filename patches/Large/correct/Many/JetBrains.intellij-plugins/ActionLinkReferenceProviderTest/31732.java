diff --git a/struts2/plugin/src-test/com/intellij/struts2/reference/jsp/ActionLinkReferenceProviderTest.java b/struts2/plugin/src-test/com/intellij/struts2/reference/jsp/ActionLinkReferenceProviderTest.java
index e4f5eb5..886cac1 100644
--- a/struts2/plugin/src-test/com/intellij/struts2/reference/jsp/ActionLinkReferenceProviderTest.java
+++ b/struts2/plugin/src-test/com/intellij/struts2/reference/jsp/ActionLinkReferenceProviderTest.java
@@ -67,15 +67,21 @@
     createStrutsFileSet("struts-actionLink.xml");
     myFixture.copyFileToProject("/WEB-INF/web.xml");
     myFixture.testCompletionVariants("/jsp/actionLink-completionvariants-namespace_given.jsp",
-                                     "actionLink1.action",
-                                     "actionLink2.action");
+                                     "/actionLink/",
+                                     "/actionLink/actionLink1.action",
+                                     "/actionLink/actionLink2.action");
   }
 
   public void testActionLinkCompletionVariantsNoNamespace() throws Throwable {
     createStrutsFileSet("struts-actionLink.xml");
     myFixture.copyFileToProject("/WEB-INF/web.xml");
     myFixture.testCompletionVariants("/jsp/actionLink-completionvariants-no-namespace.jsp",
-                                     "/", "/actionLink/");
+                                     "/",
+                                     "/WEB-INF",
+                                     "/actionLink-completionvariants-no-namespace.jsp",
+                                     "/actionLink/",
+                                     "/rootActionLink.action"
+    );
   }
 
   public void testActionLinkReferences() throws Throwable {
