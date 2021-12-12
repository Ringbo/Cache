diff --git a/dubbo-common/src/test/java/com/alibaba/dubbo/common/URLTest.java b/dubbo-common/src/test/java/com/alibaba/dubbo/common/URLTest.java
index 9f37f45..a670c3c 100644
--- a/dubbo-common/src/test/java/com/alibaba/dubbo/common/URLTest.java
+++ b/dubbo-common/src/test/java/com/alibaba/dubbo/common/URLTest.java
@@ -43,7 +43,7 @@
         assertNull(url.getUsername());
         assertNull(url.getPassword());
         assertNull(url.getHost());
-        assertEquals(12, url.getPort());
+        assertEquals(0, url.getPort());
         assertEquals("context/path", url.getPath());
         assertEquals(2, url.getParameters().size());
         assertEquals("1.0.0", url.getParameter("version"));
