diff --git a/src/test/java/com/alibaba/json/bvt/support/spring/FastJsonHttpMessageConverterTest.java b/src/test/java/com/alibaba/json/bvt/support/spring/FastJsonHttpMessageConverterTest.java
index 54ca1da..7afd88a 100644
--- a/src/test/java/com/alibaba/json/bvt/support/spring/FastJsonHttpMessageConverterTest.java
+++ b/src/test/java/com/alibaba/json/bvt/support/spring/FastJsonHttpMessageConverterTest.java
@@ -34,7 +34,7 @@
         
         Assert.assertEquals(Charset.forName("UTF-8"), fastJsonConfig.getCharset());
 
-        Assert.assertEquals(1, fastJsonConfig.getFeatures().length);
+        Assert.assertEquals(0, fastJsonConfig.getFeatures().length);
         
         Method method = FastJsonHttpMessageConverter.class.getDeclaredMethod("supports", Class.class);
         method.setAccessible(true);
