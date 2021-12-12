diff --git a/plugins/groovy/test/org/jetbrains/plugins/groovy/intentions/style/parameterToEntry/ParameterToMapEntryTest.java b/plugins/groovy/test/org/jetbrains/plugins/groovy/intentions/style/parameterToEntry/ParameterToMapEntryTest.java
index 8fa073f..69e7adb 100644
--- a/plugins/groovy/test/org/jetbrains/plugins/groovy/intentions/style/parameterToEntry/ParameterToMapEntryTest.java
+++ b/plugins/groovy/test/org/jetbrains/plugins/groovy/intentions/style/parameterToEntry/ParameterToMapEntryTest.java
@@ -109,7 +109,7 @@
     Assert.assertTrue(condition.satisfiedBy(element));
 
     // Launch it!
-    intention.processIntention(element);
+    intention.processIntention(element, myFixture.getProject(), myFixture.getEditor());
     PostprocessReformattingAspect.getInstance(getProject()).doPostponedFormatting();
     final String result = file.getText();
     //System.out.println(result);
