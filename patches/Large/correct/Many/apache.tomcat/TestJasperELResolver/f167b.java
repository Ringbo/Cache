diff --git a/test/org/apache/jasper/el/TestJasperELResolver.java b/test/org/apache/jasper/el/TestJasperELResolver.java
index 9739228..4870155 100644
--- a/test/org/apache/jasper/el/TestJasperELResolver.java
+++ b/test/org/apache/jasper/el/TestJasperELResolver.java
@@ -58,9 +58,9 @@
 
         Assert.assertEquals(Integer.valueOf(count),
                 getField("appResolversSize", resolver));
-        Assert.assertEquals(8 + count,
+        Assert.assertEquals(9 + count,
                 ((ELResolver[])getField("resolvers", resolver)).length);
-        Assert.assertEquals(Integer.valueOf(8 + count),
+        Assert.assertEquals(Integer.valueOf(9 + count),
                 getField("size", resolver));
 
     }
