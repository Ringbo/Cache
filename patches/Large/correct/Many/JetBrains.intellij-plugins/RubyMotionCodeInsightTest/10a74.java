diff --git a/ruby-motion/test/org/jetbrains/plugins/ruby/motion/RubyMotionCodeInsightTest.java b/ruby-motion/test/org/jetbrains/plugins/ruby/motion/RubyMotionCodeInsightTest.java
index ade9359..cada9c7 100644
--- a/ruby-motion/test/org/jetbrains/plugins/ruby/motion/RubyMotionCodeInsightTest.java
+++ b/ruby-motion/test/org/jetbrains/plugins/ruby/motion/RubyMotionCodeInsightTest.java
@@ -83,7 +83,7 @@
 
   public void testCompletion() throws Throwable {
     defaultConfigure();
-    assertInCompletionList("<caret>UIView", false, "animationDidStart", "animationDidStop:finished:");
+    assertInCompletionList("<caret>UIView", "animationDidStart", "animationDidStop:finished:");
   }
 
   public void testStricterCompletion() {
@@ -94,7 +94,7 @@
 
   public void testRakefileCompletion() throws Throwable {
     myFixture.configureByFiles("Rakefile", "app/app_delegate.rb");
-    assertInCompletionList("app.<caret>name", false, "status_bar_style=", "codesign_certificate");
+    assertInCompletionList("app.<caret>name", "status_bar_style=", "codesign_certificate");
   }
 
   public void testContextCompletion() throws Throwable {
