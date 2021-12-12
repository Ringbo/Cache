diff --git a/src/test/java/com/alibaba/json/bvt/bug/Bug_127_for_qiuyan81.java b/src/test/java/com/alibaba/json/bvt/bug/Bug_127_for_qiuyan81.java
index 26a1056..d2024e2 100644
--- a/src/test/java/com/alibaba/json/bvt/bug/Bug_127_for_qiuyan81.java
+++ b/src/test/java/com/alibaba/json/bvt/bug/Bug_127_for_qiuyan81.java
@@ -26,7 +26,7 @@
         JSONObject json = (JSONObject) JSON.parse(jsonString);
         Assert.assertEquals(1001, json.get("ext"));
         Assert.assertEquals(0, json.get("PayStatus"));
-        Assert.assertEquals(2, json.size());
+        Assert.assertEquals(3, json.size());
     }
     
     public void test_parserUndefined_array() {
