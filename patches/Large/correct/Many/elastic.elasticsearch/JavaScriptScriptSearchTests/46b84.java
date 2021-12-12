diff --git a/src/test/java/org/elasticsearch/script/javascript/JavaScriptScriptSearchTests.java b/src/test/java/org/elasticsearch/script/javascript/JavaScriptScriptSearchTests.java
index ec41b10..31c5c2a 100644
--- a/src/test/java/org/elasticsearch/script/javascript/JavaScriptScriptSearchTests.java
+++ b/src/test/java/org/elasticsearch/script/javascript/JavaScriptScriptSearchTests.java
@@ -138,7 +138,7 @@
         assertThat(sObj2Arr2.get(0).toString(), equalTo("arr_value1"));
         assertThat(sObj2Arr2.get(1).toString(), equalTo("arr_value2"));
 
-        sObj2Arr2 = (List) response.getHits().getAt(0).field("s_obj2_arr2").value();
+        sObj2Arr2 = (List) response.getHits().getAt(0).field("s_obj2_arr2").values();
         assertThat(sObj2Arr2.size(), equalTo(2));
         assertThat(sObj2Arr2.get(0).toString(), equalTo("arr_value1"));
         assertThat(sObj2Arr2.get(1).toString(), equalTo("arr_value2"));
