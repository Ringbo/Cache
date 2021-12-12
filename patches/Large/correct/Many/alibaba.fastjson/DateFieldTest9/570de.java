diff --git a/src/test/java/com/alibaba/json/bvt/date/DateFieldTest9.java b/src/test/java/com/alibaba/json/bvt/date/DateFieldTest9.java
index 358a2ed..9f775e3 100644
--- a/src/test/java/com/alibaba/json/bvt/date/DateFieldTest9.java
+++ b/src/test/java/com/alibaba/json/bvt/date/DateFieldTest9.java
@@ -21,7 +21,7 @@
     public void test_tw() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"2016/05/06\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -35,7 +35,7 @@
     public void test_cn() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"2016-05-06\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -49,7 +49,7 @@
     public void test_cn_1() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"2016年5月6日\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -63,7 +63,7 @@
     public void test_cn_2() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"2016年5月06日\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -77,7 +77,7 @@
     public void test_cn_3() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"2016年05月6日\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -91,7 +91,7 @@
     public void test_cn_4() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"2016年05月06日\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -105,7 +105,7 @@
     public void test_kr_1() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"2016년5월6일\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -119,7 +119,7 @@
     public void test_kr_2() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"2016년5월06일\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -133,7 +133,7 @@
     public void test_kr_3() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"2016년05월6일\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -147,7 +147,7 @@
     public void test_kr_4() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"2016년05월06일\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -161,7 +161,7 @@
     public void test_de() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"06.05.2016\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
@@ -175,7 +175,7 @@
     public void test_in() throws Exception {
         Entity vo = JSON.parseObject("{\"date\":\"06-05-2016\"}", Entity.class);
 
-        Calendar calendar = Calendar.getInstance(JSON.defaultLocale);
+        Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
         calendar.setTime(vo.date);
         Assert.assertEquals(2016, calendar.get(Calendar.YEAR));
         Assert.assertEquals(4, calendar.get(Calendar.MONTH));
