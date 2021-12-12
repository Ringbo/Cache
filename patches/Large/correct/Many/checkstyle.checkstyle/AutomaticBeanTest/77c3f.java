diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/api/AutomaticBeanTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/api/AutomaticBeanTest.java
index d632059..11c83ae 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/api/AutomaticBeanTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/api/AutomaticBeanTest.java
@@ -71,7 +71,7 @@
     public void testContextualize_InvocationTargetException() {
         final TestBean testBean = new TestBean();
         DefaultContext context = new DefaultContext();
-        context.add("exceptionalMethod", 123f);
+        context.add("exceptionalMethod", 123.0f);
         try {
             testBean.contextualize(context);
             fail();
