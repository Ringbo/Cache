diff --git a/src/test/java/com/alibaba/druid/bvt/filter/wall/MySqlWallTest92.java b/src/test/java/com/alibaba/druid/bvt/filter/wall/MySqlWallTest92.java
index b450c96..32b5afa 100644
--- a/src/test/java/com/alibaba/druid/bvt/filter/wall/MySqlWallTest92.java
+++ b/src/test/java/com/alibaba/druid/bvt/filter/wall/MySqlWallTest92.java
@@ -34,7 +34,7 @@
     public void test_false() throws Exception {
         WallProvider provider = new MySqlWallProvider();
         
-        Assert.assertTrue(provider.checkValid(//
+        Assert.assertFalse(provider.checkValid(//
         "SELECT * FROM T WHERE FID = 40 OR EXTRACTVALUE(4484,CONCAT(0x5c,0x7163646371,(SELECT (CASE WHEN (4484=4484) THEN 1 ELSE 0 END)),0x7165767271))"));
 
         Assert.assertEquals(1, provider.getTableStats().size());
