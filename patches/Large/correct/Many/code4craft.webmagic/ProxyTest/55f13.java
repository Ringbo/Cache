diff --git a/webmagic-core/src/test/java/us/codecraft/webmagic/proxy/ProxyTest.java b/webmagic-core/src/test/java/us/codecraft/webmagic/proxy/ProxyTest.java
index 13f33c5..ad2356b 100644
--- a/webmagic-core/src/test/java/us/codecraft/webmagic/proxy/ProxyTest.java
+++ b/webmagic-core/src/test/java/us/codecraft/webmagic/proxy/ProxyTest.java
@@ -30,7 +30,7 @@
 
 	@Test
 	public void testProxy() {
-		SimpleProxyPool proxyPool = new SimpleProxyPool(httpProxyList);
+		SimpleProxyPool proxyPool = new SimpleProxyPool(httpProxyList,false);
 		proxyPool.setReuseInterval(500);
 		assertThat(proxyPool.getIdleNum()).isEqualTo(4);
 		assertThat(new File(proxyPool.getProxyFilePath()).exists()).isEqualTo(true);
