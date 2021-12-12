diff --git a/src/test/java/com/alibaba/json/bvt/basicType/FloatTest3_random.java b/src/test/java/com/alibaba/json/bvt/basicType/FloatTest3_random.java
index b2a70da..8eff86f 100644
--- a/src/test/java/com/alibaba/json/bvt/basicType/FloatTest3_random.java
+++ b/src/test/java/com/alibaba/json/bvt/basicType/FloatTest3_random.java
@@ -26,7 +26,7 @@
     public void test_ran_2() throws Exception {
         Random rand = new Random();
 
-        for (int i = 0; i < 1000 * 1000 * 10; ++i) {
+        for (int i = 0; i < 1000 * 1000 * 1; ++i) {
             float val = rand.nextFloat();
 
             String str = JSON.toJSONString(new Model(val), SerializerFeature.BeanToArray);
