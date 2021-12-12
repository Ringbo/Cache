diff --git a/camel-core/src/test/java/org/apache/camel/impl/converter/MyConverters.java b/camel-core/src/test/java/org/apache/camel/impl/converter/MyConverters.java
index 726e7bc..7c2ff1c5 100644
--- a/camel-core/src/test/java/org/apache/camel/impl/converter/MyConverters.java
+++ b/camel-core/src/test/java/org/apache/camel/impl/converter/MyConverters.java
@@ -22,7 +22,7 @@
 public class MyConverters implements TypeConverters {
 
     @Converter
-    public static Country toCountry(String iso) {
+    public Country toCountry(String iso) {
         Country answer = new Country();
         answer.setIso("en");
         answer.setName("England");
@@ -30,7 +30,7 @@
     }
 
     @Converter
-    public static String toIso(Country country) {
+    public String toIso(Country country) {
         return country.getIso();
     }
 }
