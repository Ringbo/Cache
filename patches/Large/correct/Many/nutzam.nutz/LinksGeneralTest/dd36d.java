diff --git a/test/org/nutz/dao/test/mapping/LinksGeneralTest.java b/test/org/nutz/dao/test/mapping/LinksGeneralTest.java
index 1843108..b83e165 100644
--- a/test/org/nutz/dao/test/mapping/LinksGeneralTest.java
+++ b/test/org/nutz/dao/test/mapping/LinksGeneralTest.java
@@ -24,7 +24,7 @@
     public void insert_links_with_exception() {
         Base b = Base.make("Red");
         dao.insert(b);
-        b.setCountry(Country.make(Strings.dup('C', 52)));
+        b.setCountry(Country.make(Strings.dup('C', 300)));
         dao.insertLinks(b, "country");
     }
 
