diff --git a/rt/frontend/jaxrs/src/test/java/org/apache/cxf/jaxrs/provider/AegisJSONProviderTest.java b/rt/frontend/jaxrs/src/test/java/org/apache/cxf/jaxrs/provider/AegisJSONProviderTest.java
index a59602b..bcd90f5 100644
--- a/rt/frontend/jaxrs/src/test/java/org/apache/cxf/jaxrs/provider/AegisJSONProviderTest.java
+++ b/rt/frontend/jaxrs/src/test/java/org/apache/cxf/jaxrs/provider/AegisJSONProviderTest.java
@@ -65,7 +65,7 @@
     @SuppressWarnings("unchecked")
     private void doTestRead(boolean setNsMap) throws Exception {
         AegisJSONProvider p = new AegisJSONProvider();
-        p.clearContexts();
+        AbstractAegisProvider.clearContexts();
         if (setNsMap) {
             Map<String, String> namespaceMap = new HashMap<String, String>();
             namespaceMap.put("http://fortest.jaxrs.cxf.apache.org", "ns1");
