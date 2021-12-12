diff --git a/struts2/plugin/src-test/com/intellij/struts2/dom/struts/StrutsIntentionTest.java b/struts2/plugin/src-test/com/intellij/struts2/dom/struts/StrutsIntentionTest.java
index 795a466..ac2245a 100644
--- a/struts2/plugin/src-test/com/intellij/struts2/dom/struts/StrutsIntentionTest.java
+++ b/struts2/plugin/src-test/com/intellij/struts2/dom/struts/StrutsIntentionTest.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2008 The authors
+ * Copyright 2011 The authors
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
@@ -41,7 +41,7 @@
    */
   public void testCreateActionMethodIntention() throws Throwable {
     createStrutsFileSet("struts-action-method.xml");
-    final List<IntentionAction> list = myFixture.getAvailableIntentions("struts-action-method.xml");
+    final List<IntentionAction> list = myFixture.getAllQuickFixes("struts-action-method.xml");
 
     final IntentionAction action =
             CodeInsightTestUtil.findIntentionByText(list,
